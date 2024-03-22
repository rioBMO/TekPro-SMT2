public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // Returns the sales person as a string
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // Checks if the sales people have the same name
    public boolean equals(Object other) {
        if (!(other instanceof Salesperson)) {
            return false;
        }
        Salesperson otherSalesperson = (Salesperson) other;
        return lastName.equals(otherSalesperson.lastName) && firstName.equals(otherSalesperson.firstName);
    }

    // Compares two salespersons based on total sales and name
    @Override
    public int compareTo(Salesperson other) {
        // Compare based on total sales
        int salesComparison = Integer.compare(this.totalSales, other.totalSales);
        if (salesComparison != 0) {
            return salesComparison; // If sales are different, return the comparison result
        } else {
            // If sales are equal, compare based on last name
            int lastNameComparison = this.lastName.compareTo(other.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison; // If last names are different, return the comparison result
            } else {
                // If last names are equal, compare based on first name
                return this.firstName.compareTo(other.firstName);
            }
        }
    }

    // First name accessor
    public String getFirstName() {
        return firstName;
    }

    // Last name accessor
    public String getLastName() {
        return lastName;
    }

    // Total sales accessor
    public int getSales() {
        return totalSales;
    }
}
