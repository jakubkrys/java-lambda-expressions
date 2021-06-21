package pl.jakubkrys.lambda_expressions.parametrized_functional_interface;

import java.util.Arrays;

public class OperationsMain {
    public static void main(String[] args) {

        System.out.println("----- HOW MANY 'K' -----");
        MathOperations <Integer,String> howManyK = (t) -> {
            Integer counter = 0;
            for (int i = 0; i < t.length(); i++) {
                if (t.substring(i,i+1).contains("K") || t.substring(i,i+1).contains("k")){
                    counter++;
                }
            }
            return counter;
        };

        System.out.println(howManyK.operations("Kotek Marek pije kawę i zażywa tabakę."));
        System.out.println(howManyK.operations("Pomarańczowi mają już zapewniony awans do kolejne fazy mistrzostw Europy."));
        System.out.println(howManyK.operations("Wkraczamy w taką fazę turnieju, w której jednocześnie rozgrywane są dwa spotkania."));

        System.out.println();
        System.out.println("----- GIMME TABLE -----");
        MathOperations <Integer[],Integer> nLengthTable = (t) -> {
          Integer[] table = new Integer[t];
            for (int i = 0; i < t; i++) {
                table[i] = i;
            }
            return table;
        };

        System.out.println(Arrays.toString(nLengthTable.operations(10)));
        System.out.println(Arrays.toString(nLengthTable.operations(25)));
        System.out.println(Arrays.toString(nLengthTable.operations(19)));
    }
}