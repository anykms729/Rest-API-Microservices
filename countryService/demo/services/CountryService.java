/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.countryService.demo.services;

import com.countryService.demo.beans.Country;
import com.countryService.demo.controllers.AddResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Miso K
 */

@Component
// To inject dependency into CountryController (in "CountryController" class, "Autowired" annotation is used)
// Service class refer POJO/Bean class to use Object and related functions 
public class CountryService {

    // In hashmap, data can be stored in "Key (Integer type) - Value (Country Object type)" pair
    static HashMap<Integer, Country> countryIdMap;

    
    // Hashmap is used temporarily as a replacement of Database
    // Constructor for "CountryService" class
    public CountryService() {
        countryIdMap = new HashMap<>();

        // Create "Country" objects
        Country KoreaCountry = new Country(1, "Korea", "Seoul");
        Country IrelandCountry = new Country(2, "Ireland", "Dublin");
        Country EgyptCountry = new Country(3, "Egpyt", "Cairo");

        // Put the objects created from above with key
        countryIdMap.put(1, KoreaCountry);
        countryIdMap.put(2, IrelandCountry);
        countryIdMap.put(3, EgyptCountry);
    }

    public List getAllCountries() {
        List countries = new ArrayList(countryIdMap.values());
        return countries;
    }

    // Use get() function of HashMap to get specific data using "key" value entered by user
    public Country getCountryByID(int id) {
        Country country = countryIdMap.get(id);
        return country;
    }

    public Country getCountryByName(String countryName) {
        Country country = null;
        for (int i : countryIdMap.keySet()) {
            // Get value of HashMap "countryIdMap" using HashMap function "get()" → Get country name using "getCountryName()" function of "Country" Object  
            if (countryIdMap.get(i).getCountryName().equals(countryName)) {
                country = countryIdMap.get(i);
            }
        }
        return country;
    }

    public Country addCountry(Country country) {
        // "Country" object is created based on user's input and id is allocated based on index of entry which is in last order of HashMap "countryIdMap"
        country.setId(getMaxId());
        // Then, the object created from above is put in Hashmap as "key - value" pair
        countryIdMap.put(country.getId(), country);
        return country;
    }

    // The function will be used for indexing "key" of each country listed whenever new country is added using "addCountry()" function above
    public static int getMaxId() {
        int max = 0;
        for (int id : countryIdMap.keySet()) {
            if (max < id) {
                max = id;
            }
        }
        return max + 1;
    }
    
    public Country updateCountry(Country country){
        if(country.getId()>0)
            // Hashmap "countryIdMap": Key = "country.getId()" & Value = "country" 
            countryIdMap.put(country.getId(),country);
        return country;
    }
    
    public AddResponse deleteCountry(int id){
    countryIdMap.remove(id);
    AddResponse res = new AddResponse();
    res.setMsg("Hello, user! country deleted successfully! ");
    res.setId(id);
    return res;
    }
}
