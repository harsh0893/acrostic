/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package acrostic;

import org.me.myLib.LibClass;

/**
 *
 * @author Toshiba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result = LibClass.acrostic(args);
        System.out.println("Result ="+ result);
    }

}
