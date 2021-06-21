package pl.jakubkrys.lambda_expressions.parametrized_functional_interface;

@FunctionalInterface
public interface Calculator <T> {
    T calculate (T[] tab);
}
