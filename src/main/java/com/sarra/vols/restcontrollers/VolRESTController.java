package com.sarra.vols.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarra.vols.entities.Vol;
import com.sarra.vols.service.VolService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VolRESTController {
	
	@Autowired
	VolService volService;
	
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Vol> getAllVols() {
		return volService.getAllVols();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Vol getVolById(@PathVariable("id") Long id) { 
		return volService.getVol(id);
	}
	
	@RequestMapping(value="/addv",method = RequestMethod.POST)
	//@PostMapping("//addvs")
	public Vol createVol(@RequestBody Vol vol) {
	return volService.saveVol(vol);
	}
	
	
	@RequestMapping(value="/updatev",method = RequestMethod.PUT)
	//@PutMaping("/updatev")
	public Vol updateVol(@RequestBody Vol vol) {
	return volService.updateVol(vol);
	}
	
	@RequestMapping(value="/delv/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delv/{id}")
	public void deleteVol(@PathVariable("id") Long id)
	{
		volService.deleteVolById(id);
	}
	
	@RequestMapping(value="/vsav/{idAv}",method = RequestMethod.GET)
	public List<Vol> getVolsByAvId(@PathVariable("idAv") Long idAv) {
	return volService.findByAvionIdAv(idAv);
	}
	
	@RequestMapping(value="/vsByDestination/{destination}",method = RequestMethod.GET)
	public List<Vol> findBydestinationVContains(@PathVariable("destination") String destinationV) {
	return volService.findBydestinationVContains(destinationV);
	}
	
}
