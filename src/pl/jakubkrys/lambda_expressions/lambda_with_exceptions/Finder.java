package pl.jakubkrys.lambda_expressions.lambda_with_exceptions;

import java.util.*;

@FunctionalInterface
public interface Finder<T> {
    List<T> find (List<T> people) throws NoFoundException;
}