package eCommeces;

import java.io.FileInputStream;
import java.util.Properties;

public class notedata {

	public String getdatafile(String key) throws Exception {
		// TODO Auto-generated method stub		      
	
		FileInputStream fies = new FileInputStream(Pathdata.note);
		Properties per = new Properties();
		per.load(fies);
		String value = per.getProperty(key);
		return value;
	}
	
}
