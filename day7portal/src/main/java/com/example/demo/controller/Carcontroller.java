package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carentity;
import com.example.demo.service.Carservice;

@RestController
public class Carcontroller {
	
	@Autowired
	Carservice cr;
	
	@PostMapping("addcar")
	public Carentity add(@RequestBody Carentity ss) {		
		return cr.saveinfo(ss);
	}
	
	@PostMapping("addncar")
	public List<Carentity> addndetails(@RequestBody List<Carentity> ss)
	{
		return cr.savedetails(ss);
	}
	@GetMapping("showdetails")
	public List<Carentity> show()
	{
		return cr.showinfo();
	}
	
	@GetMapping("showquery/{owners}")
	public 	List<Carentity> showstudetails(@PathVariable int owners)
	{
		return cr.getcar(owners);
	}
	
	@GetMapping("showquerybyaddress/{address}")
	public 	List<Carentity> showstudetailsbyaddress(@PathVariable String address)
	{
		return cr.getcaradd(address);
	}
	
	@GetMapping("showquerybyname/{carname}")
	public 	List<Carentity> showstudetailsbyname(@PathVariable String carname)
	{
		return cr.getcarname(carname);
	}
	
	@GetMapping("owners/{owners}/cartype/{cartype}")
	public 	List<Carentity> showstudetails(@PathVariable int owners,@PathVariable String cartype)
	{
		return cr.getcartypes(owners, cartype);
	}
}