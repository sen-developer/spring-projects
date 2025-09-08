package org.example.consumingrest;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Products(long limit, List<Product> products, long skip, long total) {

}