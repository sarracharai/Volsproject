package com.sarra.vols;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarra.vols.entities.Avion;
import com.sarra.vols.entities.Vol;
import com.sarra.vols.repos.VolRepository;

@SpringBootTest
class VolsApplicationTests {

	@Autowired
	private VolRepository volRepository;
	@Test
	public void testCreateVol(){
		Vol vl = new Vol("Paris","Cartage","AiroportParis","en cours");
		volRepository.save(vl);
		
	}
	@Test
	public void testFindVol(){
		Vol v = volRepository.findById(1L).get(); System.out.println(v);
		}
	@Test
	public void testUpdateProduit(){ 
				Vol v = volRepository.findById(1L).get();
	v.setDestinationV("Suisse"); 
	volRepository.save(v);
	}
	
	@Test
	public void testDeleteVol(){
		volRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousVols() {
		List<Vol> vs =volRepository.findAll();
		for (Vol v : vs)
		{
		System.out.println(v);
		}
		
	}
	
	@Test
	public void findBydestinationV()
	{
		List<Vol> vs = volRepository.findBydestinationV("Suisse");
			for (Vol v : vs)
			{
			System.out.println(v);
			}
	}
	
	@Test
	public void findBydestinationVContains ()
	{
		List<Vol> vs=volRepository.findBydestinationVContains("Suisse");
			for (Vol v : vs)
			{
			System.out.println(v);
			}
	}
	
	
	@Test
	public void testfindByAvion()
	{
		Avion av = new Avion();
		av.setIdAv(1L);
		List<Vol> vs = volRepository.findByAvion(av);
			for (Vol v : vs)
				{
					System.out.println(v);
				}
	}
	
	@Test
	public void findByAvionIdAv()
	{
		List<Vol> vs = volRepository.findByAvionIdAv(1L);
			for (Vol v : vs)
				{
					System.out.println(v);
				}
	}

	@Test
	public void findByOrderByDestinationVAsc()
	{
		List<Vol> Vs = volRepository.findByOrderByDestinationVAsc();
			for (Vol v : Vs)
				{
					System.out.println(v);
				}
	}
}
