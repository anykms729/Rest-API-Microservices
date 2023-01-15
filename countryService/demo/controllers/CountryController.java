/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.countryService.demo.controllers;

import com.countryService.demo.beans.Country;
import com.countryService.demo.services.CountryService;
import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miso K
 */

@RestController 
public class CountryController {
    
    // Instead of creating new object when to use methods or fields of other classes, by using "Autowired" dependency injection, we can use variable of class directly
    @Autowired
    CountryService countryService;
    
    // When URL "http://localhost:8080/getcountries" is sent from the client, below method is invoked by the controller
    @GetMapping("/getcountries")
    public java.util.List getCountries(){
    return countryService.getAllCountries();
    }
    
    // When URL "http://localhost:8080/getcountries/1" is sent as a "Path parameter" format from the client, below method is invoked by the controller
    @GetMapping("/getcountries/{id}")
    public Country getCountryByID(@PathVariable(value="id") int id){
    return  countryService.getCountryByID(id);
    }
    
    //When URL "http://localhost:8080/countryname?name=India" is sent as a "Query parameter" format from the client, below method is invoked by the controller
    @GetMapping("/getcountries/countryname")
    public Country getCountryByName(@RequestParam(value="name") String countryName){
    return  countryService.getCountryByName(countryName);
    }
    
    @PostMapping("/addcountry")
    public Country addCountry(@RequestBody Country country){
    return  countryService.addCountry(country);
    }
    
    @PutMapping("/updatecountry")
    public Country updateCountry(@RequestBody Country country){
    return  countryService.updateCountry(country);
    } 
     
    @DeleteMapping("/deletecountry/{id}")
    public AddResponse deleteCountry(@PathVariable(value="id") int id){
    // Delete function doesn't return body, rather, return message that the content is deleted successfully
    return  countryService.deleteCountry(id);
    }

}
