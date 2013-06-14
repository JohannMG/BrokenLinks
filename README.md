BrokenLinks
===========

Find broken links by crawling a website. 404s and 301 redirects, specifically. 

Runs in terminal. 


Last issues: 
--Will check single pages twice: no detection that a page has already been swept
--SLOW: 45 minute runtime on medium sized site with only 5 crawling depth into the site
--Does not work with relative links yet
--won't acknowledge other than first link if there are more than one on a line

Upcoming (Speculated Update)
--Restructure
--Make multithreaded
--Perhaps collect webpage first THEN scan each for errors?
--Eventually a UI  (Processing API could make it look nice) 
--Stop flagging anchor hash tags 



Email attached of course!





EXAMPLE & really long output below (best viewed as RAW text)
site scanned: housing.ufl.edu
for links to: housing.ufl.edu 
checking for links on our own site that are broken or that were not changed when we moved to the wordpress CMS


--------------------------------------------------------------------------------------------------------


Checked Page: http://www.housing.ufl.edu/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/community-standards/ 
Checked Page: http://www.housing.ufl.edu/communication/marketing-photographervideographer-request/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/fall/ 
---Redirect on page: http://www.housing.ufl.edu/undergrad/apply/summer/ (Moved Permanently)
  link: http://www.housing.ufl.edu/room-signup
	destination: http://www.housing.ufl.edu/undergrad/room-signup/

Checked Page: http://www.housing.ufl.edu/undergrad/apply/summer/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/howto/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/recontracting-summer-2/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/spring/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/transfer/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/#Reserving a Space for a Roommate 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/recontracting-summer-2/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/#Help 
Checked Page: http://www.housing.ufl.edu/area/springs/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/rent-deferments/ 
Checked Page: http://www.housing.ufl.edu/undergrad/appeals/financial/ 
---Redirect on page: http://www.housing.ufl.edu/about/staff_directory/ (Moved Permanently)
	link: http://www.housing.ufl.edu/staff_directory
	destination: http://www.housing.ufl.edu/about/staff_directory/

Checked Page: http://www.housing.ufl.edu/about/staff_directory/ 
Checked Page: http://www.housing.ufl.edu/undergrad/contracts/ 
Checked Page: http://www.housing.ufl.edu/undergrad/contracts/disabilities/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/roommates/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/fall/ 
Checked Page: http://www.housing.ufl.edu/area/broward/ 
Checked Page: http://www.housing.ufl.edu/blog/village/diamond/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/community-standards/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/hurricane-preparedness-graduate-and-family-housing/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/transfer/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/moveout/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/local/ 
Checked Page: http://www.housing.ufl.edu/gfh/payments/rates/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/moveout/ 
Checked Page: http://www.housing.ufl.edu/undergrad/room-signup/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/accommodations/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/tv/ 
---Redirect on page: http://www.housing.ufl.edu/undergrad/apply/summer/ (Moved Permanently)
	link: http://www.housing.ufl.edu/room-signup
	destination: http://www.housing.ufl.edu/undergrad/room-signup/

Checked Page: http://www.housing.ufl.edu/undergrad/apply/summer/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/involvement/ 
Checked Page: http://www.housing.ufl.edu/blog/village/tanglewood/ 
Checked Page: http://www.housing.ufl.edu/conferenceservices/summervisitorhousing/internhousing/ 
Checked Page: http://www.housing.ufl.edu/gfh/involvement/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/rates/ 
Checked Page: http://www.housing.ufl.edu/gfh/choices/ 
Checked Page: http://www.housing.ufl.edu/blog/hall/mallory/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/eligibility/ 


IT GOES ON...  43 minute runtime on my machines
