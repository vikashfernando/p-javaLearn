//class
public class ToyotaVehicle{
    //attributes
    private double year;
    private String color;
    private double price;


    //constructor
    public ToyotaVehicle(double y,String c,double p){
        year=y;
        color=c;
        price=p;
    }


    //methods
    public Double getYear(){
     return year;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }

    public void setYear(double newYear){
        year=newYear;
    }
    public void setColor(String newColor){
        color=newColor;
    }
    public void setPrice(int newPrice){
        price=newPrice;
    }


    public void startEngine(){
        System.out.println("engine started");
    }
    public void stopEngine(){
        System.out.println("engine stopped");
    }

    public void displayInfo(){
        System.out.println("this - "+year);
    }

    public final void saftyCheck(){
        System.out.println("safty sensors checked");
    }

}