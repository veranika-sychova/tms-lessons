package by.tms.lesson7.homework3;

import by.teachmeskills.lesson7.homework3.employee.Employee;
import by.teachmeskills.lesson7.homework3.financial_invoice.FinancialInvoice;
import by.teachmeskills.lesson7.homework3.goods_supply.GoodsSupply;

import java.util.Date;

public class Homework3 {
    public static void main(String[] args) {

        Date date = new Date(122,11,11);
        Date date1 = new Date(111,12,11);
        Date date2 = new Date(110,4,11);

        Document employee = new Employee("dfdssd34", date,date1 , "Daniel");
        Document invoice = new FinancialInvoice(100, date1, "dkfmrkfmk", 574);
        Document goodsSypply = new GoodsSupply("dlvdmkfdmvksd", "meet", 44, date2);
        Register register = new Register(10);


        register.saveDocument(employee);
        register.saveDocument(invoice);
        register.saveDocument(goodsSypply);

        register.showDocumentInfo(employee.getDocumentNumber());

    }
}
