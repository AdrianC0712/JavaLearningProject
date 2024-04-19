package classesandobjects.autoservicetask;

public class ManageAutoService
{
    public static void main(String[] args)
    {
        //Declararea si initializarea obiectelor folosind toate drepturile de constructori
        Car mercedesBenzSeriaE = new Car("E Class", "Mercedes", "Verde");

        mercedesBenzSeriaE.plateNumber = "PRA 985";
        mercedesBenzSeriaE.kmWhenEnteredTheServices = 154478;

        System.out.println("Masina " + mercedesBenzSeriaE.make + " de model " + mercedesBenzSeriaE.model+ " de culoarea " + mercedesBenzSeriaE.color +
                " are numarul de inatriculare " +mercedesBenzSeriaE.plateNumber + " si kilometrajul " +mercedesBenzSeriaE.kmWhenEnteredTheServices);

        Car vwPolo = new Car("HTE 455");
        Car VolvoXC90 = new Car("BOS 356");

        Tool ciocan = new Tool("Ciocan");
        ciocan.weight = 1.65;

        System.out.println("Instrumentul cu numele " +ciocan.name+ " are greutatea de " +ciocan.weight);

        Tool surubelnita = new Tool();
        Worker ionMuncitor = new Worker();
        Garage garageBavaria = new Garage();

        System.out.println("Pentru Import");


    }
}
