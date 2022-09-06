package hijava;

public class Oper {
    
    public static void main(String[] args) {
        int i = 0;
        System.out.println("i = " + i);

        i++;  // i = i + 1
        System.out.println("i = " + i);
        
        i--; // i = i - 1
        int j = i++;
        System.out.println("i = " + i + ", j =" + j);

        int a = 3;
        System.out.println(a+=1);

        int b = 6;
        System.out.println(a*=b);

        int k = (i > 0) ? 100 : 1000;
        System.out.println("k = " + k);
        
        int l = !(i > 0) ? 100 : 1000; // ! = not
        System.out.println("l = " + l);

        int c = 5<<3;
        System.out.println(c);
    }
}
