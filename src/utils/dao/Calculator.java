package utils.dao;

import utils.entities.CoinBundle;

public interface Calculator {

    // metodo para calcular o total
    int calculateTotal(CoinBundle enteredCoins);

    // metodo para calcular a mudança de moeda
    // metodo de troco
    CoinBundle calculateChange(int amountMoneyToReturn);
}
