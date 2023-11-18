package app.portfoliojofregf.vercel.hotelsservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Hotel {
    private Long id;
    private String name;
    private int stars;
    private Long city_id;
}
