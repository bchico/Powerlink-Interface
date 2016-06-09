package org.sturtevantauto.main;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.sturtevantauto.robot.PartsEntry;
import org.sturtevantauto.robot.QuestionsEntry;

public class Main {
	
	static String[] answers = new String[] {"4 DR", "PW", "Tint", "PL", "PM", "BLACK", "04/99", "Sunroof",
			"FWD", "EFI", "2.2L", "Factory", "Grey", "Bucket", "Cloth", "Tilt,Cruise,Delay,Rad,Air", "ATOD", "Floor", "Elec", "Std"};

	public static void main(String[] args) throws AWTException
	{
		Robot r = new Robot();
		r.delay(3000);
		System.out.println(MouseInfo.getPointerInfo().getLocation());
		r.mouseMove(49, 334);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		QuestionsEntry.enterQuestions("G03699", answers);
		
		
		/**
		 * This section is for entering parts.
		 */
		/*
		r.mouseMove(42, 309);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		PartsEntry.enterParts("104-02559R", 60, "G03696", "");
		 */
	}
}
