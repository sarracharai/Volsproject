package com.sarra.vols.service;
import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import com.sarra.vols.entities.Image;

public interface ImageService {
	Image uplaodImage(MultipartFile file) throws IOException;
	Image getImageDetails(Long id) throws IOException;
	ResponseEntity<byte[]> getImage(Long id) throws IOException;
	void deleteImage(Long id) ;
	
	Image uplaodImageV(MultipartFile file,Long idV) throws IOException;
	List<Image> getImagesParV(Long vId);

}
