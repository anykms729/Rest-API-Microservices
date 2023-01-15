/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.countryService.demo.beans;

/**
 *
 * @author Miso K
 */
public class Country {
    int id;
    String countryName;
    String countryCapital;

    public Country() {
    }

    public Country(int id, String countryName, String countryCapital) {
    this.id = id;
    this.countryName = countryName;
    this.countryCapital = countryCapital;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }
    
}

