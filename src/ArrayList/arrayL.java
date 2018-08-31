package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayL {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(0,10);    //to add ArrayList the the method
                                        //we use is list.add or object.add
        list.add(1,11);
        list.add(2,13);

        /*System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));*/
        for(Integer I : list ) {
            System.out.println(I);
        }

    }
}
