package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class test5 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./target/configure.properties");	
	Properties prop = new Properties();
	prop.load(fis);
	String usnm = prop.getProperty("username");
	System.out.println(usnm);
}
}
