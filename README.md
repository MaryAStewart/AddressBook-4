# AddressBook-4  This app has evolved from the previous apps with the same name to now utilize an HTML form which the user can click a button
called "List" that will display a list of all the entries in the Address Book.
When the user clicks the "List" button the command goes to the AddressBookServlet where the ArrayList "fList" is called from the UserDB class
which accessess the "Contacts" SQL database to fill the ArrayList. That information is then passed to the JSP which uses the information to
fill an HTML table which is then displayed for the user to see.
I added some CSS to the HTML table to enhance it.

I used Apache Tomcat as the server on my local machine. In order for this line of code:
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> in the jsp to work I had to drop the jstl-1.2jar in the lib folder
under the WEB-INF folder. Some other important notes regarding using Tomcat: make sure the derby.jar(Embedded Driver) and 
derbyclient.jar(Client Driver) are in the Build Path for the project as well as the lib folder for Tomcat. Also, to get the Driver 
Manager to work in the UserDB class I had to add this line of code:  DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
In order to get this project to run open the index.html in the html editor and then right click on the open file, go to Run As, Run on Server.  This should start the server and open the HTML form. Now click the "List" button. This will make the HTML table appear
with the Address Book list of entries.


You can see screen shots of the HTML form(png) and HTML table (list(png)) above in the "add files via upload".
The next iteration of this app will allow the user to add, update and delete from the address book.


