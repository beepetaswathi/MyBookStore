# Book Store 
Application  Name : <b> MyBookStore </b>  <br>

Information of Team Members(Team08): 
1. Sai Sucharitha Konakanchi(S554816) 
2. Swathi Beepeta(S561633)
3. Ramakrishna Reddy Boggula (S559309)
4. Patlolla Venkateshwar Reddy(S555897)

[MyBookStore GitHub Link](https://github.com/beepetaswathi/MyBookStore)

Application Information:   <br>

This application is intended to store a record of available books in a bookstore for the book-keeper where the bookkeeper and his employees can  update their inventory . This will help book keeper to manage their inventory like adding new book, updating book information and deleting a book. The book store owner(book-keeper) can create an account and update the inventory, as well as his employees by logging in using their credentials  <br>


Login Credentails for MyBookStore Access : <br>
 1. UserName: vreddy0918@gmail.com  <br>
    Password: Venk@t123    <br>
 2. UserName: rkboggula009@gmail.com  <br>
    Password: 123456789    <br>
 3. UserName: swathibeepta10@gmail.com  <br>
    Password: swathi54321    <br>     
 4. UserName: suchi999@gmail.com  <br>
    Password: 123456    <br>
 
     

Firebase database link which is used as storage for our application: <br>
https://console.firebase.google.com/u/0/project/librarystorebook-5fbaa/overview  <br>

APK file Link: <br> [apkdebug.apk]

Supported devices: <br> All the android devices with latest versions

<b>Sequence Information:</b> <br>
This application has only one type of login.<br>
 Book keeper/employees(users). <br>
 
<b>Admin Flow:</b> <br>
1. The Person who want to manage their inventory has to regiter account using email account for the first time, Then he can login into the account, they can also reset password by clicking on forgot password 

2. After logining to the account, user can view home page It will display list of available book in inventory, with information like book image author name, and book language 

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

<b>Swathi Beepeta(S561633):</b><br>
<b>HomeActivity</b><br>
<b>ForgotPassword</b><br>
<b>MainActivity</b><br>
<b>toolbar.xml,recyclerview.xml</b><br>
<b>Java Files for related XML files</b><br>

<b>Main activity, Home Activity (activity_home.xml, activity_main.):</b><br>
Developed xml layout related to account Login, Register and forgot password layouts, when user open the app for the first time, they has to register their account using email and then user can login into their account, if user forgets password for their account then User can click on forgot password this will allow to reset to new password.<br>

<b>Recycler View (recycler_item.xml):</b><br>
Created recylcer view it is a RelativeLayout holds a circular ShapeableImageView displaying a default image, alongside several TextViews presenting title, priority, description, and language information. Each element is meticulously styled with fixed dimensions, colors, and alignments, creating a cohesive and visually appealing card-based UI for displaying record details.

<b>Tool Bar (toolbar.xml):</b><br>
The XML code defines a horizontal LinearLayout serving as a custom toolbar in an Android app. The toolbar includes an ImageView displaying a book icon and a TextView with the text "library book". 

<b>Java Files for related XML files:</b><br>
Created related java files for MainActivity, HomeActivity,RegisterActivity and ForgotPassword functionalities.
And also used firebase libararies for connecting to firebase database to store login credentials and retriving account details.
	

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


<b>Patlolla Venkateshwar Reddy(S555897):</b><br>
<b>DataClass.Java AboutActivity.java</b><br>
<b>Build files</b><br>

<b>about activity (AboutActivity.java.):</b><br>
The code represents an Android app's "about" section, featuring an activity named "aboutActivity." It configures a navigation drawer with menu items such as home, settings, share, about, and logout. Clicking on these items triggers specific actions: navigating to different sections of the app, displaying information, or executing functions like logging out. The code uses Intent redirection to move between activities and ensures the navigation drawer closes when the activity is paused, maintaining a smooth user experience

<b>DataClass.java</b><br>
The code defines a Java class named DataClass, designed to hold information about books in a bookstore app. It contains fields for a book's title, description, language, and image, with methods to access and modify these details. Additionally, it includes a unique identifier (key) for each book entry. This class essentially acts as a structured container for managing and organizing book-related data within the app's code. 
Corrected build files and refractored code
