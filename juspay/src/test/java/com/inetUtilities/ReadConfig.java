package com.inetUtilities;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("URL");
		return url;
	}
	
	public String getPassword()
	{
	String Idname=pro.getProperty("password");
	return Idname;
	}
	public String getEmailId() 
	{
	String emailId = pro.getProperty("emailid");
	return emailId;
	}
	public String getnameofproduct() 
	{
	String product = pro.getProperty("nameOfProduct");
	return product;
	}
	public String getUPIId()
	{
	String upiId = pro.getProperty("upiID");
	return upiId;
	}
}