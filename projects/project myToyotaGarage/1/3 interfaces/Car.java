public class Car extends ToyotaVehicle implements safetySense{
    private int cc;

    public Car(String m,double p,int c,int ec){
        super(m,p,c);
        cc=ec;
    }

    @Override
    public void horn(){
        System.out.println("dhanulaaaaaaaaaaaaaaaaaaaaa");
    }

    @Override
    public void engineStart(){
        System.out.println("engine started...");
    };

    @Override
    public void safetyCheck(){
        System.out.println("safetyChecked...");
    };

    //interface
    @Override
    public void autoBraking(){
        System.out.println("auto braking on");
    };
    @Override
    public void laneDeparture(){
        System.out.println("lane departure on");
    };
}