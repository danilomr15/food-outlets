package br.com.danilomr.outlets.api;

import br.com.danilomr.outlets.service.FoodOutletsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/app/v1/outlets")
public class FoodOutletsController {

    private final FoodOutletsService foodOutletsService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<String> getOutlets(@RequestParam("city") final String city,
                            @RequestParam("maxCost") final int maxCost) {

        return foodOutletsService.getOutletNames(city, maxCost);
    }
}
