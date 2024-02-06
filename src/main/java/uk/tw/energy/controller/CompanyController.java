package uk.tw.energy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.tw.energy.dto.APIResponse;
import uk.tw.energy.dto.requestdtos.CompanyRequestDto;
import uk.tw.energy.dto.responsedtos.CompanyResponseDto;
import uk.tw.energy.service.CompanyService;

import java.util.List;

// https://www.javaguides.net/2018/06/restful-api-design-best-practices.html
@RestController
@RequestMapping("/api/v1")
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/companies")
    public ResponseEntity<APIResponse<CompanyResponseDto>> addCompany(@RequestBody CompanyRequestDto companyRequestDto) {
        CompanyResponseDto companyResponseDto = companyService.saveCompany(companyRequestDto);

        APIResponse response =
                APIResponse.builder()
                        .data(companyResponseDto)
                        .httpStatus(HttpStatus.ACCEPTED.value())
                        .message("New Company is added")
                        .build();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
    }

    @GetMapping("/companies")
    public ResponseEntity<APIResponse<List<CompanyResponseDto>>> getCompanies() {
        List<CompanyResponseDto> companyResponseDtos = companyService.fetchAllCompanies();
        APIResponse response =
                APIResponse.builder()
                        .data(companyResponseDtos)
                        .httpStatus(HttpStatus.ACCEPTED.value())
                        .message("List of companies")
                        .build();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
