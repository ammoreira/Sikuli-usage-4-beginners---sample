package resources;

import org.sikuli.script.Screen;

import sikuliUtils.GenericAction;
import sikuliUtils.CheckAction;
import sikuliUtils.Configuration;
import sikuliUtils.InputAction;

import org.sikuli.script.Pattern;

public class SikuliInitialization {

//sikuli	
public static Screen screen = new Screen();
public static Pattern pattern = new Pattern();

//Support Classes
public static Configuration sikuliConfig = new Configuration();
public static GenericAction sikuliAction  = new GenericAction();
public static CheckAction sikuliCheck  = new CheckAction();
public static InputAction sikuliInput  = new InputAction();
}
