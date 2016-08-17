package sikuliUtils;

import org.sikuli.script.*;
import resources.SikuliInitialization;

public class CheckAction extends SikuliInitialization {

	private void waitPattern()
	{
		try
		{
			// Wait for image Pattern
			screen.wait(pattern.setFilename(sikuliConfig.getImagePath()).similar(sikuliConfig.getSimilarity()), sikuliConfig.getTimeout());
		}
		catch (FindFailed e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitPattern(String imgPath, float similarity, int timeout)
	{
			sikuliConfig.setImageConfigurations(imgPath, similarity, timeout);
			this.waitPattern();
	}
	
	private boolean screenExists()
	{
		try {
				if(screen.exists(pattern.setFilename(sikuliConfig.getImagePath()).similar(sikuliConfig.getSimilarity()),sikuliConfig.getTimeout()) != null) {
					return true;
				} else {
					return false;
				}
		} catch (Exception e) {
			// TODO: handle exception
			return false;
	    }
	}

	public boolean screenExists(String imgPath, float similarity, int timeout)
	{
		sikuliConfig.setImageConfigurations(imgPath, similarity, timeout);
		return this.screenExists();  
	}

}
