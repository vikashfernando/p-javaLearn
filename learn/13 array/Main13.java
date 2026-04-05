public class Main13{
    public static void main(String args[]){

        //create an array
            //string type array
        String[] lst1={"vikash","21","male","SE","sriLanka"};
            //int type array
        int[] lst2={21,22,16,18,19,42};

        //print an array
        System.out.println(lst1);
        System.out.println(lst2);

       /*
       Why it does NOT print the array values?
            Java does not print the array items
            It prints the memory name (address) of the array
            so...
                How to print the array correctly?
                    Using a for loop(learn this in l14 <3)
        */

        //print an element
        System.out.println(lst1[2]);

        //find the length of the array
        System.out.println(lst1.length);

    }
}