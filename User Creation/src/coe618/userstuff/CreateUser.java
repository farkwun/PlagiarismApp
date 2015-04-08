/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe618.userstuff;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Bryan Roiled
 */
public class CreateUser {
    //private String path;
    private boolean append_to_file = true;
    private String filepath = "database.txt";
    
    public CreateUser(String username, String password, String userID) throws IOException {
       FileWriter write = new FileWriter (filepath, append_to_file);
       PrintWriter print_line = new PrintWriter(write);
       print_line.printf("%s" + "%n", username);
       print_line.printf("%s" + "%n", password);
       print_line.printf("%s" + "%n", userID);
       print_line.printf("%n");
       
       print_line.close();
        
      } 
    

    
}
