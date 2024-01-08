
package Controllers;

import Models.Suppliers;

public class Supplierscontroller {
    Suppliers Suppliersobj;
    public Suppliers addSuppliers(int SupplierNO, String SupplierName, String Date, String Type, String Telephone,String Email)
    {
        Suppliersobj=new Suppliers(SupplierNO,SupplierName,Date,Type,Telephone,Email);
        return Suppliersobj;        
    }
}
