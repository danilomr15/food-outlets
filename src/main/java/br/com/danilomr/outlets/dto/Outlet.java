package br.com.danilomr.outlets.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Outlet {

    private int id;
    private String city;
    private String name;

    @JsonProperty("estimated_cost")
    private int estimatedCost;

    @JsonProperty("user_rating")
    private UserRating userRating;
}
