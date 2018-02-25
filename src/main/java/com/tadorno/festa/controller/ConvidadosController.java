package com.tadorno.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tadorno.festa.model.Convidado;
import com.tadorno.festa.repository.ConvidadoRepository;

@Controller	
public class ConvidadosController {

	@Autowired
	private ConvidadoRepository convidados;

	@GetMapping("/teste")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("listar-convidados");
		mv.addObject("convidados", this.convidados.findAll());
		mv.addObject(new Convidado());

		return mv;
	}
	
	@PostMapping("/")
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/";

	}
}
