package de.mysh.calcapp._main;
import de.mysh.calcapp.util.Calculator;
import de.mysh.calcapp.service.ResultWriteService;


public class _Main {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;
        int y = Calculator.summarise(num1, num2);
        ResultWriteService.printTheResult(num1, num2, y, "Сумма ");
        y = Calculator.subtract(num1, num2);
        ResultWriteService.printTheResult(num1, num2, y, "Разность ");
        y = Calculator.multiply(num1, num2);
        ResultWriteService.printTheResult(num1, num2, y, "Произведение ");
    }
}
