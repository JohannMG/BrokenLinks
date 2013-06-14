/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohannMG
 */
import java.io.*;
import java.net.*;
import java.util.ArrayList;

class WebDetector{

    URL homeURL, targetHomeURL;
    static final int MAX_Depth = 5;

   

    public static void main(String[] args) throws Exception {
        
        //Get the home URL to start at 
        URL homeURL;
        System.out.print("\n");
         
        try {
            homeURL = new URL("http://www.housing.ufl.edu/");
            //homeURL = new URL("http://www.ufl.edu/");
        } 
        catch (MalformedURLException e) {
            // exception handler code here
            System.out.println("Bad Input URL");
            return;
        }
        
        URL targetHomeURL;
        try {
            targetHomeURL = new URL("http://www.housing.ufl.edu/");
        } 
        catch (MalformedURLException e) {
            // exception handler code here
            System.out.println("Bad Input URL");
            return;
        }

        CrawlerOne siteCrawler = new CrawlerOne(homeURL, homeURL, targetHomeURL, 0, MAX_Depth) ;
        siteCrawler.doWork();

        System.out.println("Program Completed");




    }
        

}
