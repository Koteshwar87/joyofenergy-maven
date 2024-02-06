package uk.tw.energy.service.impl;

import org.springframework.stereotype.Service;
import uk.tw.energy.dto.requestdtos.CompanyRequestDto;
import uk.tw.energy.dto.responsedtos.CompanyResponseDto;
import uk.tw.energy.models.Company;
import uk.tw.energy.repository.CompanyRepository;
import uk.tw.energy.service.CompanyService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyResponseDto saveCompany(CompanyRequestDto companyDetails) {
        companyRepository.addCompany(new Company(UUID.randomUUID().toString(), companyDetails.getCompanyName()));
        return new CompanyResponseDto(companyDetails.getCompanyName());
    }

    @Override
    public List<CompanyResponseDto> fetchAllCompanies() {
        List<Company> allCompanies = companyRepository.getAllCompanies();
        List<CompanyResponseDto> companyResponseDtos = allCompanies.stream()
                .map(company -> {
                    CompanyResponseDto dto = new CompanyResponseDto();
                    dto.setCompanyName(company.getName());
                    return dto;
                }).collect(Collectors.toList());
        return companyResponseDtos;
    }
}
