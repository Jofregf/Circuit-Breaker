package app.portfoliojofregf.vercel.hotelsservice.service;

import app.portfoliojofregf.vercel.hotelsservice.model.Hotel;

import java.util.List;

public interface IHotelService {
    public List<Hotel> getHotelByCityId(Long city_id);
}
