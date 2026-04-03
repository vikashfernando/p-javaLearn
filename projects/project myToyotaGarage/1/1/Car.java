public class Car extends ToyotaVehicle{
     private int batteryCapacity;


     public Car(double y,String c,double p,int cn,int newBatteryCapacity){
         super(y,c,p,cn);
         batteryCapacity=newBatteryCapacity;
     }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int newBatteryCapacity) {
        batteryCapacity = newBatteryCapacity;
    }

    public void sportMode(){
         System.out.println("sport mode...");
    }


    @Override
    public void horn(){
        System.out.println("nisuraaaaaaaaaaaaaa");
    }


    @Override
    public String toString(){
         return("ur vehicle's battery capacity is "+batteryCapacity+" and the color is "+ getColor());
    }



}
