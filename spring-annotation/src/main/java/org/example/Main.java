package org.example;


import org.example.dto.MovieRecommender;
import org.example.jsr.SimpleMovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Main.class);

        var movie = ctx.getBean(MovieRecommender.class);


        var movieListener = ctx.getBean(SimpleMovieLister.class);
        movieListener.getMovieFinder().find();

        System.out.println(movie.getActionCatalog());

        ctx.close();
    }
}