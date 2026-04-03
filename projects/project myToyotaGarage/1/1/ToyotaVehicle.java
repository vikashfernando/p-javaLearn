public class ToyotaVehicle{
    //attributes/variables
    private double year;
    private String color;
    private double price;
    private final int chassieNumber;

    //constructor
    public ToyotaVehicle(double y,String c,double p,int cn){
        year=y;
        color=c;
        price=p;
        chassieNumber=cn;
    }


    //methods
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color=newColor;
    }
    public int getChassieNumber() {
        return chassieNumber;
    }
    public void startEngine(){
        System.out.println("engine started...");
    }
    public void horn(){
        System.out.println("piiiiiiiiiiiiip");
    }
    public final void saftyCheck(){
        System.out.println("safty checked...");
    }
}