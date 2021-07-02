package com.basePack;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generatReport(String json) {
		
		File f= new File (System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\JVMReport");
		
		Configuration con = new Configuration (f, "AllScenarioRun");
		
		con.addClassifications("Platform Name", "Windows 10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "89");
		con.addClassifications("ProjectName", "Scenario Runs");
		
		List <String> list = new ArrayList<String>();
		list.add(json);
		
		ReportBuilder rb= new ReportBuilder(list, con);
		
		rb.generateReports();
		
	}
	
	

	
	
	
}
