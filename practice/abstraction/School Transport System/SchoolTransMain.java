public class SchoolTransMain{
    public static void main(String[] args){

        /*
        String vehicleId,String route,int distance,int capacity
        String vehicleId,String route,int distance,Boolean hasAc
        */

        //create objects
        Vehicle v1=new SchoolBus("ks2133","highlevel",10,50);
        Vehicle v2=new Taxi("cbd6805","baseline",20,true);
        Vehicle v3=new Taxi("pk2003","galleroad",20,false);

        //check details
        v1.showBasicDetails();
        v2.showBasicDetails();
        v3.showBasicDetails();
        System.out.println("-------------------------");

        v1.calculateFee();
        v2.calculateFee();
        v3.calculateFee();
    }
}







