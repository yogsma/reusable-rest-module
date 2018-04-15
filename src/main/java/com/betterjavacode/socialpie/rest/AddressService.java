package com.betterjavacode.socialpie.rest;

import com.betterjavacode.socialpie.models.Address;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("socialpie/v1")
class AddressService
{
    @RequestMapping(value = "/companies/{companyGuid}/addresses/", method = RequestMethod.POST)
    @ApiOperation(value = "Create a new address", response = Address.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public Address createAddress(@PathVariable("companyGuid")String companyGuid, @RequestBody Address address)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/addresses/{guid}", method = RequestMethod.GET)
    @ApiOperation(value = "Get an Address", response = Address.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Input")})
    public Address getAddress(@PathVariable("companyGuid") String companyGuid, @PathVariable("guid") String guid)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/addresses/", method = RequestMethod.PUT)
    @ApiOperation(value = "Update an Address", response = Address.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public Address updateAddress(@PathVariable("companyGuid")String companyGuid, @RequestBody Address address)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/addresses/{guid}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete an address", response = Address.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Input")})
    public Address deleteAddress(@PathVariable("companyGuid") String companyGuid, @PathVariable("guid") String guid)
    {
        return null;
    }
}
