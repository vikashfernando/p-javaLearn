public class Transport{
    private String vehicleId;
    private String route;
    private int distance;

    public Transport(String vehicleId,String route,int distance){
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



}
