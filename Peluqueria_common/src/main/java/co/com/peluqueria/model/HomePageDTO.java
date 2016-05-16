package co.com.peluqueria.model;


import java.io.Serializable;
import java.util.List;



public class HomePageDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6263769487704504062L;
	
	private List<String> imagePath;

	public List<String> getImagePath() {
		return imagePath;
	}

	public void setImagePath(List<String> imagePath) {
		this.imagePath = imagePath;
	}
	
}
	
	
	
