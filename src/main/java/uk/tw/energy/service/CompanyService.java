package uk.tw.energy.service;

import uk.tw.energy.dto.requestdtos.CompanyRequestDto;
import uk.tw.energy.dto.responsedtos.CompanyResponseDto;

import java.util.List;

public interface CompanyService {
    CompanyResponseDto saveCompany(CompanyRequestDto companyDetails);

    List<CompanyResponseDto> fetchAllCompanies();
}

    /*Employee saveEmployee(Employee employee);
    List<Employee> fetchAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id, Employee employee);
    String deleteDepartmentById(Long id);*/