public class SchoolBus extends Vehicle implements FeeCalculator{
    //attributes
    private int capacity;
    //constructor
    public SchoolBus(String vehicleId,String route,int distance,int capacity){
        super(vehicleId,route,distance);
        this.capacity=capacity;
    }
    //implemented abstract method
    @Override
    void showVehicleType(){
        System.out.println("bus");
    }
    //implemented interface method
    @Override
    public void calculateFee(){
        System.out.println(getDistance()*10);
    }
    //show details polimorphism-Override
    @Override
    public void showBasicDetails(){
        System.out.println("***********************");
        super.showBasicDetails();
        System.out.println(this.capacity);
        System.out.println("***********************");
    }
}
