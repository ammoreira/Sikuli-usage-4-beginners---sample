package sikuliUtils;

import resources.SikuliInitialization;

/**
 * @author Andre Moreira
 * Basic operations 
 * GenericAction Class
 * input: imagePath String, similarity float, delay long
  */

public class GenericAction extends SikuliInitialization {	

	private void click()
	{
		if (screen.exists(pattern.setFilename(sikuliConfig.getImagePath()).similar(sikuliConfig.getSimilarity()), sikuliConfig.getTimeout()) != null) {
			try {
				screen.click(pattern.setFilename(sikuliConfig.getImagePath()).similar(sikuliConfig.getSimilarity()));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void click(String imgPath, float similarity)
	{
		sikuliConfig.setImageConfigurations(imgPath, similarity, Timeout.THREE);
		this.click();
	}
}
