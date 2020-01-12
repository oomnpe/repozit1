import org.w3c.dom.ls.LSOutput;

import static java.lang.Character.getNumericValue;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        Main Numbers = new Main();
        Numbers.sumDigits(10071);
        System.out.println(Numbers.allSumNumbers);
    }

    char Number;
    int allSumNumbers;

    public Integer sumDigits(Integer number) {

        for (int i = 0; i < Integer.toString(number).length(); i++) {
            Number = Integer.toString(number).charAt(i);
            allSumNumbers = Character.digit(Number, 10) + allSumNumbers;
            // allSumNumbers = getNumericValue(Number) + allSumNumbers;   //второй вариант
        }
        return allSumNumbers;
    }
}
//1кк

