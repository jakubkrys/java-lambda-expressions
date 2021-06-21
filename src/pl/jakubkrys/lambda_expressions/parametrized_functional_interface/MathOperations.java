package pl.jakubkrys.lambda_expressions.parametrized_functional_interface;

@FunctionalInterface
public interface MathOperations <V,T> {
    V operations (T t);
}
