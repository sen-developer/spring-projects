package org.example.jsr;

import jakarta.annotation.Resource;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SimpleMovieLister {
    private MovieFinder movieFinder;
    @Resource
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

}
