package app.portfoliojofregf.vercel.hotelsservice.controller;

import app.portfoliojofregf.vercel.hotelsservice.model.Hotel;
import app.portfoliojofregf.vercel.hotelsservice.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private IHotelService hotelService;

    @GetMapping("/{city_id}")
    public List<Hotel> getHotelsByCityId(@PathVariable Long city_id){
        return hotelService.getHotelByCityId(city_id);
    }
}
