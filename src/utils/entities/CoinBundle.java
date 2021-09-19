package utils.entities;

// Classe CoinBundle
// Objeto que tem os tipos de moedas
public class CoinBundle {

    public int number1CentsCoins;
    public int number2CentsCoins;
    public int number5CentsCoins;

    public CoinBundle(int... enteredCoins) {
        this.number1CentsCoins = enteredCoins[0];
        this.number2CentsCoins = enteredCoins[1];
        this.number5CentsCoins = enteredCoins[2];
    }

    public int getTotal() {
        int total = 0;
        total = total + this.number1CentsCoins * 10;
        total = total + this.number2CentsCoins * 20;
        total = total + this.number5CentsCoins * 50;
        return total;
    }
}
