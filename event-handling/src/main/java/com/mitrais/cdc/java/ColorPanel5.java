package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*TO DO
 * Make a popup window that turns:
 * red when you press “r”, 
 * yellow when you press “y”, 
 * green when you press “g”, 
 * and blue when you press “b”. 
 * Use a KeyListener or KeyAdapter, and the keyTyped method. 
 * The notes show how to get a String from the KeyEvent. However, panels normally ignore 
 * keyboard events, so to make them respond, you must add these two lines to the constructor of your 
 * JPanel subclass:
 * -setFocusable(true);
 * -requestFocusInWindow();
 */

public class ColorPanel5 extends JPanel {
  public ColorPanel5() {
	//Set background color to Red
    //call KeyListener
  }
  
  private class ColorChanger extends KeyAdapter {
    public void keyTyped() {
      /*TO DO
       * give logic to set background color when user press "r", "y", "g", and "b" from keyboard
       */
    }
  }
}
