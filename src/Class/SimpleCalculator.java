package Class;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double addResult = this.firstNumber + this.secondNumber;
        return addResult;
    }

    public double getSubtractionResult() {
        double subResult = this.firstNumber - this.secondNumber;
        return subResult;
    }

    public double getMultiplicationResult() {
        double multiResult = this.firstNumber * this.secondNumber;
        return multiResult;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0.0;
        } else {
            double divResult = this.firstNumber / this.secondNumber;
            return divResult;
        }
    }
}
