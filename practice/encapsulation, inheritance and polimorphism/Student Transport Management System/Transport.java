public class Transport extends Student{
    private String vehicleId;
    private String route;
    private int distance;

    public Transport(String id,String name,int age,String vehicleId,String route,int distance){
        super(id,name,age);
        this.vehicleId=vehicleId;
        this.route=route;
        setDistance(distance);
    }

    public String getVehicleId(){
        return this.vehicleId;
    }
    public String getRoute(){
        return this.route;
    }
    public int getDistance(){
        return this.distance;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public void setRoute(String route){
        this.route=route;
    }
    public void setDistance(int distance){
        if (distance>0){
            this.distance=distance;
        }else{
            System.out.println("invalid distance, pls check agin...");
        }
    }

    public void calculateMonthlyFee(){
        int monthlyFee=distance*20;
        System.out.println(monthlyFee);
    }

}
