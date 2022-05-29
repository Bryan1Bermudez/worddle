package apcs;

import java.util.Random;
//this class simply generates the words and also is reposible for checking if the word if the player input is right or wrong , or if it does contain the letter
public class wordGenerator {
    // the varibles are simply all the possible words a random varible to select it temp to select the random word and a number of tries holder.
    String[] possible_words;
    String chosenWord;
    int[] Rightwrong;
    public wordGenerator(){
        possible_words = new String[]{"jazzy","robot","apple","jumbo","babel","cabal","daddy","fable","habit","jaded"};
        Random rand = new Random();
        int temp = rand.nextInt(6);
        chosenWord = possible_words[temp];
        Rightwrong = new int[5];
    }

    //gets input from another class and checks if equals it thus return 1 or if it just contains it thus return 2, if niether it means it dosent contain it then
    // it returns 0
    public int check(String word, int c){
        String temp1 = chosenWord.substring(c, c +1);
        String temp2 = word.substring(c, c +1);
        if(temp1.equals(temp2)){
            return 1;
        }
        if(chosenWord.contains(temp2)){
            return 2;
        }

        return 0;
    }
    // a bunch of getter methods that return the chosen word, if its equal to it. and the possible amount of words.
    public boolean iscomplete(String word){return chosenWord.equals(word);}
    public String getChosenWord(){return chosenWord;}
    public String[] getPossible_words(){return possible_words;}


}
