package org.example.dto;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MovieRecommender {

    @Getter
    @Autowired
    @Genre("Action")
    private MovieCatalog actionCatalog;

    @Getter
    private MovieCatalog comedyCatalog;

    @Autowired
    public void setComedyCatalog(@Genre("Comedy") MovieCatalog comedyCatalog) {
        this.comedyCatalog = comedyCatalog;
    }

    public MovieCatalog getActionCatalog() {
        return actionCatalog;
    }

    public MovieCatalog getComedyCatalog() {
        return comedyCatalog;
    }
}
