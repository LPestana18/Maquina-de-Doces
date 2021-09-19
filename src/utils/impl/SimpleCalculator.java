package utils.impl;

import utils.dao.Calculator;
import utils.entities.CoinBundle;

// class que implementa a interface Calculator
public class SimpleCalculator implements Calculator {

    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;

        change.number5CentsCoins = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        change.number2CentsCoins = remainingAmount / 2;
        remainingAmount = remainingAmount % 2;

        change.number1CentsCoins = remainingAmount / 1;
        remainingAmount = remainingAmount % 1;
        return change;
    }
}
