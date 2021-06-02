package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.View_funcionarios;

public interface View_FuncionarioDao {
	
	List<View_funcionarios> findAll();

}
