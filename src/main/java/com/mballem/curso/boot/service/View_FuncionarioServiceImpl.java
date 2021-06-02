package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballem.curso.boot.dao.View_FuncionarioDao;
import com.mballem.curso.boot.domain.View_funcionarios;

@Service
public class View_FuncionarioServiceImpl implements View_FuncionariosService {
	
	@Autowired
	private View_FuncionarioDao dao;
	
	@Override
	public List<View_funcionarios> buscarTodos() {
		
		return dao.findAll();
	}

}
