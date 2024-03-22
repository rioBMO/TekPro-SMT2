// ******************************************************* 
// Salesperson.java 
// 
// Represents a sales person who has a first name, last 
// name, and total number of sales. 
// ******************************************************* 
public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    //------------------------------------------------------ 
    // Constructor: Sets up the sales person object with 
    // the given data. 
    //------------------------------------------------------ 
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //------------------------------------------- 
    // Returns the sales person as a string. 
    //-------------------------------------------
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //------------------------------------------- 
    // Returns true if the sales people have 
    // the same name. 
    //-------------------------------------------
    public boolean equals(Object other) {
        if (!(other instanceof Salesperson)) {
            return false;
        }
        Salesperson otherSalesperson = (Salesperson) other;
        return lastName.equals(otherSalesperson.lastName) && firstName.equals(otherSalesperson.firstName);
    }

    //-------------------------------------------------- 
    // Order is based on total sales with the name 
    // (last, then first) breaking a tie. 
    //--------------------------------------------------    
    @Override
    public int compareTo(Salesperson other) {
        int result = 0;
        // Compare based on total sales
        if (this.totalSales < other.totalSales) {
            result = -1;
        } else if (this.totalSales > other.totalSales) {
            result = 1;
        } else {
            result = this.lastName.compareTo(other.lastName);
            if (result == 0) {
                result = this.firstName.compareTo(other.firstName);
            }
        }
        return result;
    }

    //------------------------- 
    // First name accessor. 
    //-------------------------
    public String getFirstName() {
        return firstName;
    }

 
    //------------------------- 
    // Last name accessor. 
    //------------------------- 
    public String getLastName() {
        return lastName;
    }

    //------------------------- 
    // Total sales accessor. 
    //-------------------------
    public int getSales() {
        return totalSales;
    }
}
