/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.bll;

import bookingsystem.be.Entertainer;

public class BookingManager {

    public String getEntertainerDescription(Entertainer entertainer) {
        return entertainer.getDescription();
    }

}
