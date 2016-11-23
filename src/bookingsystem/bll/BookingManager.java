/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.bll;

import bookingsystem.be.Entertainer;
import java.util.ArrayList;
import javafx.collections.ObservableList;

public class BookingManager {

    private ArrayList<Entertainer> search;

    public String getEntertainerDescription(Entertainer entertainer) {
        return entertainer.getDescription();
    }

    /**
     * Get the entertainers that match the search
     *
     * @param entertainers
     * @param query
     * @return
     */
    public ArrayList<Entertainer> getEntertainersFromSearch(ObservableList<Entertainer> entertainers, String query) {
        search = new ArrayList<>();

        for (Entertainer entertainer : entertainers) {
            if (entertainer.getName().toLowerCase().contains(query)) {
                search.add(entertainer);
            }
        }
        return search;
    }

    /**
     * Gets the entertainers from the combo limitation
     *
     * @param entertainers
     * @param choice
     * @return
     */
    public ArrayList<Entertainer> getEntertainersFromComboLimit(ObservableList<Entertainer> entertainers, String choice) {
        search = new ArrayList<>();

        for (Entertainer entertainer : entertainers) {
            if (entertainer.getEntertainerType().toString().toLowerCase().equals(choice)) {
                search.add(entertainer);
            }
        }
        return search;
    }

}
