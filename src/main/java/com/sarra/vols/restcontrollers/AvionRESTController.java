package com.sarra.vols.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarra.vols.entities.Avion;
import com.sarra.vols.repos.AvionRepository;

@RestController
@RequestMapping("/api/av")
@CrossOrigin("*")
public class AvionRESTController {
	
	@Autowired
	AvionRepository avionRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Avion> getAllAvions()
	{
	return avionRepository.findAll();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Avion getAvionById(@PathVariable("id") Long id) {
	return avionRepository.findById(id).get();
	}

}
