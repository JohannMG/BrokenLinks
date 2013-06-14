BrokenLinks
===========

Find broken links by crawling a website. 404s and 301 redirects, specifically. 

Runs in terminal. 


Last issues: 
--Will check single pages twice: no detection that a page has already been swept
--SLOW: 45 minute runtime on medium sized site with only 5 crawling depth into the site

Upcoming (Speculated Update)
--Restructure
--Make multithreaded
--Perhaps collect webpages first THEN scan each for errors?
--Evetually a UI  (Processing API could make it look nice) 


Email attched of course!









EXAMPLE & really long output below 
>>site scanned: housing.ufl.edu
>>for links to: housing.ufl.edu 
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
Checked Page: http://www.housing.ufl.edu/gfh/apply/acceptancemeeting/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/howto/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/roommates/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/accommodations/ 
Checked Page: http://www.housing.ufl.edu/area/lakeside/ 
---Redirect on page: http://www.housing.ufl.edu/undergrad/move-in/ (Moved Permanently)
	link: http://www.housing.ufl.edu/undergrad/move-in#Packing List
	destination: http://www.housing.ufl.edu/undergrad/move-in/

Checked Page: http://www.housing.ufl.edu/undergrad/move-in/ 
Checked Page: http://www.housing.ufl.edu/area/beaty/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/florida-prepaid/ 
Checked Page: http://www.housing.ufl.edu/gfh/payments/howto/ 
Checked Page: http://www.housing.ufl.edu/gfh/payments/ 
Checked Page: http://www.housing.ufl.edu/gfh/payments/howto/ 
Checked Page: http://www.housing.ufl.edu/gfh/payments/rates/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/howto/ 
Checked Page: http://www.housing.ufl.edu/wp-content/uploads/2013/01/MasterPlan_2012-2018WEB.pdf 
Checked Page: http://www.housing.ufl.edu/blog/village/uvs/ 
Checked Page: http://www.housing.ufl.edu/about/employment/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/desk-assistant-employment-application/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/grad/faq/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/peer-mentor-application/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/application/ 
Checked Page: http://www.housing.ufl.edu/area/keys/ 
Checked Page: http://www.housing.ufl.edu/gfh/availability/ 
Checked Page: http://www.housing.ufl.edu/area/yulee/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/move-out/ 
Checked Page: http://www.housing.ufl.edu/communication/ 
Checked Page: http://www.housing.ufl.edu/communication/marketing-photographervideographer-request/ 
Checked Page: http://www.housing.ufl.edu/communication/marketing-submission-request/ 
Checked Page: http://www.housing.ufl.edu/communication/marketing-graphic-design-request/ 
Checked Page: http://www.housing.ufl.edu/communication/contactus/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/#Reserving a Space for a Roommate 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/recontracting-summer-2/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/recontracting/#Help 
---Redirect on page: http://www.housing.ufl.edu/undergrad/resources/ (Moved Permanently)
	link: http://www.housing.ufl.edu/undergrad/resouces/tv/
	destination: http://www.housing.ufl.edu/undergrad/resources/tv/

Checked Page: http://www.housing.ufl.edu/undergrad/resources/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/move-out/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/community-standards/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/community-standards/rights/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/roommates/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/involvement/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/hurricane-preparedness/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/tv/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/room-transfers/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/community-standards/rights/ 
Checked Page: http://www.housing.ufl.edu/blog/village/corry/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/room-transfers/ 
Checked Page: http://www.housing.ufl.edu/#secondary 
Checked Page: http://www.housing.ufl.edu/undergrad/appeals/contract/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/community-standards/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/community-standards/rights/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/acceptancemeeting/ 
Checked Page: http://www.housing.ufl.edu/area/tolbert/ 
Checked Page: http://www.housing.ufl.edu/area/murphree/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/local/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/transfer/ 
Checked Page: http://www.housing.ufl.edu/about/historicalreferenceform/ 
Checked Page: http://www.housing.ufl.edu/area/hume/ 
Checked Page: http://www.housing.ufl.edu/area/graham/ 
Checked Page: http://www.housing.ufl.edu/undergrad/choices/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/howto/ 
Checked Page: http://www.housing.ufl.edu/undergrad/apply/spring/ 
Checked Page: http://www.housing.ufl.edu/undergrad/contracts/disabilities/ 
Checked Page: http://www.housing.ufl.edu/communication/marketing-graphic-design-request/ 
Checked Page: http://www.housing.ufl.edu/undergrad/resources/community-standards/rights/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/eligibility/ 
Checked Page: http://www.housing.ufl.edu/gfh/resources/transfer/ 
Checked Page: http://www.housing.ufl.edu/communication/marketing-submission-request/ 
Checked Page: http://www.housing.ufl.edu/about/outreach/ 
Checked Page: http://www.housing.ufl.edu/gfh/apply/roommates/ 
Checked Page: http://www.housing.ufl.edu/undergrad/appeals/ 
Checked Page: http://www.housing.ufl.edu/undergrad/appeals/contract/ 
Checked Page: http://www.housing.ufl.edu/undergrad/appeals/financial/ 
Checked Page: http://www.housing.ufl.edu/blog/village/maguire/ 
Checked Page: http://www.housing.ufl.edu/area/jennings/ 
Checked Page: http://www.housing.ufl.edu/about/ 
---Redirect on page: http://www.housing.ufl.edu/about/staff_directory/ (Moved Permanently)
	link: http://www.housing.ufl.edu/staff_directory
	destination: http://www.housing.ufl.edu/about/staff_directory/

Checked Page: http://www.housing.ufl.edu/about/staff_directory/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/desk-assistant-employment-application/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/peer-mentor-application/ 
Checked Page: http://www.housing.ufl.edu/about/outreach/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/application/ 
Checked Page: http://www.housing.ufl.edu/about/employment/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/desk-assistant-employment-application/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/grad/faq/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/peer-mentor-application/ 
Checked Page: http://www.housing.ufl.edu/about/employment/student/application/ 
Checked Page: http://www.housing.ufl.edu/about/historicalreferenceform/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/florida-prepaid/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/rent-deferments/ 
Checked Page: http://www.housing.ufl.edu/undergrad/payments/rates/ 
