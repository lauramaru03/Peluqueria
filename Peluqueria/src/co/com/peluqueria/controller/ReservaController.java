package co.com.peluqueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.peluqueria.model.EmpleadoDTO;
import co.com.peluqueria.model.ReservaDTO;
import co.com.peluqueria.services.PeluqueriaFacade;

	@Controller
	public class ReservaController {
	
	PeluqueriaFacade peluqueriaFacade = new PeluqueriaFacade();
	
	@RequestMapping(value="/reserva", method=RequestMethod.POST)
	public ModelAndView reserva(@ModelAttribute("model") ReservaDTO reservaDTO) {
				
	return new ModelAndView("reserva", "reserva", peluqueriaFacade.findReserva());
					
	
	
	}
	
	/*@RequestMapping(value="/crearReserva",method=RequestMethod.POST)
	public String crearReserva(@ModelAttribute("SpringWeb")ReservaDTO reserva ,ModelMap model){
		model.addAttribute("fecha",reserva.getDate());
		model.addAttribute("servicio",reserva.getServicio_id());
		model.addAttribute("lugar", reserva.getLugar_id());
		model.addAttribute("empleado", reserva.getEmpleado_id());
		model.addAttribute("hora",reserva.getHour());
		
		return "detalleReserva";
		
	}*/
	

}
