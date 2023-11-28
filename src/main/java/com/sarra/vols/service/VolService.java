package com.sarra.vols.service;

import java.util.List;

import com.sarra.vols.entities.Avion;
import com.sarra.vols.entities.Vol;

public interface VolService {
	
	Vol saveVol(Vol v);
	Vol updateVol(Vol v);
	void deleteVol(Vol v);
	void deleteVolById(Long id);
	Vol getVol(Long id);
	List<Vol> getAllVols();
	List<Vol> findBydestinationV(String destination);
	List<Vol> findBydestinationVContains(String destination);
	List<Vol> findByAvion (Avion avion);
	List<Vol> findByAvionIdAv(Long id);
	List<Vol> findByOrderByDestinationVAsc();
}
