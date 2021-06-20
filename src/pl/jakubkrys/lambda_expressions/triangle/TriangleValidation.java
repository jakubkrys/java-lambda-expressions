package pl.jakubkrys.lambda_expressions.triangle;

public class TriangleValidation {
    public static void main(String[] args) {

        Validate triangleValidation = ((a, b, c) -> !(a + b <= c || a + c <= b || b + c <= a));
        System.out.println("3,4,5: "+triangleValidation.isTrianglePossibleToConstruct(3, 4, 5));
        System.out.println("12,14,513: "+triangleValidation.isTrianglePossibleToConstruct(12, 14, 513));
        System.out.println("8,10,7: "+triangleValidation.isTrianglePossibleToConstruct(8, 10, 7));
        System.out.println("90,190,4: "+triangleValidation.isTrianglePossibleToConstruct(90, 190, 4));
    }
}