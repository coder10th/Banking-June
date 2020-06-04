package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig()
	{
	File f= new File("./Configurations/config.properties");
	  try {
		FileInputStream fis=new FileInputStream(f);
		prop=new Properties();
		prop.load(fis);
			}
		catch (Exception e)
	       { e.printStackTrace();}
		
	    }
	
	public String getUrl()
	{
		String url=prop.getProperty("url");
		return url;
	}
	
	
	public String getUName()
	{
		String uName=prop.getProperty("userName");
		return uName;
		
	}
	public String getPw()
	{
		String pw=prop.getProperty("passWord");
		return pw;
	}
	
	public String chrome()
	{
		String chromePath=prop.getProperty("chromepath");
		return chromePath;
		
	}
	public String ie()
	{
		String iePath=prop.getProperty("IE");
		return iePath;
		
	}
	}

