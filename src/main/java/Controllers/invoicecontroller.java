package Controllers;

import Models.invoice;

public class invoicecontroller {

    invoice invoiceobj;

    public invoice addinvoice(String Name, String Address, String Date, int price, String Email, String Telephonenumber) {

        invoiceobj = new invoice(Name, Address, Date, price, Email, Telephonenumber);
        return invoiceobj;
    }

    public invoice addinvoice(String Name, String Address, String Date, String Email, int price, String Telephone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

    
