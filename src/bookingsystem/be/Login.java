/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.be;

public class Login {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    private static final String EMPLOYEE_USERNAME = "minion";
    private static final String EMPLOYEE_PASSWORD = "minion";

    public static String getADMIN_USERNAME() {
        return ADMIN_USERNAME;
    }

    public static String getADMIN_PASSWORD() {
        return ADMIN_PASSWORD;
    }

    public static String getEMPLOYEE_USERNAME() {
        return EMPLOYEE_USERNAME;
    }

    public static String getEMPLOYEE_PASSWORD() {
        return EMPLOYEE_PASSWORD;
    }

}
