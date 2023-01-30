package org.example;

public class AdvanceMath {


    private  BasicMath basicMath = new BasicMath();
    static final double LOOP_TIMES = 3.0;

    public double multiplySumBy5(double input1, double input2){
      //  double sum = basicMath.add(input1, input2);
        return  basicMath.multiply(basicMath.add(input1, input2), 5);
    }
    public double multiplyDifferenceBy5(double input1, double input2){
  /*      double diff = basicMath.subtract(input1, input2);*/
        return  basicMath.multiply(basicMath.subtract(input1, input2), 5);
    }

    public  double squareOfSum(double input1, double input2){
      /*  double sum = basicMath.add(input1, input2);*/
        return  basicMath.multiply(basicMath.add(input1, input2), basicMath.add(input1, input2));
    }

    public  double getPercentage(double input1, double input2){
  /*      double quotient = basicMath.divide(input1, input2);*/
        return  basicMath.multiply(basicMath.divide(input1, input2), 100);
    }

}
