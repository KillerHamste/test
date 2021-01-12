import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.round;

public class main {


    public static void main(String[] args) throws IOException {
        boolean _oper = false;
        array arr = new array();
        transfer tr = new transfer();
        operator op = new operator();

        float fResult = 0;
        int result;
        String[] numbers;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tpmStr = bf.readLine();

        if (tpmStr.length() <= 0) {
            System.out.println("Повторите заново ввод");
            return;
        }

        numbers = tpmStr.split(" ");
        int arrayLenght = numbers.length;
        String firstNum, secondNum, operator;
        String tmp1 = "", tmp2 = "";

        firstNum = arr.toDefine(numbers[0]);
//        System.out.println("firstNum = " + firstNum);
        tmp1 = numbers[0];
        secondNum = arr.toDefine(numbers[2]);
        tmp2 = numbers[2];
//        System.out.println("secondNum = " + secondNum);
        operator = numbers[1];
//        System.out.println("operator = " + operator);
        _oper = op.checkOperator(operator);
//        System.out.println("isOperator = " + _oper);

        boolean bool = firstNum.equals(secondNum);
//        System.out.println("isEquals = " + bool);

        int res = 0;
//        System.out.println("tmp1: " + tmp1+ "\n trmp2: " + tmp2);
        if(bool && _oper){
            switch (firstNum){
                case "arabic" :
                    res = op.doOperate(Integer.parseInt(tmp1),Integer.parseInt(tmp2), operator);
                    System.out.println("Результат: " + res);
                    break;
                case "rom":

                  int changed = arr.romToArabic(tmp1);
                  int changed2 = arr.romToArabic(tmp2);

//                    System.out.println("1 = "+ changed);
//                    System.out.println("2 = " + changed2);

                     res = op.doOperate(changed,changed2, operator);

                    tr.transferResult(String.valueOf(res));
                  //System.out.println("Результат: " + res);

                    break;
                default:
                    System.out.println("Проверьте правильность данных!");
                    break;
            }

        }

    }

}
