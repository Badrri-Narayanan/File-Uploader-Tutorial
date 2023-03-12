package spring.boot.fileHandler.service;

import org.springframework.web.multipart.MultipartFile;

import spring.boot.fileHandler.entity.EmployeesResponse;

public interface FileUploadService {
	String getContentOfFile(MultipartFile file);
	EmployeesResponse getEmployeeRecords(MultipartFile file);
}
