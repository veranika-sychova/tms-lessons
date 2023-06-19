package by.tms.lesson7.homework3.goods_supply;

import by.tms.lesson7.homework3.Document;

import java.util.Date;

public class GoodsSupply extends Document {

    private String documentNumber;
    private String productType;
    private int productsNumber;
    private Date documentDate;

    public GoodsSupply() {
    }

    public GoodsSupply(String documentNumber, String productType, int productsNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.productType = productType;
        this.productsNumber = productsNumber;
        this.documentDate = documentDate;
    }

    @Override
    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String toString() {
        return "GoodsSupply{" +
                "documentNumber='" + documentNumber + '\'' +
                ", productType='" + productType + '\'' +
                ", productsNumber=" + productsNumber +
                ", documentDate=" + documentDate +
                '}';
    }
}
