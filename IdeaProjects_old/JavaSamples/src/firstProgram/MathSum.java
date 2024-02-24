package firstProgram;

import java.sql.SQLOutput;

public class MathSum {
    public int add(int firstNumber,int secondNumber)
    {
        int result= firstNumber + secondNumber;
        System.out.println(+result);
    return result;
}
public int sub(int firstNumber,int secondNumber)
{
    int result= firstNumber-secondNumber;
System.out.println(result);
return result;
    }
    public void mul(int firstNumber,int secondNumber){
        int result= firstNumber * secondNumber;
        System.out.println(result);
    }

    public static void main(String[] args) {
        MathSum mathSum = new MathSum();
        int resultofadd= mathSum.add(200,100);
        int resultofsub= mathSum.sub(100,50);
        mathSum.mul(resultofadd,resultofsub);
    }
}
