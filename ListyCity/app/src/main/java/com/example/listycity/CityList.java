package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

This is a class that keeps a list of city objects


*/
public class CityList {

    private List<City> cities = new ArrayList<>();



    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     *
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }

        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


    // lab 6
   /**
    * This methods takes in a City type as its argument
    * @param city
    * This method will return and remove the city if the city is contained in the list
    * @return true or false
    */
    public boolean hasCity(City city){
       if(cities.contains(city)){
           return true;
       }else{
           return false;
       }
    }

    /**
     *
     * @return list size
     *
     * */
    public int countCity(){
        return cities.size();
    }

    /**
     * @param city
     * @return boolean
     * @throws IllegalArgumentException
     * */
    public boolean deleteCity(City city){
        if(cities.contains(city)){
            cities.remove(city);
            return true;
        }else{
            throw new IllegalArgumentException("The City was not Found: " + city);
        }
    }





}
