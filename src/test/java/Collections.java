
import java.util.*;

public class Collections {

    public static void main(String[] args) {

        //Default array class
        //Dynamic array


        //dynamic array

//        ArrayList<Object> ar = new ArrayList<Object>();
//
//        ar.add(100);
//        ar.add(200);
//        ar.add(300);
//        ar.add(400);
//        ar.add(500);
//        ar.add(600);
//
//       // System.out.println(ar);
//
//        ArrayList<Integer> markList = new ArrayList<Integer>();
//        markList.add(300);
//        markList.add(400);
//        //System.out.println(markList);
//
         ArrayList<String> nameList = new ArrayList<String>();
//
         nameList.add("hamdi");
         nameList.add("yusuf");
         nameList.add("huseyin");
//
//        //loop
//
//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.println(nameList.get(i));
//        }
//        //System.out.println("------");
//
//        //for each loop
//        for (String s : nameList) {
//            System.out.println(s);
//        }

       // System.out.println("==========");
        //iterator
        Iterator<String> it = nameList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());


        }
    }
}
