package br.com.danilomr.outlets.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRating {

    private double average_rating;
    private Integer votes;
}
