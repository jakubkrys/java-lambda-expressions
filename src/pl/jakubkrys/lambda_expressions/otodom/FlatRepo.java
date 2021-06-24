package pl.jakubkrys.lambda_expressions.otodom;

import java.util.*;

public class FlatRepo {

    Set<Flat> flats = new HashSet<>();

    public void add (Flat flat) {
        flats.add(flat);
    }

    public Set<Flat> findFlats (Parameters parameters) {
        Set<Flat> finded = new HashSet<>();
        for (Flat flat : flats) {
            if (parameters.meetRequirements(flat)) {
                finded.add(flat);
            }
        }
        return finded;
    }
}