/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human1;

/**
 *
 * @author it11610
 */
public class Human1 {

    /**
     * @param args the command line arguments
     */
    private String skin_color = "brown";
    private String eye_color = "Blue";
    private String gender = "Male";
    private int height = 169;
    private int weight = 50;
    private int age = 28;
    private String name = "Tipsy X";
    private String race = "Asian";
    public static void main(String[] args) {
        // TODO code application logic here
        Human1 a = new Human1 ();
        Children b = new Children ();
        
        System.out.println("skin color: "+a.skin_color);
        System.out.println("Eye color: "+a.eye_color);
        System.out.println("Gender: :"+a.gender);
        System.out.println("Height: "+a.height);
        System.out.println("Weight: "+a.weight);
        System.out.println("Age: "+a.age);
        System.out.println("Race: "+a.race);
        System.out.println("Name: "+a.name);
        System.out.println("Inteligence Rating: "+b.intel_rating);
        System.out.println("Mood Rating: "+b.mood_rating);
        System.out.println("Genetic Disease: "+b.genetic_disease[0]);
        System.out.println("Wealth Rating: "+b.wealth_rating);
    }
    
}
