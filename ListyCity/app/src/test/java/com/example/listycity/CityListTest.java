package com.example.listycity;
import static org.junit.jupiter.api.Assertions.*;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;
import org.junit.Test;

public class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());

        return cityList;
    }



    @Contract(value = "-> new", pure = true)
    @NonNull
    private City mockCity(){
        return new City("Edmonton", "AB");
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City c = new City("Regina", "Saskatchewan");
        cityList.add(c);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));
    }

    @Test
    public void testAddException() {
        CityList cityList = mockCityList();
        City c = new City("Yellowknife", "Northwest Territories");
        cityList.add(c);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(c);
        });
    }


    @Test
    public void testGetCities() {
        CityList cityList = mockCityList();
        // This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
        // is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        // Now the original city should be at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    public void testHasCity(){
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Calgary", "Alberta");
        cityList.add(city);

        City testCity = new City("Edmonton", "Alberta");
        //cityList.add(testCity);



        // (expected value , tested value )
        //assertEquals();

    }

    @Test
    public void testCountCities(){
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Calgary", "Alberta");
        cityList.add(new City("Edmonton", "Alberta"));
        cityList.add(new City("Charlottetown", "Prince Edward Island"));
        cityList.add(new City("Yellowknife", "Northwest Territories"));

        assertEquals(4,cityList.countCity());
    }


}
