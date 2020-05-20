package com.rrn.coronavirustracker.Models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Global {
		
	List<Data> data ;	
    String dt;
    String ts;
    
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
    
	
	
}
