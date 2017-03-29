/**
 * Created by akshatdas on 3/27/17.
 */
import java.util.*;
public class Calculator {
    public static Map<Character, Operation> operatorMap;

    public static void main(String[] args) {
        instantiateMap();
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        char operator = myScanner.next().charAt(0);
        int b = myScanner.nextInt();

        try {
            Operation calc = operatorMap.get(operator);
            int result = calc.operation(a, b);
            System.out.println(result);
        } catch(Exception e){
            System.out.println("Invalid Operator");
        }

        myScanner.close();
    }

    private static void instantiateMap() {
        operatorMap = new HashMap<Character, Operation>();
        operatorMap.put('+', new Addition());
        operatorMap.put('-', new Subtraction());
        operatorMap.put('*', new Multiplication());
        operatorMap.put('/', new Division());
    }
}
