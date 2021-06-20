package pl.jakubkrys.lambda_expressions.triangle;

@FunctionalInterface
public interface Validate {
    boolean isTrianglePossibleToConstruct (int a, int b, int c);
}
