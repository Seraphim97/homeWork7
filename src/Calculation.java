import java.util.Random;

public class Calculation {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        final int LENGTH = 5;
        System.out.println(myArray.length);
        Random rd = new Random();
        int i;
        for (i = 0; i < LENGTH; i++); {
            System.out.println("This field № " + i);

        }



        //3.2
        int[] myArrayTwo = new int[10];
        for(i = 0; i < myArrayTwo.length; i++); {

            System.out.println("This field " + i);
        }


    }
}
