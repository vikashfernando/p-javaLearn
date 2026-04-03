public class Main{
    public static void main(String args[]){

        /*
        ToyotaVehicle prado1= new ToyotaVehicle(2025,"white",6);
        System.out.println(prado1.getColor());
        prado1.setColor("red");
        System.out.println(prado1.getColor());

        Car axio1=new Car(2022,"silver",2,1500);
        System.out.println(axio1.getColor());

        axio1.startEngine();
        axio1.sportMode();
        axio1.horn();
        prado1.horn();

        Suv prado2=new Suv(2026,"black",8,"diesel");
        prado2.horn();


        //dynamic binding

        ToyotaVehicle axio2=new Car(2011,"windRed",4,2000);
        axio2.horn();

         */


        /*

        //polymorphism
        ToyotaVehicle[] parkingLot1=new ToyotaVehicle[3];

        parkingLot1[0]=new Suv(2018,"white",6,"petrol");
        parkingLot1[1]=new Car(2018,"white",2,2000);
        parkingLot1[2]=new Suv(2018,"white",2,"petrol");

        for(ToyotaVehicle v: parkingLot1){
            v.startEngine();
            v.horn();
        }

         */


        Car supra=new Car(2002,"yellow",10,3000,423);
        System.out.println(supra);


    }
}

