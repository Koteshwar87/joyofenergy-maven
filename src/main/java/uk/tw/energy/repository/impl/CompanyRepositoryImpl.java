package uk.tw.energy.repository.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import uk.tw.energy.models.Company;
import uk.tw.energy.repository.CompanyRepository;

import java.util.List;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

    @Qualifier("energyCompanies")
    private final List<Company> companies;

    public CompanyRepositoryImpl(List<Company> companies) {
        this.companies = companies;
    }

    @Override
    public void addCompany(Company company) {
        companies.add(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companies;
    }
}
