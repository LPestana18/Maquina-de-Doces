package utils.entities;

// objeto produto
// tipos dos produtos
public enum Product {
    CANDYA(1, 6), CANDYB(2, 7), CANDYC(3, 8);

    private int id;
    private int price;

    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public static Product valueOf(int productSelected) {
        for (Product product : Product.values()) {
            if (productSelected == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
