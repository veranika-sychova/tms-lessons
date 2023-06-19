package by.tms.lesson7.homework3.employee;

import by.tms.lesson7.homework3.Document;

import java.util.Date;

public class Employee extends Document {

    private String documentNumber;
    private Date documentDate;
    private Date contractEndDate;
    private String employeeName;

    public Employee() {
    }

    public Employee(String documentNumber, Date documentDate, Date contractEndDate, String employeeName) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "documentNumber='" + documentNumber + '\'' +
                ", documentDate=" + documentDate +
                ", contractEndDate=" + contractEndDate +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
