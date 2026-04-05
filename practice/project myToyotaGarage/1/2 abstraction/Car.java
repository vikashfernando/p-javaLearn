public class Car extends ToyotaVehicle{
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
}