package pl.jakubkrys.lambda_expressions.parametrized_functional_interface;

public class CalculatorMain {
    public static void main(String[] args) {

        System.out.println("----- MULTIPLY -----");

        Calculator <Integer> multiply = (tab) -> {
            int multi = 1;
            for (int i : tab){
                multi *= i;
            }
            return multi;
        };

        System.out.println(multiply.calculate(new Integer[]{2,4,6,8,10}));
        System.out.println(multiply.calculate(new Integer[]{1,3,5,7,11}));
        System.out.println(multiply.calculate(new Integer[]{21,14,26,8,1}));

        System.out.println("----- SUM -----");

        Calculator <Integer> sum = (tab) -> {
            int summary = 0;
            for (int i : tab){
                summary += i;
            }
            return summary;
        };

        System.out.println(sum.calculate(new Integer[]{2,4,6,8,10}));
        System.out.println(sum.calculate(new Integer[]{1,3,5,7,11}));
        System.out.println(sum.calculate(new Integer[]{21,14,26,8,1}));
    }
}