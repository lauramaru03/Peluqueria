package co.com.peluqueria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.peluqueria.model.HomePageDTO;

public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home() {
		
		HomePageDTO homePageDTO= new HomePageDTO();
		
		List<String> imagePath = new ArrayList<String>();
		imagePath.add("resources/images/peluqueria4.jpg");
		imagePath.add("resources/images/peluqueria5.jpg");
		imagePath.add("resources/images/peluqueria6.jpg");
	
		homePageDTO.setImagePath(imagePath);
		
		return new ModelAndView("index", "model",homePageDTO );
	}

}
