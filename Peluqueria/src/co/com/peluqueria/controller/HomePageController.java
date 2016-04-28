package co.com.peluqueria.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.peluqueria.model.HomePageDTO;
import co.com.peluqueria.model.SessionHomePageDTO;

@Controller
public class HomePageController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home() {
		
		HomePageDTO homePageDTO= new HomePageDTO();
		
		List<String> imagePath = new ArrayList<String>();
		imagePath.add("resources/images/peluqueria4.jpg");
		imagePath.add("resources/images/peluqueria5.jpg");
		imagePath.add("resources/images/peluqueria6.jpg");
	
		homePageDTO.setImagePath(imagePath);
		
		String service1 = "Peinados";
		homePageDTO.setService1(service1);
		
		String service2 = "Cortes";
		homePageDTO.setService2(service2);
		
		String service3 = "Maquillaje";
		homePageDTO.setService3(service3);
		
		String descService1="Peinados para mujeres y niñas. Nuestra sala de belleza le ofrece una gran variedad de peinados para todo tipo de ocasion: fiestas, quinces, matrimonios, grados, primeras comuniones.Ademas de una completa asesoria por parte del personal.";
		homePageDTO.setDescService1(descService1);
		
		String descService2="Cortes de Cabello para hombres, mujeres y niños. Nuestra sala de belleza, le ofrece variedad de cortes de cabello que se adapten a su rostro y a su estilo de cabello:corto o largo. Ademas de una completa asesoria por parte del personal.";
		homePageDTO.setDescService2(descService2);
		
		String descService3="Maquillaje para mujeres y niñas. Nuestra sala de belleza, le ofrece variedad de tecnicas de maquillaje facial con multiples paletas de colores que se adapten a su color y tipo de piel. Ademas de una completa asesoria por parte del personal. ";
		homePageDTO.setDescService3(descService3);
		
		String imageService1="resources/images/peinado.jpg";
		homePageDTO.setImageService1(imageService1);
		
		String imageService2="resources/images/corte2.jpg";
		homePageDTO.setImageService2(imageService2);
		
		String imageService3="resources/images/maquillaje1.jpg";
		homePageDTO.setImageService3(imageService3);
		
		String viewDetails="Ver Detalles";
		homePageDTO.setViewDetails(viewDetails);
		
		return new ModelAndView("index", "model",homePageDTO );
	}

	

}
