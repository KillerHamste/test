

public class transfer {

    private String finalRes = null;
    private int res1, res2;

    private static String[] units = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    private static String[] dozens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

    public void transferResult(String inputString) {

        char[] chars = inputString.toCharArray();
        String tmpResult1, tmpResult2;


        switch (chars.length) {
            case 1:
              //  System.out.println("Lenght = "+ chars.length);
                res1 = Character.getNumericValue(chars[0]);
                if (res1 > 0) {
                    finalRes = units[res1-1];
                    System.out.println("Результат = " + finalRes);
                } else if (res1 == 0) {
                    System.out.println("Результат = " + "Nulla");
                } else System.out.println("Результат отрицателен!");
                break;
            case 2:
               // System.out.println("Lenght = "+ chars.length);
                res1 = Character.getNumericValue(chars[0]);
                res2 = Character.getNumericValue(chars[1]);
                if (res2 > 0) {
                //    System.out.println("res1 = " + (res1 - 1));
                // /   System.out.println("res2 = " + (res2 - 1));
                    finalRes = dozens[res1 - 1] + units[res2];
                   System.out.println("Результат = " + finalRes);
                } else if (res2 == 0) {
                    finalRes = dozens[res1 - 1];
                    System.out.println("Результат = " + finalRes);
                }
                break;
            case 3:
                finalRes = "C";
                System.out.println("Результат: "+ finalRes);
                break;
        }

    }
}
