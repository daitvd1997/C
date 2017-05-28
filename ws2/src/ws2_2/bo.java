/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2_2;

public class bo {
    private int hourWorks;
    private int employeeID;

    public bo(int hourWorks, int employeeID) {
        this.hourWorks = hourWorks;
        this.employeeID = employeeID;
    }
    
    public bo() {
    }

    public int getHourWorks() {
        return hourWorks;
    }

    public void setHourWorks(int hourWorks) {
        this.hourWorks = hourWorks;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "bo{" + "hourWorks=" + hourWorks + ", employeeID=" + employeeID + '}';
    }

}

