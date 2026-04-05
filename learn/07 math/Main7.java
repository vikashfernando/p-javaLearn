public class Main7{
    public static void main(String[] args){

        // 1 find min and max
        // 2 how to use random module


        //find min and max
        int a=2;
        int b=4;
        int c;

        c=Math.min(a,b);
        System.out.println("min is : "+c);

        c=Math.max(a,b);
        System.out.println("max is : "+c);


        //how to use random module
            // 2.1 how create a random number()
                // 2.2 convert a random generated number to int between 0 & 10


        // 2.1
        double d;
        int e;

        d=Math.random();
        System.out.println(d);

        // 2.2
        e=(int)(d*10);
        System.out.println(e);

    }
}