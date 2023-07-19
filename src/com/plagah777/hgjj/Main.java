public class Main {
    public static void main(String[] args) {
//        double latitude = 13.5555;
//        double longtitude = 100.5555;
//        String outputText = "(" + latitude + " ," + longtitude + ")";
//        System.out.println(outputText);

//        -- convert string to int --
//         String numberText = "23";
//         int number = Integer.parseInt(numberText);
//         System.out.println(number+5); //28
//
////        -- convert string to double --
//        String numberText2 = "13.1234";
//        double number2 = Double.parseDouble(numberText2);
//        System.out.println(number2+123.5555);

//        -- oparetion --
//        double firstNumber = 15;
//        double secoundNumber = 4;
//        System.out.println(firstNumber + secoundNumber);
//        System.out.println(firstNumber - secoundNumber);
//        System.out.println(firstNumber * secoundNumber);
//        System.out.println(firstNumber / secoundNumber);
//        System.out.println(firstNumber % secoundNumber);

//        int firstNumber = 15;
//        firstNumber++; // 15 + 1
//        firstNumber+= 15; // 16 + 15
//        System.out.println(firstNumber); // 31

//        double firstNumber = 15;
//        firstNumber /= 2;
//        System.out.println(firstNumber); // 7.5

//        -- compare --
//        double firstNumber = 15;
//        double secoundNumber = 12;
//        System.out.println(firstNumber > secoundNumber); // true
//        System.out.println(firstNumber < secoundNumber); // false
//        System.out.println(firstNumber == secoundNumber); // false
//        System.out.println(firstNumber >= secoundNumber); // true
//        System.out.println(firstNumber <= secoundNumber); // false
//        System.out.println(firstNumber != secoundNumber); // true

//            boolean isUserCorrect = true;
//            boolean isPassewordCorrect = false;
//        System.out.println(isUserCorrect && isPassewordCorrect); // false
//        System.out.println(isPassewordCorrect || isUserCorrect); // true
//        System.out.println(!isUserCorrect); //false

//        -- conditions --
//        double originalPrice = 6000;
//        double finalPrice = originalPrice;
////        if (originalPrice > 10000) {
////            finalPrice = originalPrice - (originalPrice * 15 /100);
////        } else if (originalPrice > 6000) {
////            finalPrice = originalPrice - 0.1 * originalPrice;
////        } else if (originalPrice > 3000) {
////            finalPrice = originalPrice - 0.08 * originalPrice;
////        } else {
////            finalPrice = originalPrice - 0.05 * originalPrice;
////        }
//        System.out.println(finalPrice);

//        -- loop --
//        for (int i = 11; i <= 20 ; i++) {
//            System.out.println(i);
//        }

//        int result = 0;
//        for (int a = 2; a <= 12 ; a++) {
//            result += a;
//        }
//        System.out.println(result);

//        int evenNum = 0;
//        for (int i = 1; i <= 10 ; i++) {
//            if (i % 2 == 0) {
//                evenNum += i;
//            }
//        }
//        System.out.println(evenNum);

//        int evenNum = 0;
//        for (int i = 2; i <= 22 ; i++) {
//            if (i % 10 == 0) {
//                break;
//            }
//            evenNum += i;
//        }
//        System.out.println(evenNum);


        kmToMiles(20);
        milesToKm(20); // 32

        double result = kmToMiles(20); //
        System.out.println(result); // 12.5
    }

//    -- Method --
    static double kmToMiles(double km){
        double mile = km / 1.6;
//        System.out.println(mile);
        return mile;
    }

    static void milesToKm(double mile){
        double km = mile * 1.6;
        System.out.println(km);
    }
}