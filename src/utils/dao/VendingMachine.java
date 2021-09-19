package utils.dao;

public interface VendingMachine {

    // mostra os produtos na tela do usuario
    void displayProducts();

    // seleciona o produto
    void selectProduct(int product);

    // mostra a mensagem de exemplo para entrada da moeda
    void displayEnterCoinsMessage();

    // entrada das moedas
    void enterCoins(int... coins);

    // mostra uma mensagem de troco
    void displayChangeMessage();
}
