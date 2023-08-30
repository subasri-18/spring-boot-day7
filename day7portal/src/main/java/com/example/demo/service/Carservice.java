package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Carentity;
import com.example.demo.repository.Carrepo;

@Service
public class Carservice {
	
	@Autowired
	Carrepo cr;
	public Carentity saveinfo(	Carentity ss)
	{
		return cr.save(ss);
	}
	
	public List<Carentity> savedetails(List<Carentity> ss){
		
		return (List<Carentity>)cr.saveAll(ss);
	}
	public List<Carentity> showinfo()
	{
	      return cr.findAll();
	}
	public List<Carentity> getcar(int s)
	{
		return cr.getcarInfo(s);
	}
	
	public List<Carentity> getcaradd(String address)
	{
		return cr.getcarInfoaddress(address);
	}
	
	public List<Carentity> getcarname(String carname)
	{
		return cr.getcarInfoname(carname);
	}
	public List<Carentity> getcartypes(int i,String s)
	{
		return cr.getcarInfobytypes(i, s);
	}

}