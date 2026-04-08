public class Bus extends Transport{
    private int capacity;
    private int feePerKm;

    public Bus(String id,String name,int age,String vehicleId,String route,int distance,int capacity,int feePerKm){
        super(id,name,age,vehicleId,route,distance);
        setCapacity(capacity);
        setFeePerKm(feePerKm);
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

    @Override
    public void calculateMonthlyFee(){
        int fee=(super.getDistance())*feePerKm*20;
        System.out.println(fee);
    }
}
