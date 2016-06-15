package testTaskArtefact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public final class GetTestValues {
	
	private static Logger log = Logger.getLogger(GetTestValues.class.getName());
	private static final String separator = ";";
	
	public static List<String[]> readTestFile(String pathToTestValuesFile) {  
		String line;
    	List<String[]> values = new ArrayList<String[]>();
        try {
        	log.info("Start read file to path: " + pathToTestValuesFile);
        	 BufferedReader reader = new BufferedReader(new FileReader(pathToTestValuesFile));
             while ((line = reader.readLine()) != null) {
            	 values.add(line.split(separator));
             }
             reader.close();
             log.info("File " + pathToTestValuesFile + " successfully read and closed");
        } 
        catch (FileNotFoundException ex) {
        	log.info("File Location: " + pathToTestValuesFile + " not found");
            ex.printStackTrace();
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return values;
    }	
}
