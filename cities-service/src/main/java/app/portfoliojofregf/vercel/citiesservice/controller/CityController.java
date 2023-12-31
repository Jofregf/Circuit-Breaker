package app.portfoliojofregf.vercel.citiesservice.controller;

import app.portfoliojofregf.vercel.citiesservice.dto.CityRecord;
import app.portfoliojofregf.vercel.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/hotels")
    public CityRecord getCityAndHotels(@RequestParam String name, @RequestParam String country){
        return cityService.getCitiesHotels(name, country);
    }
}
