/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author JohannMG
 *
 *What we'll do here is get the referenced URL from the the Scanned site
 *Then We will check for an error code (primarily 301 redirects)
 * print is as Error Code, Original 
 *
 */
public class HTTPErrorCodeDetector {
 
    URL input;
    URL target;
    
    HTTPErrorCodeDetector(){
             
        
    }

    public void checkTargetURL(URL referrer, URL linkedPage) throws Exception
    {
    	HttpURLConnection current = (HttpURLConnection) linkedPage.openConnection();

        //stop auto redirects
        current.setInstanceFollowRedirects(false);

        //get the code
        int code = current.getResponseCode();

        //Cases for response Codes
        switch(code){

            case 301 : 
                //Redirect
                String redirLoc = current.getHeaderField("Location");
                String message = current.getResponseMessage();
                print301Redirect(referrer, linkedPage, redirLoc, message);
                break;

            case 404 : 
                this.print404Error(referrer,linkedPage);
                break;

            case 401 : 
                //Unauthorized, get to this later
                // for intranet links
                break;

            case 200 : 
                //OKAY, do nothing
                break;

            case -1: 
                //HUH
                System.out.println("Response Code: -1 ??");
                break;

            default:

                break;
        }



    	
    }

    public void checkTargets(URL referrer, ArrayList<URL> linkedPages)
    {
        for (URL l : linkedPages) {
            try{
                checkTargetURL( referrer, (URL) l);            
            }
            catch (Exception e){

            }
        }
        
    }   

    private void print404Error(URL referrer, URL linkedPage)
    {
        System.out.println("---404 on page: " + referrer.toString());
        System.out.println("\tLink: " + linkedPage.toString());
        System.out.print("\n");                

    }
    
    
    private void print301Redirect(URL referrer, URL linkedPage, String redirect, String message){
        
        System.out.println("---Redirect on page: " + referrer.toString() + " (" + message + ")");
        System.out.println("\tlink: " + linkedPage.toString());
        System.out.println("\tdestination: " + redirect);
        System.out.print("\n");                
        
    }
    
    
}
