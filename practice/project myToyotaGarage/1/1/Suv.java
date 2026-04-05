public class Suv extends ToyotaVehicle{
    private String engineType;

    //constructor
    public Suv(double y,String c,double p,int cn,String newEngineType){
        super(y,c,p,cn);
        engineType=newEngineType;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String newEngineType) {
        engineType = newEngineType;
    }
    public void offroadMode(){
        System.out.println("offRoad mode on...");
    }

    @Override
    public void horn(){
        System.out.println("httoooooooooooo");
    }


}
