package TestGoesHere.vpn;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;

import resources.SikuliInitialization;
import sikuliUtils.Similarity;
import sikuliUtils.Timeout;

public class TestNotepadForJesus extends SikuliInitialization {  
	
	final String notepadPath = "C:/Program Files (x86)/Notepad++/notepad++.exe";
	boolean notepadStarted = false;  
	App notepad;

	@Before
	public void beforeMethod() throws FindFailed, InterruptedException, IOException {
		System.out.println("[Dev Log] Starting notepad ++ ");
		notepad = new App(notepadPath);
		notepad.open();
		if(notepad.isRunning() == true) {
			System.out.println("[Dev Log] notepad ++ is Running, waiting for window pop up ");
			notepadStarted = true;
		} else {
			notepadStarted = false;
		}
	}

	@After
	public void afterMethod() throws FindFailed, InterruptedException {
		notepad.close();
	}
	
	@Test
	public void NotepadTest() throws FindFailed, InterruptedException {

		final String notepadLogo = "img/notepad/notepadLogo.png";
		final String newFile = "img/notepad/newFile.png";		
		final String firstLine = "img/notepad/firstLine.png";
		final String firstMessageToJesus = "By Muradin's Beard, here goes the test";
		final String username = "Username: JESUS"; 
		final String password = "Password: Bl@ck Met@l";
		final String andreSigningOff = "hell yeah, hope it helped"; 
		
		
		if(notepadStarted == false){
			
			System.out.println("[Dev Log] notepad App not found, be sure it is installed using the default path");
			Assert.assertTrue(false);
						
		} else {
			if (sikuliCheck.screenExists(notepadLogo, Similarity.MAX, Timeout.TEN) == true){
				System.out.println("[Dev Log] Notepad ready ");
				
				if (sikuliCheck.screenExists(newFile, Similarity.ninetyPercent, Timeout.FIVE) == true){
					sikuliAction.click(newFile, Similarity.ninetyPercent);
				}	
				if (sikuliCheck.screenExists(firstLine, Similarity.ninetyPercent, Timeout.TEN) == true){
					sikuliInput.typeString(firstLine, Timeout.TWO, firstMessageToJesus);
					sikuliInput.typeRaw(Key.ENTER + Key.TAB + username + Key.ENTER + Key.BACKSPACE + Key.TAB + password + Key.ENTER + Key.ENTER + andreSigningOff);
				}
				Thread.sleep(3000);
			}
		}
	}
}
