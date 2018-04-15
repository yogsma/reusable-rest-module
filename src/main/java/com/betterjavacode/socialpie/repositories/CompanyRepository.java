package com.betterjavacode.socialpie.repositories;

import com.betterjavacode.socialpie.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer>
{
}
