package pl.jakubkrys.lambda_expressions.introduction;

public class NumberTest {
    public static void main(String[] args) {

        System.out.println("----- isEven -----");
        Validator isEven = (n) -> n%2 == 0;
        System.out.println("23: "+isEven.validate(23));
        System.out.println("46: "+isEven.validate(46));
        System.out.println("9: "+isEven.validate(9));

        System.out.println("----- isFromRange -----");
        Validator isFromRange = (n) -> n >= 5 && n <= 55;
        System.out.println("23: "+isFromRange.validate(23));
        System.out.println("146: "+isFromRange.validate(146));
        System.out.println("9: "+isFromRange.validate(9));
        System.out.println("-122: "+isFromRange.validate(-122));
    }
}