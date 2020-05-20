package com.rrn.coronavirustracker.Models;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Country {
	
	public Data data ;
	public String dt;
    public String ts;
    
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
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
