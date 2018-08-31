package Singleton;

public class test_singleton {
    public static void main(String[] args) {

        School sc1= School.getvalue().get(0);
        sc1.method();

        School sc2= School.getvalue().get(1);
        sc2.method();

        System.out.println(sc1.hashCode());
        System.out.println(sc2.hashCode());
    }
}
