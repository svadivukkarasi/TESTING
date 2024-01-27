
public class Car {
    public void accessCar()
    {
        System.out.println("Accees to car details!!!");

    }
public void add()
{
    int a = 5, b = 10, sum=a+b;
    //int c =a+b;
    System.out.println("Additon : " +sum);

}

    public void soundHorn()
    {
        System.out.println("Horn Sound for car apply is applied!!!");

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        Car c1 = new Car();
        c1.add();
        c1.accessCar();
        c1.soundHorn();
    }
}