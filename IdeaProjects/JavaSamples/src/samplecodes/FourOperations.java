package samplecodes;

public class FourOperations {
    public void add()
    {int a=10;int b=5;
        int result=a+b;
        System.out.println("sum"+result);

    }
public void sub()
{int a=90;int b=10;
  int result=a-b;
    System.out.println("difference"+result);
    }
    public void mul() {
        int a=100;int b=5;
        int result=a*b;
        System.out.println("product"+result);
    }
    public void div(){
        int a=500;int b=10;
        int result=a/b;
        System.out.println("quotient"+result);
    }

    public static void main(String[] args) {
        FourOperations fouroperations=new FourOperations();
        fouroperations.add();
        fouroperations.sub();
        fouroperations.mul();
        fouroperations.div();
    }
}
