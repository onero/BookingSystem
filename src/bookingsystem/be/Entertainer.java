/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.be;

public class Entertainer extends Person {

    private double salary;

    private EntertainerType entertainerType;

    public Entertainer(String name, String email, int telephone, double salary, EntertainerType type) {
        super(name, email, telephone);
        this.salary = salary;
        this.entertainerType = type;
    }

    public double getSalary() {
        return salary;
    }

}
