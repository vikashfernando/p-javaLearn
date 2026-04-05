public class main3{
    public static void main(String[] args){

        String fName="vikash";
        String lName="fernando";

        String fullName=fName+lName;
        String sentenceToDisplay="my name is "+fullName+" and my last name is "+lName;

        System.out.println(fullName);
        System.out.println(sentenceToDisplay);
        System.out.println("*****************************");


        //String methods
            //1 length of a string
            //2 index of a letter
            //3 convert to uppercase
            //4 convert to lowercase


        System.out.println(fullName.length());          //1
        System.out.println(fullName.indexOf("i"));      //2
        System.out.println(fullName.toUpperCase());     //3
        System.out.println(fullName.toLowerCase());     //4


    }
}