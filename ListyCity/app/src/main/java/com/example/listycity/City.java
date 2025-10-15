package com.example.listycity;



/*
 This is a class that defines a city
 */

import java.util.Comparator;

public class City implements Comparable{

    private String city;
    private String province;


    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityName() {
        return city;
    }

    public void setCityName(String city) {
        this.city = city;
    }

    /** This method compares cities based on city name field
     * @return -1 if the caller is greater than the city name field 
     *
     */

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

}

