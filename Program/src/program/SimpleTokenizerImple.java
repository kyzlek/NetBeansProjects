/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.*;

/**
 *
 * @author Kyzlek_pc
 */
public class SimpleTokenizerImple {
    private String ourLine;
    private char[] array;
    private char[] letters = {'a','A','b','B','c','C','d','D','e','E','f','F','g','G','h','H','i','I','j','J','k','K','l','L','m','M','n','N','o','O','p','P','q','Q','r','R','s','S','t','T','u','U','v','V','w','W','x','X','y','Y','z','Z'};
    private char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    private char[] punct = {'.',',','?','!'};
    Token[] token;
    
    public void input() throws IOException{
        System.out.print("Введите ебаную строку: ");
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        ourLine = red.readLine();
        array = ourLine.toCharArray();
        
    }
   
    public int findLength(){
        int numOfElement = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == ' ' || i == array.length-1) numOfElement++;
        }
        return numOfElement;
    }
    public void parse(){
        int countWord = 0;
        token = new Token[findLength()];
        String actualWord = "";
        for(int i=0; i<array.length; i++){
            
            if(array[i] == ' ' || i == array.length-1){
                if(test(array[i-1]) == "letter"){
                    token[countWord] = new Word();
                    token[countWord].setContent(actualWord);
                }
                else if(test(array[i-1]) == "number"){
                    token[countWord] = new Number();
                    token[countWord].setContent(actualWord);
                }
                else if(test(array[i-1]) == "punct"){
                    token[countWord] = new Punctuation();
                    token[countWord].setContent(actualWord);
                }
                countWord++;
                actualWord ="";
            }
            else if(array[i] == ' ')actualWord = actualWord + array[i+1];
            else actualWord = actualWord + array[i];
        }
    }
    
    public String test(char array){
        for(char letter : letters){
            if(letter == array) return "letter";
        }
        for(char number : numbers){
            if(number == array) return "number";
        }
        for(char punct : punct){
            if(punct == array) return "punct";
        }
        return "null";
    }
    
    public void outputArray(){
        for(int i=0; i<token.length; i++){
            System.out.println(token[i].toString()+ "--//" +token[i].getClass());
        }
    }
    
}
