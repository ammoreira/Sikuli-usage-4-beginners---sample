package sikuliUtils;

public class Configuration {

		private String imgPath;
		private float similarity;
		private int timeout;
		
		public Configuration(){
			this.imgPath = null;
			this.similarity = (float) .8; //default
			this.timeout = 5; //default	
		}
		 
		public void setImageConfigurations(String imgPath, float similarity, int timeout) {
			this.imgPath = imgPath;
			this.similarity = similarity;
			this.timeout = timeout;
		}
		
		public void setImagePath(String imgPath) {
			this.imgPath = imgPath;
		}

		public void setSimilarity(float similarity) {
			this.similarity = similarity;
		}
      
		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}
		
		public String getImagePath() {
			return (imgPath);			
		}
	
		public float getSimilarity() {
			return similarity;
		}

		public int getTimeout() {
			return timeout;
		}	
}
