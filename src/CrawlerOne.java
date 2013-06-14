/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JohannMG
 */
public class CrawlerOne implements Runnable {

    URL homeURL, currentURL, siteLinkURL;
    int iterationDepth, iterationMAX;
    
    public void run()
    {
        try {
            this.doWork();
        } catch (IOException ex) {
            //Logger.getLogger(CrawlerOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            //Logger.getLogger(CrawlerOne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    CrawlerOne(URL homeURL, URL currentURL, URL siteLinkURL, 
        int iterationDepth, int interationMAX)
    {
        this.homeURL = homeURL;
        this.currentURL = currentURL;
        this.siteLinkURL = siteLinkURL;
        this.iterationMAX = interationMAX;
        this.iterationDepth = iterationDepth;

    }
    
    
    public void doWork() throws IOException, Exception{


        //Set up input stream reader to take in the HTML
        BufferedReader in = null;
        try{
            in = new BufferedReader(new InputStreamReader( currentURL.openStream() ) );
        }
        catch (Exception e) {
            System.out.println(e.toString());
            
        }
        
        //Get Links in the File-----------
        String inputLine;
        ArrayList<URL> linksOnPage = new ArrayList<URL>();
        //System.out.println("-----Querying " + currentURL + "    (" + iterationDepth);

        //Go through each line
        while ( in != null && (inputLine = in.readLine()) != null){            

            //This is probably the worst way I could do this...forgive me, please, Dieties of Java 
            String compare = "<a";
            String linkityLink;

            if (inputLine.contains(compare))
            {
                //Check anf finds the HTML anchor link
                int begin = 0; 
                begin = inputLine.indexOf("a href="); 
                int end = inputLine.indexOf( "\"", begin+8);  //    "  ending 
                if (begin > 0 && end > begin){ 
                    linkityLink = inputLine.substring(begin+8,end);

                //try to add it as a new URL
                //Late I'll add proper URI and relative link support. They're important. Fact. 
                    try {
                        linksOnPage.add(new URL(linkityLink));
                    } 
                    catch (MalformedURLException e) { 
                        //System.out.println("Non-URL?: " + linkityLink);
                    }

                }


            }

        }

        in.close();  //Close Connection



        URL sendURL;
        Cleaner c = new Cleaner();
        System.gc();


        //Get the links on the page itself
        ArrayList<URL> cleanedForHomeURLS , cleanURLforEXTLinks;
        //Liks to be Crawled
        cleanedForHomeURLS = c.cleanURLs(linksOnPage, currentURL);
        //Links to Page being referenced
        cleanURLforEXTLinks = c.cleanURLs(linksOnPage, siteLinkURL);




        //Print EXT URLs on page | Debug mostly
        for (Iterator<URL> it = cleanedForHomeURLS.iterator(); it.hasNext();) {
            URL l = it.next();
            if (!l.toString().equals("http://www.housing.ufl.edu/reslife")
                    ||!l.toString().equals("http://www.housing.ufl.edu/facilities")){
            //System.out.println(">>>" + currentURL + "\n\t\"" + l.toString() + "\" (iter:" + iterationDepth);

            }
        }


        
        //poirot... becuase it's a detective.
        HTTPErrorCodeDetector poirot = new HTTPErrorCodeDetector();
        //System.out.println("Bonjour!");

        try {
            poirot.checkTargets(currentURL,cleanURLforEXTLinks);
        }

        catch (Exception e){
            System.out.println("Could not scan page: " + currentURL.toString());
        }

        System.gc();

        /*for (URL l : linksOnPage){
         System.out.println(">=>" + l.toString() + "<<");
        } DEbug Code   */
        
       
       System.out.println("Checked Page: " + currentURL.toString() + " ");
        //If we haven't hit out iteration limit, check the links in the links on the site
        if (iterationDepth < iterationMAX)
        {
            //ArrayList<CrawlerOne> morebranches;
            CrawlerOne temp;  
            for(URL l : cleanedForHomeURLS)
            {
                if(l == null )
                    continue; 
                temp = new CrawlerOne(homeURL, l, siteLinkURL, iterationDepth+1, iterationMAX);
                temp.doWork();

                //System.out.println("Bop" + l.toString());

                //Thread t = new Thread(temp, "CurrentThread");
                //t.start();  
                //I found multi threading to be a great way to clog and kill your internet. Try it if you like. 
            }
            
        }
        System.gc();

       
      }


    
}
