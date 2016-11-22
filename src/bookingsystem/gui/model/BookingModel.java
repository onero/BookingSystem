/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.model;

import bookingsystem.be.Entertainer;
import bookingsystem.be.EntertainerType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookingModel {

    private ObservableList<Entertainer> entertainers;

    public BookingModel() {
        entertainers = FXCollections.observableArrayList();
        entertainers.add(new Entertainer("Kim Larsen", "kLarsen@contact.dk", 12345678, 1000000, EntertainerType.MUSICIAN));
        entertainers.add(new Entertainer("Rasmus Seebach", "rSeebach@contact.dk", 12345678, 750000, EntertainerType.MUSICIAN));
        entertainers.add(new Entertainer("Mads Langer", "mLanger@contact.dk", 12345678, 500000, EntertainerType.MUSICIAN));
    }

    public ObservableList<Entertainer> getEntertainers() {
        return entertainers;
    }

}
