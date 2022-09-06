package oriented;

public class HelloTaeHeeService1 implements HelloTaeHee{
    private final DependencyInter dependencyInter = new DependencyInterRepository();

    @Override
    public void getdata(String data) {
        System.out.println("service 1 = " + data);
        System.out.println("data = " + dependencyInter.hello());
    }
}
