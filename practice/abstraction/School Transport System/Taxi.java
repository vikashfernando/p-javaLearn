public class Taxi extends Vehicle implements FeeCalculator{
    //attributes
    private Boolean hasAC;
    //constructor
    public Taxi(String vehicleId,String route,int distance,Boolean hasAC){
        super(vehicleId,route,distance);
        this.hasAC=hasAC;
    }
    //implemented abstract method
    @Override
    void showVehicleType(){
        System.out.println("Taxi");
    }
    //implemented interface method
    @Override
    public void calculateFee(){
        if(hasAC==true){
            System.out.println(getDistance()*200);
        }else{
            System.out.println(getDistance()*100);
        }
    }
    //show details > polimorphism-Override
    @Override
    public void showBasicDetails(){
        System.out.println("***********************");
        System.out.println(getVehicleId());
        System.out.println(getRoute());
        System.out.println(getDistance());
        System.out.println(this.hasAC);
        System.out.println("***********************");
    }
}
