package com.betterjavacode.socialpie.rest;

import com.betterjavacode.socialpie.models.Company;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("socialpie/v1")
class CompanyService
{

    @RequestMapping(value = "/companies/", method = RequestMethod.GET)
    @ApiOperation(value = "Get all companies", response = Company.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input")})
    public List<Company> getAllCompanies()
    {
        return null;
    }

    @RequestMapping(value = "/companies/{guid}", method= RequestMethod.GET)
    @ApiOperation(value = "Get a company", response = Company.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input")})
    public Company getCompany(@PathVariable("guid") String guid)
    {
        return null;
    }

    @RequestMapping(value = "/companies/", method = RequestMethod.POST)
    @ApiOperation(value = "Create a company", response = Company.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input")})
    public Company createCompany(@RequestBody Company company)
    {
        return null;
    }

    @RequestMapping(value = "/companies/", method = RequestMethod.PUT)
    @ApiOperation(value = "Update a company", response = Company.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input")})
    public Company updateCompany(@RequestBody Company company)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{guid}", method=RequestMethod.DELETE)
    @ApiOperation(value = "Delete a company", response = Company.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input")})
    public Company deleteCompany(@PathVariable("guid") String guid)
    {
        return null;
    }

}
