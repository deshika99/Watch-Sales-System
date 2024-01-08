
package Models;

public class Spareparts {
    
    private String sparepartname;
    private int Sparepartprice;
    private String Sparepartstype;

    public Spareparts(String sparepartname, int Sparepartprice, String Sparepartstype) {
        this.sparepartname = sparepartname;
        this.Sparepartprice = Sparepartprice;
        this.Sparepartstype = Sparepartstype;
    }

    public String getSparepartstype() {
        return Sparepartstype;
    }

    public void setSparepartstype(String Sparepartstype) {
        this.Sparepartstype = Sparepartstype;
    }

    public String getSparepartname() {
        return sparepartname;
    }

    public void setSparepartname(String sparepartname) {
        this.sparepartname = sparepartname;
    }

    public int getSparepartprice() {
        return Sparepartprice;
    }

    public void setSparepartprice(int Sparepartprice) {
        this.Sparepartprice = Sparepartprice;
    }
    
    @Override
    public String toString() {

        return "Spareparts name is" + this.sparepartname + "Spareparts price is " + this.Sparepartprice + "the  Spareparts type is"+ this.Sparepartstype;
    }
    
}
