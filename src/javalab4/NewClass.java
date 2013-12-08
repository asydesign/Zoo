/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab4;

/**
 *
 * @author fmi
 */
public class NewClass {
    

public static void main(String[] args) {
    
//    Animal myAnimal = new Animal(true);
//    System.out.println("1 " + myAnimal.introduceYourself());
//   
//    Lion myLion = new Lion ("male");
//    System.out.println("2 " + myLion.introduceYourself());
//    
//    myAnimal = new Lion ("female");
//    System.out.println("3 " + myAnimal.introduceYourself());
    
    Lion myLion = new Lion("male");
    Zoo zoo = new Zoo(myLion);
    zoo.showAnimal();
    
    }
}