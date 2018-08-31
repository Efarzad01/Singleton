package NestedLoop;

public class NL {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.print(i + " ----> ");

            for(int j =0; j<3; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
