package dev.danvega;

public class StringCalculator {

    // add("3,1") => 4
    public int add(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    // subtract("5,2") => 3
    public int subtract(String numbers) {
        int difference = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            difference = Integer.parseInt(numbersArray[0]) - Integer.parseInt(numbersArray[1]);
        }
        return difference;
    }

}
