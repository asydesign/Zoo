/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author fmi
 */
public class Lion extends Animal{
    private String sex = "male";
    
    public Lion(String sex){
        super(true);
        this.sex = sex;
    }
    
    
   @Override
   public String introduceYourself (){
       String text;
       text = super.introduceYourself();
        return text + " I'm Lion: " + sex;
    }
   
}
