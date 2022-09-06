package oriented;

import java.util.stream.IntStream;

public class HelloTaeHeeService2 implements HelloTaeHee{

    @Override
    public void getdata(String data) {

        IntStream.range(0,10).forEach( i ->  {
            System.out.println("num = " + i);
            System.out.println("service 2 = " + data);
        });
    }
}