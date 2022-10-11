package br.com.danilomr.outlets.client;

import br.com.danilomr.outlets.dto.Outlet;
import br.com.danilomr.outlets.dto.PageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hacker-rank", url = "${hacker-rank.host}")
public interface HackerRankClient {

    @GetMapping("/api/food_outlets")
    PageResponse<Outlet> getOutlets(@RequestParam("city") String city,
                                    @RequestParam("page") int page);
}
