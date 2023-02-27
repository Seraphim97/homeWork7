import java.util.Random;

public class Calculation {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        final int LENGTH = 5;
        System.out.println(myArray.length);
        Random rd = new Random();
        int i;
        for (i = 0; i < LENGTH; i++) {
            myArray[i] = rd.nextInt();
            System.out.println(i + " " +myArray[i]);

        }



        //3.2
        int[] myArrayTwo = {1,2,3,4,5,6,7,8};
        for(i = 0; i < myArrayTwo.length; i++) {
            System.out.println(myArrayTwo[i]);

        }

        int[] myArrayThree = {1,2,3,4,5,6,7,8,9,10};
        int a = 0;
        for (i = 0; i < myArrayTwo.length; i++) {
            if (myArrayTwo[i] % 2 == 0) {
                myArrayThree[a] = myArrayTwo[i];
                a++;
            }
        }
        int b = 0;
        while (b < myArrayThree.length) {
            System.out.println(b + " " +myArrayThree[a]);
            b++;
        }



    }
}
