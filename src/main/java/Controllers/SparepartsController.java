
package Controllers;

import Models.Spareparts;


public class SparepartsController {
    
    Spareparts sparepartsobj;
    
    public Spareparts addspareparts(String sparepartname, int Sparepartprice, String Sparepartstype)
    {
        sparepartsobj=new Spareparts(sparepartname,Sparepartprice,Sparepartstype);
        return sparepartsobj;        
    }
    
    
}
