package com.betterjavacode.socialpie.interfaces;

import com.betterjavacode.socialpie.models.Company;

import java.util.List;

public interface CompanyManager
{
    Company createCompany(Company company);

    Company updateCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompany(String guid);

    void deleteCompany(String guid);
}
