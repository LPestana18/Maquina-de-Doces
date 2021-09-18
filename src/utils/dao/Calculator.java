package utils.dao;

import utils.entities.CoinBundle;

public interface Calculator {

    int calculateTota(CoinBundle enteredCoins);
    CoinBundle calculateChange(int amountMoneyToReturn);
}
