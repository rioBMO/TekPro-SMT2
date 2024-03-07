package store;

public class Internship extends AbstractStoreEmployee {

  private String academicInstitution;

  /**
   * Constructor for the Internship class.
   * Initializes variables using the superclass constructor.
   *
   * @param numberOfHoursWorked The number of hours worked by the intern.
   * @param storeDetails Details of the store where the intern works.
   * @param employeeName Name of the intern.
   * @param academicInstitution The academic institution affiliated with the internship.
   * @param basePay The base pay rate for the intern.
   */
  public Internship(
    double numberOfHoursWorked,
    String storeDetails,
    String employeeName,
    String academicInstitution,
    double basePay
  ) {
    super(numberOfHoursWorked, 0, storeDetails, basePay, employeeName); // Interns typically don't receive hourly pay
    this.academicInstitution = academicInstitution;
  }

  /**
   * Overrides the calculatePay method to return the basePay.
   *
   * @return The base pay of the intern.
   */
  @Override
  public double calculatePay() {
    return super.getBasePay();
  }

  /**
   * Checks if the intern is eligible for promotion.
   * In this simple implementation, interns are not eligible for promotion.
   *
   * @return Always returns false as interns are not eligible for promotion.
   */
  @Override
  public boolean checkPromotionEligibility() {
    // Interns are not eligible for promotion
    return false;
  }

  /**
   * Returns the academic institution affiliated with the internship.
   *
   * @return The name of the academic institution.
   */
  public String getAcademicInstitution() {
    return academicInstitution;
  }

  /**
   * Sets the academic institution affiliated with the internship.
   *
   * @param academicInstitution The name of the academic institution.
   */
  public void setAcademicInstitution(String academicInstitution) {
    this.academicInstitution = academicInstitution;
  }

  /**
   * This method returns the number of hours worked per day by the employee.
   *
   * @return- This method returns the number of hours worked per day.
   */
  @Override
  public double workHoursPerDay() {
    return 8.0;
  }

  @Override
  public double calculateTax() {
    return 0;
  }

  @Override
  public double calculateOvertimePay() {
    return 0;
  }

  /**
   * Returns the String representation of the internship details.
   * Overrides the toString method of the superclass.
   *
   * @return A string containing the internship details.
   */
  @Override
  public String toString() {
    return (super.toString() + "Academic Institution: " + academicInstitution);
  }
}
