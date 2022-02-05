import java.util.ArrayList;
import java.util.List;

public class list {


    public static void main(String[] args) {

        //Creating a List- String elements
        List<String> list =new ArrayList<String>();
        //Creating a List- Interger elements
       // List<Integer> listt= new ArrayList<Integer>();
        list.add("Hasan");
        list.add("Husey");
        list.add("Burak");
        list.add("Vedat");
        list.add("Mahmut");

      for(String name:list){
     //     System.out.println(name);
      }

      List<Integer> numbers=new ArrayList<Integer>();

      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);

         for(Integer numerical:numbers){
             System.out.println(numerical);
         }


        //Creating a List
        List<String> list1=new ArrayList<String>();

         list1.add("apple");
         list1.add("oranges");
         list1.add("banana");

         for(String fruits:list1){
             System.out.println(fruits);


         }

    }
}
