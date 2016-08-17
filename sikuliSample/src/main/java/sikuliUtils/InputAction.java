package sikuliUtils;

import resources.SikuliInitialization;

public class InputAction extends SikuliInitialization {

	private void type(String inputMessage) {
		try {
			screen.type(inputMessage);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void typeString(String imgPath, float similarity, String inputMessage) {
		pattern.setFilename(sikuliConfig.getImagePath()).similar(sikuliConfig.getSimilarity());
		sikuliConfig.setImageConfigurations(imgPath, similarity, Timeout.NONE);
		this.type(inputMessage);
	}
	
	public void typeRaw(String input) {
		this.type(input);
	}
}

