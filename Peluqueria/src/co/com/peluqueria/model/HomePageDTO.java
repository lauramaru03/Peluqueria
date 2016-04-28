package co.com.peluqueria.model;


import java.io.Serializable;
import java.util.List;



public class HomePageDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6263769487704504062L;
	
	private List<String> imagePath;
	
	public String service1;
	
	public String service2;
	
	public String service3;
	
	public String descService1;
	
	public String descService2;
	
	public String descService3;
	
	public String imageService1;
	
	public String imageService2;
	
	public String imageService3;
	
	public String viewDetails;
	
	public String getViewDetails() {
		return viewDetails;
	}

	public void setViewDetails(String viewDetails) {
		this.viewDetails = viewDetails;
	}

	public String getService1() {
		return service1;
	}

	public void setService1(String service1) {
		this.service1 = service1;
	}

	public String getService2() {
		return service2;
	}

	public void setService2(String service2) {
		this.service2 = service2;
	}

	public String getService3() {
		return service3;
	}

	public void setService3(String service3) {
		this.service3 = service3;
	}

	public String getDescService1() {
		return descService1;
	}

	public void setDescService1(String descService1) {
		this.descService1 = descService1;
	}

	public String getDescService2() {
		return descService2;
	}

	public void setDescService2(String descService2) {
		this.descService2 = descService2;
	}

	public String getDescService3() {
		return descService3;
	}

	public void setDescService3(String descService3) {
		this.descService3 = descService3;
	}

	
	public String getImageService1() {
		return imageService1;
	}

	public void setImageService1(String imageService1) {
		this.imageService1 = imageService1;
	}

	public String getImageService2() {
		return imageService2;
	}

	public void setImageService2(String imageService2) {
		this.imageService2 = imageService2;
	}

	public String getImageService3() {
		return imageService3;
	}

	public void setImageService3(String imageService3) {
		this.imageService3 = imageService3;
	}


	private List<SessionHomePageDTO> sessionHomePageDTOList;
	
	public List<String> getImagePath() {
		return imagePath;
	}

	public void setImagePath(List<String> imagePath) {
		this.imagePath = imagePath;
	}

	public List<SessionHomePageDTO> getSessionFirstPageDTOList() {
		return sessionHomePageDTOList;
	}

	public void setSessionFirstPageDTOList(
			List<SessionHomePageDTO> sessionFirstPageDTOList) {
		this.sessionHomePageDTOList = sessionFirstPageDTOList;
	}
	

}
