package pl.jakubkrys.lambda_expressions.multiple;

public class NumbersCheckMain {
    public static void main(String[] args) {

        NumbersCheck check = (a,b,c) -> (a%5 == 0 && b%5 == 0 && c%5 == 0);
        System.out.println("10,100,5: "+check.areNumbersMultipleOf5(10, 100, 5));
        System.out.println("1,50,55: "+check.areNumbersMultipleOf5(1, 50, 55));
        System.out.println("720,440,910: "+check.areNumbersMultipleOf5(720, 440, 910));
    }
}