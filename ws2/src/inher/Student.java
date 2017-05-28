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
public class Student extends InherTest{
        private double mark;

    public Student(double mark, String name, String address, String emall) {
        super(name, address, emall);
        this.mark = mark;
    }
    
    public static void main(String[] args) {
        Student stu = new Student(6.2, "Trinh Dai", "Ha Noi", "dai@123");
        stu.setAddress("ahihi sai address");
        System.out.println(stu.toString());
    }
        
    
}
