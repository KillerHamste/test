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
        double result = 0;

        switch (operator) {
            case "*":
                result = (int)(num1 * num2);
                return (int)result;

            case "/":
                 double  f= num1/num2;
                result = floor(f);
                return (int)result;

            case "+":
                result = num1 + num2;
                return (int)result;

            case "-":
                result = num1 - num2;
                return (int)result;

            default:
                System.out.println("что ты там мутишь ?");
        }
        ;
        return (int)result;
    }

}
