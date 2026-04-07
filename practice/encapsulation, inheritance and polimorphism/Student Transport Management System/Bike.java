public class Bike extends Transport{
    private int parkingFee;
    private String helmetNumber;

    public Bike(String vehicleId,String route,int distance,int parkingFee,String helmetNumber){
        super(vehicleId,route,distance);
        this.helmetNumber=helmetNumber;
        setParkingFee(parkingFee);
    }

    public int getParkingFee(){
        return this.parkingFee;
    }
    public String getHelmetNumber(){
        return this.helmetNumber;
    }

    public void setHelmetNumber(String helmetNumber){
        this.helmetNumber=helmetNumber;
    }
    public void setParkingFee(int parkingFee){
        if(parkingFee>0){
            this.parkingFee=parkingFee;
        }else{
            System.out.println("invalid parking fee amount...");
        }
    }
}

