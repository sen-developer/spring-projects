package org.example.dto;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MovieCatalog {
    List<String> getMovies();
}