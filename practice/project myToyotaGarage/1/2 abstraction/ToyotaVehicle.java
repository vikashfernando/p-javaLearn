public abstract class ToyotaVehicle{
    private String model;
    private double price;
    private final int chassirNumber;

    public ToyotaVehicle(String m,double p,int c){
        model=m;
        price=p;
        chassirNumber=c;
    }

    //getters & setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void horn(){
        System.out.println("beeeeeeeep");
    }

    //abstract methods
    public abstract void engineStart();
    public abstract void safetyCheck();

}