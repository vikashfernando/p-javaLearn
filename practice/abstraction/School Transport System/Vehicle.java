abstract class Vehicle implements FeeCalculator{
    //attributes
    private String vehicleId;
    private String route;
    private int distance;
    //constructor
    public Vehicle(String vehicleId,String route,int distance){
        this.vehicleId=vehicleId;
        this.route=route;
        this.distance=distance;
    }
    //getters
    public int getDistance(){
        return this.distance;
    }
    public String getVehicleId(){
        return this.vehicleId;
    }
    public String getRoute(){
        return this.route;
    }
    //show details
    public void showBasicDetails(){
        System.out.println(vehicleId);
        System.out.println(route);
        System.out.println(distance);
    }
    //abstract method
    abstract void showVehicleType();
    //interface method
    @Override
    public void calculateFee(){
    }
}
