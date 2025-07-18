import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Photographer{
    private int id;
    private String name;
    private String specialization;
    private double rating;
    
    public Photographer(int id, String name, String specialization, double rating){
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public double getRating(){
        return rating;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    
}


public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Photographer[] arr = new Photographer[t];
        for(int i = 0; i < t; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String specialization = sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine();
            
            arr[i] = new Photographer(id, name, specialization, rating);
        }
        
        String enterspecia = sc.nextLine();
        int result = countPhotographyBySpecialization(arr, enterspecia);
        if(result > 0){
            System.out.println("Number of photographers in " + enterspecia + ": " + result);
        }
        else{
            System.out.println("No photographers found for the given specialization.");
        }
        
        Photographer result2 = getSecondHighestRatedPhotographer(arr);
        if(result2 != null){
            System.out.println("id-" + result2.getId());
            System.out.println("name-" + result2.getName());
            System.out.println("specialization-" + result2.getSpecialization());
            System.out.println("rating-" + result2.getRating());
        }
        else{
            System.out.println("Second highest rated photographer not available.");
        }
        sc.close();
    }
    
    
    
    public static int countPhotographyBySpecialization(Photographer[] arr, String st){
        int m = 0;
        for(Photographer i : arr){
            if(i.getSpecialization().equalsIgnoreCase(st)){
                m++;
            }
        }
        return m;
    }
    
    public static Photographer getSecondHighestRatedPhotographer(Photographer[] arr){     // since we have to return the Photographer object
        if(arr == null || arr.length < 2){
            return null;
        }
        
        double first = Double.MIN_VALUE;
        double second = Double.MIN_VALUE;
        
        for(Photographer i : arr){
            if(i.getRating() > first){
                first = i.getRating();
            }
        }
        for(Photographer i : arr){
            if(i.getRating() > second && i.getRating() != first){
                second = i.getRating();
            }
        }
        
        if(second == Double.MIN_VALUE){
            return null;
        }
        
        for(Photographer p : arr){            // since we have to returns the Photographer object
            if(p.getRating() == second){
                return p;
            }
        }
        return null;
    }
}
