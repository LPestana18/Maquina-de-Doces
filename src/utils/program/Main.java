package utils.program;

import utils.dao.VendingMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = null;

        vendingMachine.displayProducts();

        String selectedProducts = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProducts);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.next();

        int[] enteresCoins = {};

        vendingMachine.enterCoins(enteresCoins);
        vendingMachine.displayChangeMessage();
    }
}
