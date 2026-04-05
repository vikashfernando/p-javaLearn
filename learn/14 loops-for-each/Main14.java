/*
why we use for-each loop” 😊 ????
    It is a simple way to read all values in an array or list.
*/

public class Main14{
    public static void main(String[] args){


        //create an array
        String[] lst1={"vikash","22","colombo","black","strawberry"};


        //print the elemnts using a for-each loop

        for(String i:lst1){
            System.out.println(i);
        }



        System.out.println(" ");
        /*
        but u can do the same thing using a for loop(but its bit hard....
        that's why we use for-each loop to access elemnts in an array <3
         */

        for(int i=0;i<lst1.length;i++){
            System.out.println(lst1[i]);
        }


    }
}