package spring.boot.fileHandler.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import spring.boot.fileHandler.entity.EmployeesResponse;
import spring.boot.fileHandler.service.FileUploadService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4000")
public class FileUploadController {
	private static Logger log = LoggerFactory.getLogger(FileUploadController.class);
	
	@Autowired
	FileUploadService csvFileUploadService;
	
	@GetMapping("/test")
	public String test() {
		log.info("it comes here");
		
		return "server is working fine";
	}
	
	@PostMapping("/fileupload")
	public EmployeesResponse csvParser(@RequestParam("file") MultipartFile file) {
		log.info("parsing csv " + file);
		return csvFileUploadService.getEmployeeRecords(file);
	}
}
