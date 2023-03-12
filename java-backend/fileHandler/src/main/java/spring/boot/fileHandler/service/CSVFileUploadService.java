package spring.boot.fileHandler.service;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import spring.boot.fileHandler.entity.Employee;
import spring.boot.fileHandler.entity.EmployeesResponse;
import spring.boot.fileHandler.util.EmployeeUtils;

@Service
public class CSVFileUploadService implements FileUploadService {
	private static Logger log = LoggerFactory.getLogger(CSVFileUploadService.class);
	
	@Override
	public String getContentOfFile(MultipartFile file) {
		log.info("processing contents of " + file.getName());
		
		String contents = "";
		try {
			byte[] bytes = file.getBytes();
			contents = new String(bytes, "UTF8");
		} catch(IOException ex) {
			log.error("Unable to parse file contents " + ex.getMessage(), ex);
		}
		
		return contents;
	}

	@Override
	public EmployeesResponse getEmployeeRecords(MultipartFile file) {
		String contents = getContentOfFile(file);
		List<Employee> employees = EmployeeUtils.parseEmployees(contents);
		return new EmployeesResponse("success", employees);
	}

}
