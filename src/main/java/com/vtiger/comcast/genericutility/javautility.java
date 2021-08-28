package com.vtiger.comcast.genericutility;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.Keys;

/**
 * this class contains java specific libraries
 * @author Nandish
 */
public class   javautility {
	/**
	 * this method returns random  number
	 * @author Nandish
	 */
	public int getrandomnum() {
		Random random = new Random();
		int randomnum = random.nextInt(1000);
		return randomnum;
	}
	/**
	 * this method returns the system date
	 * @author Nandish
	 */
	public String getsystemdate()
	{
		Date date = new Date();
		String systemdateandtime = date.toString();
		System.out.println(systemdateandtime);
		return systemdateandtime;
	}
	/**
	 * this method returns the date in YYYY-MM-DD Format
	 * @author Nandish
	 */
	public String getsystemdateYYYY_MM_DD()
	{
		Date date = new Date();
		String systemdateandtime = date.toString();
		System.out.println(systemdateandtime);
	
		String []ar=systemdateandtime.split(" ");
		int MM=date.getMonth()+1;
		String YYYY=ar[5];
		String DD=ar[2];
		String YYYY_MM_DD=YYYY+"-"+MM+"-"+DD;
		
		return YYYY_MM_DD;	
}
	/**
	 * this method enter virtual key to os
	 * @author Nandish
	 * @throws AWTException 
	 */
	public void virtualenterkey() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	}

