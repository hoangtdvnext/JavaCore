package javapatterns.Behavioral.StrategyPattern;

/**
 * Created by hoangtd on 2/21/2017.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}