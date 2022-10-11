package br.com.danilomr.outlets.service;

import br.com.danilomr.outlets.client.HackerRankClient;
import br.com.danilomr.outlets.dto.Outlet;
import br.com.danilomr.outlets.dto.PageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodOutletsService {

    private final HackerRankClient hackerRankClient;

    public List<String> getOutletNames(final String city,
                                       final int maxCost) {

        int page = 0;
        PageResponse<Outlet> response;
        final List<String> outlets = new ArrayList<>();

        do {
            response = hackerRankClient.getOutlets(city, page);
            List<String> filteredOutlets = response.getData().stream()
                    .filter(o -> o.getEstimatedCost() <= maxCost)
                    .map(Outlet::getName)
                    .collect(Collectors.toList());

            outlets.addAll(filteredOutlets);
            page++;
        } while (response.hasNext());

        return outlets;
    }
}
