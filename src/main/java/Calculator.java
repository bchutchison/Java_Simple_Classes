public class Calculator {

    private double num1;
    private double num2;


//    constructor
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

//    methods
    public double addNumber() {
        return this.num1 + this.num2;
    }

    public double subtractNumber() {
        return this.num1 - this.num2;
    }

    public double multiplyNumber() {
        return this.num1 * this.num2;
    }

    public double divideNumber() {
        return this.num1 / this.num2;
    }


}
