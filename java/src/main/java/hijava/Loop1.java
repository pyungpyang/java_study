package hijava;

public class Loop1 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if (i % 2 == 0)
                continue;
            if (i > 5) {
                break;
            }
                System.out.println("TTTTTTTT" + i);
            }
        }
    }
