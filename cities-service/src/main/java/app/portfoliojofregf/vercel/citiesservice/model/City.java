package app.portfoliojofregf.vercel.citiesservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class City {

    private Long city_id;
    private String name;
    private String state;
    private String country;
    private String continent;
}
