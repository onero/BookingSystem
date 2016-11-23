/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem.be;

public class Entertainer extends Person {

    private double salary;

    private EntertainerType entertainerType;
    private String description;
    private String IMAGE_PATH;

    public Entertainer(String name, String email, int telephone, double salary, EntertainerType type) {
        super(name, email, telephone);
        this.salary = salary;
        this.entertainerType = type;
    }

    public double getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }

    public String getIMAGE_PATH() {
        return IMAGE_PATH;
    }

    public void setDescription(String description) {
        this.description = description + CompanyInfo.COMPANY_CONTACT;
    }

    public void setIMAGE_PATH(String IMAGE_PATH) {
        this.IMAGE_PATH = IMAGE_PATH;
    }

}
