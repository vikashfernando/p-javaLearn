public class Suv extends ToyotaVehicle{
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

}