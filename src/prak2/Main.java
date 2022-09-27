/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;


public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Kitty",3,"Male",2,"Ikan");
        c.isAlive();
        c.printData();        
        c.printSound();
        System.out.println();
        Dog d = new Dog("Bonny",6,"Male",1,"Bone");
        d.printData();
        d.isAlive();
        d.printSound();
        System.out.println();
        Horse h = new Horse("Pony",8,"Female",1,"Rumput");
        h.isAlive();
        h.printData();
        h.printSound();
        System.out.println();
        Duck du = new Duck("Beck",1,"Female",1,"Fish");
        du.isAlive();
        du.printData();
        du.printSound();
    }
}
