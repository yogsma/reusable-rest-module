package com.betterjavacode.socialpie.managers;

import com.betterjavacode.socialpie.interfaces.CompanyManager;
import com.betterjavacode.socialpie.models.Company;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author - Yogesh Mali
 */
@Component
public class CompanyManagerImpl implements CompanyManager
{
    @Override
    public Company createCompany(Company company)
    {
        return null;
    }

    @Override
    public Company updateCompany(Company company)
    {
        return null;
    }

    @Override
    public List<Company> getAllCompanies()
    {
        return null;
    }

    @Override
    public Company getCompany(String guid)
    {
        return null;
    }

    @Override
    public void deleteCompany(String guid)
    {

    }
}
