package com.xxy;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable{

	public String favYear1;
	public String favYear2;
	public String favYear3;
	
	public String getFavYear1() {
		return favYear1;
	}

	public void setFavYear1(String favYear1) {
		this.favYear1 = favYear1;
	}

	public String getFavYear2() {
		return favYear2;
	}

	public void setFavYear2(String favYear2) {
		this.favYear2 = favYear2;
	}

	public String getFavYear3() {
		return favYear3;
	}

	public void setFavYear3(String favYear3) {
		this.favYear3 = favYear3;
	}

	//Generated by Map
	private static Map<String,Object> year2Value;
	static{
		year2Value = new LinkedHashMap<String,Object>();
		year2Value.put("Year2 - 2000", "2000"); //label, value
		year2Value.put("Year2 - 2010", "2010");
		year2Value.put("Year2 - 2020", "2020");
	}
	
	public Map<String,Object> getFavYear2Value() {
		return year2Value;
	}
	
	//Generated by Object array
	public static class Year{
		public String yearLabel;
		public String yearValue;
		
		public Year(String yearLabel, String yearValue){
			this.yearLabel = yearLabel;
			this.yearValue = yearValue;
		}
		
		public String getYearLabel(){
			return yearLabel;
		}
		
		public String getYearValue(){
			return yearValue;
		}
		
	}
	
	public Year[] year3List;
	
	public Year[] getFavYear3Value() {
		
		year3List = new Year[3];
		year3List[0] = new Year("Year3 - 2000", "2000");
		year3List[1] = new Year("Year3 - 2010", "2010");
		year3List[2] = new Year("Year3 - 2020", "2020");
		
		return year3List;
	}
	
}