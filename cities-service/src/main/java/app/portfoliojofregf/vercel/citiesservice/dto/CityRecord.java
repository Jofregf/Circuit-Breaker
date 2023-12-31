package app.portfoliojofregf.vercel.citiesservice.dto;

import java.util.List;

public record CityRecord(Long city_id,
                         String name,
                         String state,
                         String country,
                         String continent,
                         List<HotelRecord> hotelList) {
}
