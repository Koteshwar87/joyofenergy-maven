package uk.tw.energy.repository;

import uk.tw.energy.models.Company;

import java.util.List;

public interface CompanyRepository {
    void addCompany(Company company);

    List<Company> getAllCompanies();
}
