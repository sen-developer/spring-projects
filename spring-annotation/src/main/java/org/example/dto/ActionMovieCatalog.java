package org.example.dto;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
@Genre("Action")
@ToString
public class ActionMovieCatalog implements MovieCatalog{
    @Override
    public List<String> getMovies() {
        return List.of("Die Hard", "Mad Max", "John Wick");
    }
}
