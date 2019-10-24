/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightconverter;

/**
 *
 * @author user
 */
public class WeightConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weightOnEarth = 80;
        
        String[] planets = {"Venus", "Mars", "Jupiter", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] planetRelativegravity = {0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
        
        int numberOfPlanets = planets.length;
        
        for (int i = 0; i < numberOfPlanets-1; i++) {
            System.out.println("Weight on " + planets[i] + " is " + relativeWeight(planetRelativegravity[i], weightOnEarth));
        }
        
    }
    
    public static double relativeWeight(double relativeMultiplier, double weightOnEarth) {
        return relativeMultiplier * weightOnEarth;
    }
    
}
