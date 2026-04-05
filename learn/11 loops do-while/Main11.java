//do-while-loops

public class Main11{
    public static void main(String[] args){

        //eg-1
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        //eg2

        i=20;
        do{
            System.out.println(i);
            i--;
        }while(i>=5);


        /*

        ? difference while & do-while loops
            while
                It checks the condition first, then runs the code.
                If the condition is false first time, the code will not run at all.
            do-while
                It runs the code first, then checks the condition.
                The code runs at least one time, even if the condition is false.
        */


    }
}
