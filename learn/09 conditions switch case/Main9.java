public class Main9{
    public static void main(String[] args){

        //conditions(fixed values)
        //switch only checks fixed values

        int age=21;

        switch(age){
            case 17:
                System.out.println("adult");
                break;
            case 18:
                System.out.println("kid");
                break;
            case 19:
                System.out.println("elligible");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}