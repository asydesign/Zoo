/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab4;

/**
 *
 * @author fmi
 */
public class Zoo {
    
    private AnimalInterface animal;
    
    public Zoo(AnimalInterface animal){
        this.animal = animal;
    }
//    public void setAnimal(AnimalInterface animal){
//        this.animal = animal;
//    }
//    public AnimalInterface getAnimal(){
//        return animal;
//    }
    public void showAnimal(){
        System.out.println(animal.introduceYourself());
    }
}
