public class Van extends Transport{
    private String ownerName;
    private int feePerKm;

    public Van(String id,String name,int age,String vehicleId,String route,int distance,String ownerName,int feePerKm){
        super(id,name,age,vehicleId,route,distance);
        this.ownerName=ownerName;
        setFeePerKm(feePerKm);
    }

    public String getOwnerName(){
        return this.ownerName;
    }
    public int getFeePerKm(){
        return this.feePerKm;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
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
