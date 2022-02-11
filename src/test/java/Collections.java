
import java.util.*;
import java.util.List;

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

        List<String> kk = new ArrayList<>();
        kk.add("apple");
        kk.add("orages");
        kk.add("banana");
        kk.add("dates");

        Iterator<String> ss = kk.iterator();

        while (ss.hasNext()){
            System.out.println(ss.next());

        }
        System.out.println("======");

        ArrayList<Integer> numList= new ArrayList<>();

        numList.add(3);
        numList.add(14);
        numList.add(2);
        numList.add(13);
        numList.add(12);

       Iterator<Integer> nn= numList.iterator();

       while(nn.hasNext()){
           System.out.print(nn.next());
       }

        System.out.println("=====");


       //Difference between Iterator and ListIterator

        List<String> list1=new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(list1);//[a,b,c]

                Iterator<String> val=  list1.iterator();

                while (val.hasNext()){
                 String element= val.next();
                    System.out.println(element);

                }


                //Within Iterator, there is NO hasPrevious() and previous() method---only one directional
                //Iterator, NO add()-- cannot add new elements by using Iterator
                //Iterator, No set()--cannot modify the elements by using Iterator

                //Both Iterator and ListIterator have the remove() method.
                //Iterator can be used in other Collections(Map,Set,List),but ListIterator can be used JUST in Lists




          }
       }

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


