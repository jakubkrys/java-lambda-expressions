package pl.jakubkrys.lambda_expressions.lambda_expressions_introduction;

@FunctionalInterface
public interface Validator {

    boolean validate(int value);
}
