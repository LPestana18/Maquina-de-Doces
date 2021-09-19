package utils.entities;

// objeto para tipos de moedas
public enum Coin {
    ONE_CENTS(1), TWO_CENTS(2), FIVE_CENTS(5);

    private int value;

    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static int[] parseCoins(String coins) {
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for (int index = 0; index < numberCoinsInText.length; index++) {
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }
}
