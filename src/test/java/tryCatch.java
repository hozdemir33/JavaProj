import java.util.Arrays;

public class tryCatch {

    public static void main(String[] args) {


        try {

            int a[] = {2, 3, 4, 5};
            System.out.println(a[5]);// this is where we get the exception

        } catch (Exception e) {

            // System.out.println("There is an error and pass it on now!");// this is the message you can pass it to non technical people.

        }


        try {

            int a = 0;

            System.out.println(4 / 0);//  it is an Arithmetic exceptions


        } catch (Exception e) {

            System.out.println("This exception is an Aritmetic Exception");

        }


    }

}




