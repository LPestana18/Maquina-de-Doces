package utils.program;

import utils.dao.VendingMachine;
import utils.entities.Coin;
import utils.impl.TextBasedVendingMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProducts = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProducts);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.next();

        int[] enteresCoins = Coin.parseCoins(userEnteredCoins);

        vendingMachine.enterCoins(enteresCoins);
        vendingMachine.displayChangeMessage();
    }
}
