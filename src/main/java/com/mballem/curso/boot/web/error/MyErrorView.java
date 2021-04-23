package com.mballem.curso.boot.web.error;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyErrorView implements ErrorViewResolver {
	
	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> map) {
		
		ModelAndView model = new ModelAndView("/error");
		model.addObject("status", status.value());
		switch (status.value()) {
		
		case 400: 
			model.addObject("error", "Erro inseperado");
			model.addObject("message", "O parâmetro de solicitação necessário {tal} para o tipo de parâmetro do método {tal} está presente, mas foi convertido em nulo");
			break;
		
		case 404: 
			model.addObject("error", "Página não encontrada :(");
			model.addObject("message", "A url da página '" + map.get("path") + "' não existe.");
			break;
		
		case 405: 
			model.addObject("error", "Nada para alterar por aqui!");
			model.addObject("message", "Nenhum registro foi selecionado para ser alterado.");
			break;
			
		case 500: 
			model.addObject("error", "Ocorreu um erro interno no servidor :(");
			model.addObject("message", "Ocorreu um erro inesperado, tente mais tarde.");
			break;
		
		default: 
			model.addObject("error", map.get("error"));
			model.addObject("message", map.get("message"));
			break;
		}
		return model;
	}

}