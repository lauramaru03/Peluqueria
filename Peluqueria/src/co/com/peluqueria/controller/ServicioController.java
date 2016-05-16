package co.com.peluqueria.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.peluqueria.model.ServicioDTO;
import co.com.peluqueria.services.PeluqueriaFacade;

@Controller
public class ServicioController {
	
	PeluqueriaFacade peluqueriaFacade = new PeluqueriaFacade();
	
	@RequestMapping(value="/servicio", method=RequestMethod.POST)
	public ModelAndView servicio(@ModelAttribute("model") ServicioDTO servicioDTO) {
				
	return new ModelAndView("servicios", "servicio", peluqueriaFacade.findServicio());
					
		
	}
	
	
	}

