/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author JohannMG
 *
 */
public class Cleaner {
    
    URL rootPage;
    
    Cleaner()
    {
        
    }
    
    //We only wnat to search links on the one host so we'll remove the others
    public ArrayList<URL> cleanURLs( ArrayList<URL> input, URL rootURL) throws Exception  {
        
        ArrayList<URL> out = new ArrayList<URL>();
        
        for(URL link : input){


            if (link.toString().startsWith(rootURL.toString())
                    && 
                !link.toString().equalsIgnoreCase(rootURL.toString())){
            
                out.add(link);
            }
        }
        
        // add elements to al, including duplicates
        HashSet hs = new HashSet();
        hs.addAll(out);
        out.clear();
        out.addAll(hs);
        



        return out;
        

    }

    //later add them for relative links, maybe URIs will be fixed here


    
    
}