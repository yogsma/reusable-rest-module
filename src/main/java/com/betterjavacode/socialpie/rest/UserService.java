package com.betterjavacode.socialpie.rest;

import com.betterjavacode.socialpie.models.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("socialpie/v1")
class UserService
{

    @RequestMapping(value = "/companies/{companyGuid}/users/", method = RequestMethod.POST)
    @ApiOperation(value = "Create a new user", response = User.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public User createUser(@PathVariable("companyGuid")String companyGuid, @RequestBody User user)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/users/", method = RequestMethod.GET)
    @ApiOperation(value = "Get a list of users", response = User.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Input")})
    public List<User> getAllUsers(@PathVariable("companyGuid") String companyGuid)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/users/{guid}", method = RequestMethod.GET)
    @ApiOperation(value = "Get a user", response = User.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Input")})
    public User getUser(@PathVariable("companyGuid") String companyGuid, @PathVariable("guid") String guid)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/users/", method = RequestMethod.PUT)
    @ApiOperation(value = "Update a user", response = User.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Input") })
    public User updateUser(@PathVariable("companyGuid")String companyGuid, @RequestBody User user)
    {
        return null;
    }

    @RequestMapping(value = "/companies/{companyGuid}/users/{guid}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete a user", response = User.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Input")})
    public User deleteUser(@PathVariable("companyGuid") String companyGuid, @PathVariable("guid") String guid)
    {
        return null;
    }


}
