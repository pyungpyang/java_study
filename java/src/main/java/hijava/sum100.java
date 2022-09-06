package hijava;

public class sum100 {
    public static void main(String[] args) {
//        int i = 0;
//        int total = 0;
//        while (i++ < 100) {
//            if (i % 2 == 0)
//                continue;
//
//            total = total + i;
//        }
//        System.out.println("total = " + total);

        int total = 0;
        for (int i = 1; i <= 100; i++ ) {
            if (i % 2 == 0)
                continue;
            total = total + i;
            System.out.println("total = " + total);
        }
    }
}
