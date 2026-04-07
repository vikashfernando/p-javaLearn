public class Bus extends Transport{
    private int capacity;
    private int feePerKm;

    public Bus(String vehicleId,String route,int distance,int capacity,int feePerKm){
        super(vehicleId,route,distance);
        this.capacity=capacity;
        this.feePerKm=feePerKm;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getFeePerKm(){
        return this.feePerKm;
    }
    public void setCapacity(int capacity){
        if(capacity>0){
            this.capacity=capacity;
        }else{
            System.out.println("invalid number, pls check again");
        }
    }
    public void setFeePerKm(int feePerKm){
        if(feePerKm>0){
            this.feePerKm=feePerKm;
        }else{
            System.out.println("invalid amount...");
        }
    }

}
