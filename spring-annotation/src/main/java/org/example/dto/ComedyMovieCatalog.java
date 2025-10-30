package org.example.dto;

import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
@Genre("Comedy")
@ToString
public class ComedyMovieCatalog implements MovieCatalog{
    @Override
    public List<String> getMovies() {
        return List.of();
    }
}
