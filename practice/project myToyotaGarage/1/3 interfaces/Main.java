public class Main{
    public static void main(String args[]){

        Car axio1=new Car("g",2,15,1500);

        ToyotaVehicle axio2=new Car("g",2,15,1500);

        axio1.safetyCheck();
        axio1.horn();
        axio2.safetyCheck();
        axio2.horn();

    }
}