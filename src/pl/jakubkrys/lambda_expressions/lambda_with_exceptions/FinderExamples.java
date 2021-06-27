package pl.jakubkrys.lambda_expressions.lambda_with_exceptions;

import java.util.*;

public class FinderExamples {
    public static void main(String[] args) {

        // Women finder
        Finder<String> womenFinder = names -> {
            List<String> found = new ArrayList<>();
            for (String name : names){
                if (name.endsWith("a")){
                    found.add(name);
                }
            }
            if (found.isEmpty()) {
                throw new NoFoundException();
            } else {
                return found;
            }
        };

        List<String> names = List.of("Marek","Kasia","Ania","Mateusz","Jurek");

        try {
            System.out.println(womenFinder.find(names));
        } catch (NoFoundException e) {
            System.out.println("Woman not found.");
        }

        // Men finder
        Finder<String> menFinder = allNames -> {
            List<String> found = new ArrayList<>();
            for (String name : allNames){
                if (!name.endsWith("a")){
                    found.add(name);
                }
            }
            if (found.isEmpty()) {
                throw new NoFoundException();
            } else {
                return found;
            }
        };

        try {
            System.out.println(menFinder.find(names));
        } catch (NoFoundException e) {
            System.out.println("Men not found.");
        }

        // Even numbers finder
        Finder<Integer> evenNumbersFinder = numbers -> {
            List<Integer> found = new ArrayList<>();
            for (int i : numbers){
                if (i%2 == 0){
                    found.add(i);
                }
            }
            if (found.isEmpty()) {
                throw new NoFoundException();
            } else {
                return found;
            }
        };

        List<Integer> numbers = List.of(1,5,98,345,7567,54234,3,4,25,5234534,2302,34654,7,5476,2,3,5646,6,56788,56667,54);

        try {
            System.out.println(evenNumbersFinder.find(numbers));
        } catch (NoFoundException e) {
            System.out.println("Even numbers not found.");
        }
    }
}