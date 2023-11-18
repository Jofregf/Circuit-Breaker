package app.portfoliojofregf.vercel.citiesservice.service;

import app.portfoliojofregf.vercel.citiesservice.dto.CityRecord;

public interface ICityService {
    public CityRecord getCitiesHotels(String name, String country);
}
