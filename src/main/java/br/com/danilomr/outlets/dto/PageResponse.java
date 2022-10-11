package br.com.danilomr.outlets.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {

    private int page;

    @JsonProperty("per_page")
    private int size;

    @JsonProperty("total")
    private int totalElements;

    @JsonProperty("total_pages")
    private int totalPages;

    private List<T> data;

    public boolean isLast() {
        return page == totalPages;
    }

    public boolean hasNext() {
        return page < totalPages;
    }
}
