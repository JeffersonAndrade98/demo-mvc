/*
 * package com.mballem.curso.boot.web.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.mballem.curso.boot.service.View_FuncionariosService; import
 * com.mballem.curso.boot.service.vw_auditoriaService;
 * 
 * @Controller
 * 
 * @RequestMapping("/aud_funcionarios") public class vw_auditoriaController {
 * 
 * @Autowired private vw_auditoriaService S;
 * 
 * @GetMapping("/listar") public String listar(ModelMap model) {
 * model.addAttribute("listarauditoria", S.buscarTodos());
 * 
 * return "auditoria/aud_list"; }
 * 
 * }
 */