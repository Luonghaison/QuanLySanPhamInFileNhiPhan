import java.io.Serializable;

public class Product implements Serializable {
    private int producId;
    private String productName;
    private String manufacturer;
    private float price;

    public Product() {
    }

    public Product(int producId, String productName, String manufacturer, float price) {
        this.producId = producId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getProducId() {
        return producId;
    }

    public void setProducId(int producId) {
        this.producId = producId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producId=" + producId +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
