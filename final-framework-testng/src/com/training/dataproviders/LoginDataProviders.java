package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.RegistrationBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		//List<LoginBean> list = new ELearningDAO().getLogins(); 
		List<RegistrationBean> list = new ELearningDAO().getRegistration();
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(RegistrationBean temp : list){
			Object[]  obj = new Object[8]; 
			obj[0] = temp.getFirstName(); 
			obj[1] = temp.getLastName(); 
			obj[2] = temp.geteMail(); 
			obj[3] = temp.getUserName();
			obj[4] = temp.getPassword();
			obj[5] = temp.getConfirmPassword();
			obj[6] = temp.getPhone();
			obj[7] = temp.getLanguage();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:\\DataDriven\\TestData\\TestData_ETLC_077.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:\\DataDriven\\TestData\\TestData_ETLC_077.xlsx", "Sheet1"); 
	}
}
