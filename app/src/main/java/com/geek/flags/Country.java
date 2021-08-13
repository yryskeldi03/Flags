package com.geek.flags;

public class Country {
    private String nameOfCountry, nameOfCity;
    private int image;

    public Country(String nameOfCountry, String nameOfCity, int image) {
        this.nameOfCountry = nameOfCountry;
        this.nameOfCity = nameOfCity;
        this.image = image;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public int getImage() {
        return image;
    }
}
