/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.IOException;

/**
 *
 * @author Kyzlek_pc
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        SimpleTokenizerImple m = new SimpleTokenizerImple();
        m.input();
        m.parse();
        m.outputArray();
    }
    
}
