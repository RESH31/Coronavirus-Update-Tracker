package com.rrn.coronavirustracker.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rrn.coronavirustracker.Models.Country;
import com.rrn.coronavirustracker.Models.Data;
import com.rrn.coronavirustracker.Models.Global;


@Controller
@RequestMapping("")
@ComponentScan("com.rrn.coronavirustracker.Services")	
public class MyRestController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/Test")
	public String greeting(Model model) {
		model.addAttribute("messages","All is well");
		return "HelloWorld";
	}
	
	@GetMapping(value="")
	public String AllCountriesData(Model model) {
		String uri="https://covid2019-api.herokuapp.com/v2/current";
		ResponseEntity<Global> responseEntity=restTemplate.exchange(uri,HttpMethod.GET,null,Global.class);
		Global data= responseEntity.getBody();
		ArrayList<Data> globalList=(ArrayList<Data>) data.getData();
		model.addAttribute("GlobalList", globalList);
		uri="https://covid2019-api.herokuapp.com/v2/total";
		ResponseEntity<Country> responseGlobalEntity=restTemplate.exchange(uri,HttpMethod.GET,null,Country.class);
		Data globalData=(Data)(responseGlobalEntity.getBody()).getData();
		model.addAttribute("globalData", globalData);
		return "CountriesList";
	}
	
	@GetMapping(value="/CountryData/{id}")
	public String CountriesData(@PathVariable(value = "id") String countryName, Model model) {
		String uri="https://covid2019-api.herokuapp.com/v2/country/"+countryName;
		ResponseEntity<Country> responseEntity=restTemplate.exchange(uri,HttpMethod.GET,null,Country.class);
		Data countryData=(Data)(responseEntity.getBody()).getData();
		model.addAttribute("countryData", countryData);
		return "CountryDetails";
	}

}
