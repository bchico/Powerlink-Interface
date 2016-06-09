package org.sturtevantauto.robot;

import java.awt.AWTException;
import java.awt.Robot;

public class QuestionsEntry {
	
	public static void enterQuestions(String stocknum, String[] answers) throws AWTException
	{
		Keyboard keyboard = new Keyboard();
		Robot r = new Robot();
		r.delay(1000);
		keyboard.type(stocknum + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");  //Navigates to questions button
		for(String answer : answers)
		{
			keyboard.type(answer + "\t");
		}
	}

}
