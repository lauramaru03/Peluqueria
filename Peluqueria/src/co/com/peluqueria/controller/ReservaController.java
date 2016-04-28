package co.com.peluqueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.peluqueria.model.Reserva;


@Controller
public class ReservaController {
	
	@RequestMapping(value="/reserva",method=RequestMethod.GET)
	public ModelAndView reservas(){
		
		return new ModelAndView("reserva","command",new Reserva());

	}
	@RequestMapping(value="/crearReserva",method=RequestMethod.POST)
	public String crearReserva(@ModelAttribute("SpringWeb")Reserva reserva ,ModelMap model){
		model.addAttribute("fecha",reserva.getFecha());
		model.addAttribute("servicio",reserva.getServicio());
		model.addAttribute("salon", reserva.getSalon());
		model.addAttribute("asociado", reserva.getAsociado());
		model.addAttribute("hora",reserva.getHora());
		
		return "detalleReserva";
		
	}

}
