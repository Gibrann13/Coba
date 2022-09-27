/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;

import java.util.Scanner;

public abstract class Hewan implements isAlive {

    String name;
    int age;
    String gender;
    int alive;
    String food;

    public Hewan(String name, int age, String gender, int alive, String food) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
        this.food = food;
    }
   
    public abstract void printSound();
        
    public boolean isAlive(){
        return alive == isAlive.alive;
    }
    
    public void printData(){
    System.out.println("name = " + name + "\nage = " + age + "\nfood =" + food + "\ngender = " + gender + "\nalive = " + alive);    
    }
    
    public Hewan(){
        
    }
}


