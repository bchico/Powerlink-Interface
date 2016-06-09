package org.sturtevantauto.robot;

import java.awt.AWTException;
import java.awt.Robot;

public class PartsEntry {
	
	public static void enterParts(String partnum, int partprice, String stocknum, String partcond) throws AWTException
	{
		Keyboard keyboard = new Keyboard();
		Robot r = new Robot();
		r.delay(2000);
		keyboard.type(partnum + "\n");  //Enters part number and waits for the program to load.
		r.delay(500);
        keyboard.type("\t1\t" + stocknum + "\t\t\t\t\t");  //Enters stock number and store 1 as location.
        r.delay(2000);
        keyboard.type(partprice + "\t\t" + partcond + "\t\t\t\t\tY\tEAST\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");  //Types price, sets
        														// it to Y location, EAST, and finishes the entry.
	}

}
