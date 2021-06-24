package pl.jakubkrys.lambda_expressions.lambda_as_argument;

@FunctionalInterface
public interface Criteria {
    boolean isFit(Person person);
}