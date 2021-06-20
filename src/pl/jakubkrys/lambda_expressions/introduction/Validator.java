package pl.jakubkrys.lambda_expressions.introduction;

@FunctionalInterface
public interface Validator {

    boolean validate(int value);
}
