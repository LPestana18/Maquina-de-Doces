package utils.dao;

import utils.entities.CoinBundle;

public interface Calculator {

    int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int amountMoneyToReturn);
}
