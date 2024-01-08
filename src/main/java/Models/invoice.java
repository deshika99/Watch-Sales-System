package Models;

public class invoice {

    private String Name;
    private String Address;
    private String Date;
    private int price;
    private String Email;
    private String Telephonenumber;

    public invoice(String Name, String Address, String Date, int price, String Email, String Telephonenumber) {
        this.Name = Name;
        this.Address = Address;
        this.Date = Date;
        this.price = price;
        this.Email = Email;
        this.Telephonenumber = Telephonenumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephonenumber() {
        return Telephonenumber;
    }

    public void setTelephonenumber(String Telephonenumber) {
        this.Telephonenumber = Telephonenumber;
    }
    
     @Override
    public String toString() {

        return "invoice name is" + this.Name + "invoice Address is " + this.Address + "the invoice date is " +" the price is  "+this.price+ this.Date + " Email is " + this.Email + "the phone number" + this.Telephonenumber;
    }

}
