package com.sarra.vols.service;

import java.util.List;
import com.sarra.vols.repos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarra.vols.entities.Avion;
import com.sarra.vols.entities.Vol;
import com.sarra.vols.repos.VolRepository;

@Service
public class VolServiceImpl implements VolService{
	
	@Autowired 
	VolRepository volRepository;
	
	@Autowired
	ImageRepository imageRepository;

	@Override
	public Vol saveVol(Vol v) {
		return volRepository.save(v);
	}

	
	@Override
	public Vol updateVol(Vol v) {
	//Long oldVImageId = this.getVol(v.getIdV()).getImage().getIdImage();
	//Long newVImageId = v.getImage().getIdImage();
	Vol vUpdated = volRepository.save(v);
	//if (oldVImageId != newVImageId) //si l'image a été modifiée
	//imageRepository.deleteById(oldVImageId);
	return vUpdated;
	}

	@Override
	public void deleteVol(Vol v) {
		volRepository.delete(v);
		
	}

	@Override
	public void deleteVolById(Long id) {
		volRepository.deleteById(id);
		
	}

	@Override
	public Vol getVol(Long id) {
		return volRepository.findById(id).get();
	}

	@Override
	public List<Vol> getAllVols() {
		return volRepository.findAll();
	}

	@Override
	public List<Vol> findBydestinationV(String destination) {
		return volRepository.findBydestinationV(destination) ;
	}

	@Override
	public List<Vol> findBydestinationVContains(String destination) {
		return volRepository.findBydestinationVContains(destination);
	}

	@Override
	public List<Vol> findByAvion(Avion avion) {
		return volRepository.findByAvion(avion);
	}

	@Override
	public List<Vol> findByAvionIdAv(Long id) {
		return volRepository.findByAvionIdAv(id);
	}

	@Override
	public List<Vol> findByOrderByDestinationVAsc() {
		return volRepository.findByOrderByDestinationVAsc();
	}

}
