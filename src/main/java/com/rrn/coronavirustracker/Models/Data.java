package com.rrn.coronavirustracker.Models;

public class Data {

	public String location ;
    public int confirmed ;
    public int deaths ;
    public int recovered ;
    public int active;
    
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
    
    
    
}
