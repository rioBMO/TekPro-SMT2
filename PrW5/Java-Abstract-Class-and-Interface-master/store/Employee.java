/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 * This is the Employee interface file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public interface Employee {
  /**
   * This method Calculates the pay of the employee.
   *
   * @return- This method returns double Pay of the Employee.
   */
  double calculatePay();

  /**
   * This method Checks if the employee should be awarded with a promotion.
   *
   * @return- This method returns boolean the eligibility status for
   * promotion. for an employee.
   */
  boolean checkPromotionEligibility();

  /**
   * This method returns the number of hours worked per day by the employee.
   *
   * @return- This method returns the number of hours worked per day.
   */
  double workHoursPerDay();
}
