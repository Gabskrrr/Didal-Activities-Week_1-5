/*
ACT 5-1 :: Favorite Things Array
@Author: Carl Didal
*/

public class FavoriteThingsArray{
    public static void main (String args[]){
       String[] faves = {"Rosy", "Bike", "Games", "Tofu", "Anime"};
       int count = 0;
        
        for (int i = 0; i < faves.length; i++){
            count++;
            System.out.println("Favorite thing #"+ count + " : " + faves[i]);
        }
    }
}