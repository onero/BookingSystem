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
        ArrayList<Entertainer> search = new ArrayList<>();

        for (Entertainer entertainer : entertainers) {
            if (entertainer.getName().toLowerCase().contains(query)) {
                search.add(entertainer);
            }
        }
        return search;
    }

}
