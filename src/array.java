
public class array {


    private final String[] array_arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private final String[] array_rom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private final char[] operator = {'+', '-', '*', '/'};


    public String toDefine(String input) {
        String tmp = "";

        for (int i = 0; i < array_arabic.length && i<array_rom.length; i++) {
            if (input.toUpperCase().equals(array_arabic[i])) {
                tmp = "arabic";
                return tmp;
            }
            for (int j = 0; j < array_rom.length; j++) {

                if (input.toUpperCase().equals(array_rom[j])) {
                    tmp = "rom";
                    return tmp;
                }
            }
        }

        return "Проверьте введенные данные!";
}

    public int romToArabic(String input){

        switch (input){
            case "I": return 1;

            case "II": return  2;

            case "III": return  3;

            case "IV": return  4;

            case "V": return 5;

            case "VI": return 6;

            case "VII": return 7;

            case "VIII": return  8;

            case "IX": return  9;

            case "X": return   10;

            default:
                System.out.println("Число превышает число 10");
                return 0;
        }
    }

}
