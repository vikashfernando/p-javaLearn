public class Suv extends ToyotaVehicle{
    //attributes
    private String engineType;

    //constructor
    public Suv(double y,String c,double p,String e){
        super(y,c,p);
        engineType=e;
    }

    //methods
    public void offRoadMode(){
        System.out.println("offRoadMode on");
    }
    @Override
    public void startEngine(){
        System.out.println("high power engine turned on...");
    }

    @Override
    public String toString(){
      return ("this suv's engine type "+engineType);

    };

}
