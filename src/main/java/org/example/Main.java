package org.example;


public class Main {
    private void printMin(double[] array){
        int pos = arrayMin(array);
        System.out.println("Min value = " + array[pos]);
        System.out.println("Position of this value = " + pos);
    }

    private void printMax(double[] array){
        int pos = arrayMax(array);
        System.out.println("Max value = " + array[pos]);
        System.out.println("Position of this value = " + pos);
    }

    public int arrayMax(double[] array){
        int position = 0;
        int i = 0;
        double Max = array[0];
        for (double value:array){
            if (value>Max) position = i;
            i++;
        }
        return position;
    }

    public int arrayMin(double[] array){
        int position = 0;
        int i = 0;
        double Min = array[0];
        for (double value:array){
            if (value<Min) position = i;
            i++;
        }
        return position;
    }

    public double arraySum(double[] array){
        double sum = 0;
        for (double value:array){
            sum += value;
        }
        return sum;
    }

    public double arrayAverage(double[] array){

        return arraySum(array)/array.length;
    }

    public int lengthOfArray (double startX, double endX,double deltaX){
        return (int) Math.ceil((endX-startX)/deltaX)+1;
    }
    public double[] generateArray(double startX, double endX,double deltaX){
        int length =  lengthOfArray (startX, endX, deltaX);
        double[] array = new double[length];
        double progressX = startX;
        int i = 0;

        while (progressX<= endX){
            array[i] = progressX;
            i++;
            progressX+= deltaX;
        }

        return array;
    }

    public double[] calculateArray(double[] array){
        int length =  array.length;
        double[] Y = new double[length];
        int i = 0;

        for (double x:array){
            Y[i] = calculateFunction(x);
            i++;
        }
        return Y;
    }
    final double a = 2.7;
    final double b = -0.3;
    final double c =4;
    private double calculateFirst(double X){
        return Math.pow(X,2)*a+X*b+c;
    }

    private double calculateSecond(double X){
        return a/X+Math.sqrt(Math.pow(X,2) + 1);
    }
    private double calculateThird(double X){
        return (a+b*X)/Math.sqrt(Math.pow(X,2) + 1);
    }
    public double calculateFunction(double X){
        if (X<1.4){
            return calculateFirst(X);
        } else if (X == 1.4) {
            return calculateSecond(X);
        } else {
            return calculateThird(X);
        }
    }

    public void run(){
        int currentSize = lengthOfArray(0.0,2.0,0.002);
        double[] listOfX = new double[currentSize];
        double[] listOfY = new double[currentSize];

        listOfX = generateArray(0.0,2.0,0.002);
        listOfY = calculateArray(listOfX);

        System.out.println("For X array");
        printMin(listOfX);
        printMax(listOfX);
        System.out.println("For Y array");
        printMin(listOfY);
        printMax(listOfY);

        System.out.println("Average Y: "+ arrayAverage(listOfY));

    }
    public static void main(String[] args) {

        new Main().run();
    }
}