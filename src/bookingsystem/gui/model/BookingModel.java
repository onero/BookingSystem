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
        addEntertainers();
    }

    /**
     * Adds entertainers to the observable list
     */
    private void addEntertainers() {
        Entertainer kLarsen = new Entertainer(
                "Kim Larsen", "kLarsen@contact.dk", 12345678, 1000000, EntertainerType.MUSICIAN);
        kLarsen.setDescription("Bacon Ipsum");
        kLarsen.setIMAGE_PATH("/bookingsystem/assets/img/KimLarsen.jpg");
        entertainers.add(kLarsen);

        Entertainer rSeebach = new Entertainer("Rasmus Seebach", "rSeebach@contact.dk", 12345678, 750000, EntertainerType.MUSICIAN);
        rSeebach.setDescription("Awesome singer!");
        rSeebach.setIMAGE_PATH("/bookingsystem/assets/img/RasmusSeebach.jpeg");
        entertainers.add(rSeebach);

        Entertainer mLanger = new Entertainer(
                "Mads Langer", "mLanger@contact.dk", 12345678, 500000, EntertainerType.MUSICIAN);
        mLanger.setDescription("Man he can sing!");
        mLanger.setIMAGE_PATH("/bookingsystem/assets/img/MadsLanger.jpg");
        entertainers.add(mLanger);
    }

    public ObservableList<Entertainer> getEntertainers() {
        return entertainers;
    }

}
