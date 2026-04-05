public class Suv extends ToyotaVehicle implements offRoadFeatures,safetySense{
    private String engineType;

    public Suv(String m,double p,int c,String et){
        super(m,p,c);
        engineType=et;
    }

    @Override
    public void horn(){
        System.out.println("vikaaaaaaaaaaaaaaaaaaaaaaaaash");
    }

    @Override
    public void engineStart(){
        System.out.println("engine started...");
    };
    @Override
    public void safetyCheck(){
        System.out.println("safetyChecked...");
    };


    //interface methods
    @Override
    public void fourWheelOn(){
        System.out.println("four Wheel on");
    };

    @Override
    public void twoWheelOn(){
        System.out.println("two Wheel on");
    };
    @Override
    public void autoBraking(){
        System.out.println("auto braking on");
    };
    @Override
    public void laneDeparture(){
        System.out.println("lane departure on");
    };

}