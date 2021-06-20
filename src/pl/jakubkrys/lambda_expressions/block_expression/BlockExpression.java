package pl.jakubkrys.lambda_expressions.block_expression;

public class BlockExpression {
    public static void main(String[] args) {

        System.out.println("----- SWAP -----");
        ArrayOperations swap = (tab,i,j) -> {
            int tmp = tab[i];
            tab [i] = tab[j];
            tab [j] = tmp;
        };
        int[] numbers = {1,2,3,4,5};

        for (int i : numbers) {
            System.out.print(i+",");
        }

        System.out.println();
        swap.modify(numbers, 0,4);

        for (int i : numbers) {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("-----  -----");
    }
}