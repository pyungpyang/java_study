package hijava;

public class sundries {
    public static void main(String[] args) {
//        for (int i = 1; i<=9; i++) {
//            if (i % 2 == 1)
//                continue;
//            System.out.println(i + "dan -----");
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//        }

//        for (int i = 1; i <= 4; i++){
//
//            for (int j = 1; j <= (4 - i); j++){
//                System.out.print(' ');
//            }
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }

            int num = 16;
            boolean isPrime = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(num + " is Prime Number");
            else
                System.out.println(num + " is not Prime Number");
        }
    }
