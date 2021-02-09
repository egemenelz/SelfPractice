package replit;

public class GasTank {
    private double amountOfType, capacityOfType;

    public GasTank(double capacityOfType){
        this.capacityOfType = capacityOfType;
        amountOfType = 0;
    }
    public void addGas(double value){
        if (amountOfType > capacityOfType){
            amountOfType = capacityOfType;
        }else{
            amountOfType += value;
        }

    }
    public void useGas(double value){
        if (amountOfType < 0){
            amountOfType = 0;
        }else{
            amountOfType -= value;
        }
    }
    public boolean isEmpty(){
        if (amountOfType < 0.1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (amountOfType > 0.1){
            return true;
        }else{
            return false;
        }
    }
    public double getGasLevel(){
        return amountOfType;
    }
    public double fillUp(){
        double fillup = capacityOfType - amountOfType ;
        return amountOfType + fillup;
    }

}
/*
A method named addGas that accepts a parameter of type double.
The value of the amount instance variable is increased by the value of the parameter.
However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
 */