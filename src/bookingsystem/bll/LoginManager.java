/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.bll;

import bookingsystem.be.Login;

public class LoginManager {

    private String currentUser;

    /**
     * Validate the parsed username and password against the admin constants
     *
     * @param username
     * @param password
     * @return
     */
    public boolean validateAdminLogin(String username, String password) {
        boolean validUser = username.equals(Login.getADMIN_USERNAME())
                && password.equals(Login.getADMIN_PASSWORD());
        if (validUser) {
            currentUser = Login.getADMIN_USERNAME();
        }
        return validUser;
    }

    /**
     * Validate the parsed username and password against the employee constants
     *
     * @param username
     * @param password
     * @return
     */
    public boolean validateWorkerLogin(String username, String password) {
        boolean validUser = username.equals(Login.getEMPLOYEE_USERNAME())
                && password.equals(Login.getEMPLOYEE_PASSWORD());
        if (validUser) {
            currentUser = Login.getEMPLOYEE_USERNAME();
        }
        return validUser;
    }
}
