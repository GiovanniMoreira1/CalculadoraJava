package model;

public class Div extends OperacaoMatematica{
    @Override
    public double calcula(double num1, double num2) {
        return num1 / num2;
    }
}
