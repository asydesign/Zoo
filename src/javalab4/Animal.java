/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab4;

/**
 *https://codenvy.com/ide/tmp-j91h9hkz7jayvr
 * @author fmi
 */


public class Animal implements AnimalInterface {
    boolean suckMilk = false;
    
    public Animal(boolean suckMilk){
        this.suckMilk = suckMilk;
    }
    
   
    @Override
    public String introduceYourself (){
        
        return ("I suck milk: " + suckMilk);
    }
   
    
    
}
