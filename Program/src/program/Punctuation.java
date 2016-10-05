/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Kyzlek_pc
 */
public class Punctuation implements Token{
private String content;
   
    @Override
    public String toString(){
        return this.content;
    }
    @Override
    public void setContent(String content){
        this.content = content;
    }
    
}
