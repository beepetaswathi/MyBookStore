# Book Store 
Application  Name : <b> MyBookStore </b>  <br>

Information of Team Members(Team08): 
1. Patlolla Venkateshwar Reddy(S555897)
2. Ramakrishna Reddy Boggula (S559309)
3. Swathi Beepeta(S561633)
4. Sai Sucharitha Konakanchi(S554816)
 
Application Information:   <br>

This application is intended to store a record of available books in a bookstore for the book-keeper where the bookkeeper and his employees can  update their inventory . This will help book keeper to manage their inventory like adding new book, updating book information and deleting a book. The book store owner(book-keeper) can create an account and update the inventory, as well as his employees by logging in using their credentials  <br>


Login Credentails for MyBookStore Access : <br>
 1. UserName: vreddy0918@gmail.com  <br>
    Password: Venk@t123    <br>
 
     

Firebase database link which is used as storage for our application: <br>
https://console.firebase.google.com/u/0/project/librarystorebook-5fbaa/overview  <br>

APK file Link: <br> [apkdebug.apk]

Supported devices: <br> All the android devices with latest versions

<b>Sequence Information:</b> <br>
This application has only one type of login.<br>
 Book keeper/employees(users). <br>
 
<b>Admin Flow:</b> <br>
1.The Person who want to manage their inventory has to regiter account using email account for the first time, Then he can login into the account, they can also reset password by clicking on forgot password 

2.After logining to the account, user can view home page It will display list of available book in inventory, with information like book image author name, and book language 

3. To add a book uploading an image is mandatory in order for the book to get added in to the inventory.

4. To update the details of any book the same procedure has to be followed as adding book


5. The app may crash if many users are logging in and using it at a time

6.  If an user want to remove any book from the book store, he can  delete it by clicking on the delete button.

7. An user can sign out succesfully and securely after finsiing their activities .

8.Note : A share and settings button has been created as a part of future improvement (which doesn't work currently)



<b>Contribution of individual team members:</b><br>

<b>Sai Sucharitha Konakanchi(S554816):</b><br>
<b>Update activity,Upload Image</b><br>
<b>nav_drawer</b><br>
<b>Java Files for related XML files</b><br>
<b>Firebase Integrity</b><br>


<b>Update Page activity, upload Image (activity_update.xml, upload activity_upload.):</b><br>
Created Update activity page,where a book keeper can update a new book in to his inventory and can search for the book he added.the image upload activity would handle adding images to specific book entries, aiding the bookkeeper in managing the inventory more effectively. The user can click on these buttons for updating and upload . These files are stored in firebase database  <br>

<b>nav_drawer:</b><br>
 Created  a basic structure for a navigation drawer for a bookkeeper managing a bookstore inventory,this serves as a hidden panel that contains navigational links ( homepage, about, settings , share and logout ) options  accessible by swiping from the edge or tapping a menu icon <br> . 

<b>Java Files for related XML files :</b><br>
Created related java files for Update activity,Upload Image,share activity.<br>

<b>Firebase Integrity:</b><br>
Integrated Firebase to achieve real-time data synchronization,Utlized this cloud-based storage for our book inventory, and ensure robust user authentication and security measures
.<br>

Swathi Beepeta S561633 - Worked on developing home screen activity and user login pages
where user can sign in / login into application. User can register one time using the email address and can reset their password by clicking forgot password. After login into home screen user can view the list if available books. Developed xml layouts and written java classes related to above mentioned functionalities.
-Worked with team in enhancing and end to end testing.
	

<b>Rama Krishna Reddy Boggula(S559309):</b><br>
<b>Author name,language of book for activity_upload </b><br>
<b>Updated Toast message in Registeractivity.Java</b><br>
<b>Removed system files and old version files</b><br>

<b>Author name,language of book and book name in activity_upload </b><br>
Enter the author's name for precise cataloging.it helps organize books systematically, enabling quick retrieval and categorization.Specify the language in which the book is written.it allows bookkeepers to streamline searches based on language preferences and cater to diverse customer needs.Input the title of the book for accurate identification.Forms the backbone of the inventory system, making it easier to manage, locate, and update book details.<br>

<b>Updated Toast message in Registeractivity.Java</b><br>
The purpose of adding the Toast message is to provide clear and meaningful feedback to the user regarding the outcome of their registration attempt.<br>

<b>Removed system files and old version files</b><br>
To make the app work more effectively and efficiently , i removed unnecessary files and modified them for the app to run successfully<br>


Venkateshwar Reddy Patlolla S555897 - Worked on developing layout and java classes related to canceling/removing book from bookstore app functionality and worked on connecting app with Firebase database, reviewed the team members code, cleared system files to maintain git repo. also worked on logout section, where user can completely exit from the app, Tested all the functionalities end to end and done enhancements in layout and code events along with the team
