package model;

import java.util.Objects;

public class Hotel {
    private long id;
    private String name;
    private String country;
    private String city;
    private String street;

    public Hotel(long id, String name, String country, String city, String street) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(name, hotel.name) && Objects.equals(country, hotel.country) && Objects.equals(city, hotel.city) && Objects.equals(street, hotel.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, city, street);
    }

    @Override
    public String toString() {
        return getId() + "," + name + "," + country + "," + city + "," + street;
    }
}
