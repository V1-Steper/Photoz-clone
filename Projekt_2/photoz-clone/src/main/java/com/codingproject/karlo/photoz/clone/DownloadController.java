package com.codingproject.karlo.photoz.clone;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {
	
	private final PhotozService photozService;
	
	public DownloadController(PhotozService photozService) {
		
		this.photozService=photozService;
	}
	
	
	@GetMapping("/download/{id}")
	public ResponseEntity<byte[]> download(@PathVariable String id){
		
		byte[] data;
		
		HttpHeaders headers= new HttpHeaders();
		
		return new ResponseEntity<byte[]>(data, headers, HttpStatus.OK);
		
	}

}
