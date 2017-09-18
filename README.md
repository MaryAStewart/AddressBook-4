# AddressBook-4  This app has evolved from the previous apps with the same name to now utilize an HTML form which the user can click a button
called "List" that will display a list of all the entries in the Address Book.
When the user clicks the "List" button the command goes to the AddressBookServlet where the ArrayList "fList" is called from the UserDB class
which accessess the "Contacts" SQL database to fill the ArrayList. That information is then passed to the JSP which uses the information to
fill an HTML table which is then displayed for the user to see.
I added some CSS to the HTML table to enhance it.
I used Apache Tomcat as the server on my local machine. In order for this line of code
(<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>) in the jsp to work I had to drop the jstl-1.2jar in the lib folder
under the WEB-INF folder. I also had problems with the DriverManager in the UserDB class but, after much reading I found putting 
the Embedded Driver instead of ClientDriver made all the difference and finally connected to the SQL database.
You can see screen shots of the HTML form(png) and HTML table (list(png)) above in the "add files via upload".
The next iteration of this app will allow the user to add, update and delete from the address book.


