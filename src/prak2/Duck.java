/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;

public class Duck extends Hewan {

    public Duck(){  
    }
    public Duck(String name, int age, String gender, int alive, String food) {
        super(name, age, gender, alive, food);
    }
   
    @Override
    public void printSound(){
        System.out.println("Whekk ~ Wekk ~~");
    }
    
    @Override
    public void printData(){
        super.printData();
        System.out.println("Ini Duck");
    }
}
