package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataTableController {
	
	@RequestMapping("/datatable")
	public String datatable() {
		return ("datatable");
	}

}
