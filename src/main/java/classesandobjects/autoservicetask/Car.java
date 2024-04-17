package classesandobjects.autoservicetask;

public class Car
{
    String plateNumber;
    int kmWhenEnteredTheServices;
    String color;
    String make;
    String model;


    //Constructorul de mai jos primeste 3 parametri de intrare, in rezultat ca crea un obiect Car despre care se va conaste
    //marca, modelul, culoarea dar nu si numarul de inmatriculare sau km

    public Car(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }
    public Car(String makeParametruDeIntrare, String modelFormalParameter, String colorLocalVariable)
    {
        this.make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.color = colorLocalVariable;
    }



}
