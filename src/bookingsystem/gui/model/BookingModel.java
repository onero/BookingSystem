/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.gui.model;

import bookingsystem.be.Entertainer;
import bookingsystem.be.EntertainerType;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookingModel {

    private ObservableList<Entertainer> entertainers;

    public BookingModel() {
        entertainers = FXCollections.observableArrayList();
        resetList();
    }

    /**
     * Adds entertainers to the observable list
     */
    public void resetList() {
        entertainers.clear();
        Entertainer kLarsen = new Entertainer(
                "Kim Larsen", "kLarsen@contact.dk", 12345678, 1000000, EntertainerType.MUSICIAN);
        kLarsen.setDescription("Bacon Ipsum");
        kLarsen.setIMAGE_PATH("/bookingsystem/assets/img/KimLarsen.jpg");
        entertainers.add(kLarsen);

        Entertainer rSeebach = new Entertainer(
                "Rasmus Seebach", "rSeebach@contact.dk", 12345678, 750000, EntertainerType.MUSICIAN);
        rSeebach.setDescription("Awesome singer!");
        rSeebach.setIMAGE_PATH("/bookingsystem/assets/img/RasmusSeebach.jpeg");
        entertainers.add(rSeebach);

        Entertainer mLanger = new Entertainer(
                "Mads Langer", "mLanger@contact.dk", 12345678, 500000, EntertainerType.MUSICIAN);
        mLanger.setDescription("Man he can sing!");
        mLanger.setIMAGE_PATH("/bookingsystem/assets/img/MadsLanger.jpg");
        entertainers.add(mLanger);

        Entertainer aMatthesen = new Entertainer(
                "Anders Matthesen", "aMatthesen@contact.dk", 12345678, 1500000, EntertainerType.STAND_UP);
        aMatthesen.setDescription("The funniest man in the world");
        aMatthesen.setIMAGE_PATH("/bookingsystem/assets/img/aMatthesen.jpg");
        entertainers.add(aMatthesen);

        Entertainer kikky = new Entertainer(
                "Kikky", "kikky@contact.dk", 1234678, 30000, EntertainerType.EVENT_GIRL);
        kikky.setDescription("Kikky the kinky girl...");
        kikky.setIMAGE_PATH("/bookingsystem/assets/img/Kikky.jpg");
        entertainers.add(kikky);

        Entertainer scarlet = new Entertainer(
                "Scarlet Johansson", "lækkertøs@hotmail.com", 2000000, 1500000, EntertainerType.EVENT_GIRL);
        scarlet.setDescription("Verdens lækreste tøs med dejlige fødedygtige hofter.");
        scarlet.setIMAGE_PATH("/bookingsystem/assets/img/sJohansson.jpg");
        entertainers.add(scarlet);

        Entertainer breum = new Entertainer(
                "Morten Breum", "DjMaster@contact.dk", 50000, 35000, EntertainerType.DJ);
        breum.setDescription("En af danmarks dygtigste Dj´s.");
        breum.setIMAGE_PATH("/bookingsystem/assets/img/mBreum.jpg");
        entertainers.add(breum);

        Entertainer kato = new Entertainer(
                "Kato", "Kato@contact.dk", 80000, 60000, EntertainerType.DJ);
        kato.setDescription("Danmarks mest hotte dj!");
        kato.setIMAGE_PATH("/bookingsystem/assets/img/Kato.jpg");
        entertainers.add(kato);

    }

    public ObservableList<Entertainer> getEntertainers() {
        return entertainers;
    }

    /**
     * Updates the observable list
     *
     * @param newEntertainers
     */
    public void updateEntertainers(ArrayList<Entertainer> newEntertainers) {
        entertainers.clear();
        entertainers.addAll(newEntertainers);
    }

}
