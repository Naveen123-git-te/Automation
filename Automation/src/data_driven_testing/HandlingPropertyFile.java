package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
//Here we convert high level data into low level data
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to access NSM we create object of Properties class
	Properties p=new Properties();
//load(inputStream fis) will load the low level data into Properties object
	p.load(fis);
//getProperty(String key) will get the value from the property file based on mentioned key name
	String url = p.getProperty("url");
	String un = p.getProperty("un");
	String pwd=p.getProperty("pwd");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
}
}
