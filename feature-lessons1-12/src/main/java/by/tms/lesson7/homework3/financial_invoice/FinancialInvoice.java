package by.tms.lesson7.homework3.financial_invoice;

import by.tms.lesson7.homework3.Document;

import java.util.Date;

public class FinancialInvoice extends Document {

    private double totalMonthlyAmount;
    private Date documentDate;
    private String documentNumber;
    private double departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(double totalMonthlyAmount, Date documentDate, String documentNumber, double departmentCode) {
        this.totalMonthlyAmount = totalMonthlyAmount;
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
        this.departmentCode = departmentCode;
    }

    @Override
    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "totalMonthlyAmount=" + totalMonthlyAmount +
                ", documentDate=" + documentDate +
                ", documentNumber='" + documentNumber + '\'' +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
