/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inher;

/**
 *
 * @author Trinh Dai
 */
public class InherTest {
    private String name;
    private String address;
    private String emall;

    public InherTest() {
    }

    public InherTest(String name, String address, String emall) {
        this.name = name;
        this.address = address;
        this.emall = emall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmall() {
        return emall;
    }

    public void setEmall(String emall) {
        this.emall = emall;
    }

    @Override
    public String toString() {
        return "InherTest{" + "name=" + name + ", address=" + address + ", emall=" + emall + '}';
    }
    
    
}
