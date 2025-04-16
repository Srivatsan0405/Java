public class number_name {
    public static void main(String[] args) {
        int n = 345;
        System.out.println(name(n));
    }

    public static String name(int number) {
        String[] ones = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
        };

        if (number == 0) {
            return "zero";
        }

        String result = "";

        if (number >= 100) {
            result += ones[number / 100] + " hundred";
            number = number % 100;
            if (number > 0) {
                result += " ";
            }
        }

        if (number < 20) {
            result += ones[number];
        } else {
            result += tens[number / 10];
            if (number % 10 != 0) {
                result += " " + ones[number % 10];
            }
        }

        return result;
    }
}
