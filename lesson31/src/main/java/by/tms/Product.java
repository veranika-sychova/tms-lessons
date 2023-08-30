package by.tms;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    private String name;
    @Id
    private Integer id;
    @Column (name = "belarussian")
    private boolean isForeignProduct;
    @Column(name = "manufacture_date")
    private Date dateOfManufacture;
    @Enumerated (EnumType.STRING)
    @Column(name = "product_type")
    private ProductType productType;
    @Embedded
    private Price price;


    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isForeignProduct() {
        return isForeignProduct;
    }

    public void setForeignProduct(boolean foreignProduct) {
        isForeignProduct = foreignProduct;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
