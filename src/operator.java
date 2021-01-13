import static java.lang.Math.*;

public class operator {


    public boolean checkOperator(String input) {
        boolean bool;
        if (input.equals("*") || input.equals("-") ||
                input.equals("/") || input.equals("+")) {
            bool = true;
        } else {
            bool = false;
        }

        return bool;
    }

    public int doOperate(int num1, int num2, String operator) {
        int result = 0;

        switch (operator) {
            case "*":
                result = num1 * num2;
                return result;

            case "/":
                result = (int)floor(num1 / num2)-1;
                return result;

            case "+":
                result = num1 + num2;
                return result;

            case "-":
                result = num1 - num2;
                return result;

            default:
                System.out.println("что ты там мутишь ?");
        }
        ;
        return result;
    }

}
