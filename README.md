## Pharmacy-Management-System

# Chapter 1

**1. 	INTRODUCTION** <br>
The main aim of the project is the management of the database of the pharmaceutical shop. This project is insight into the design and implementation of a Pharmacy Management System. This is done by creating a database of the available medicines in the shop. The primary aim of pharmacy management system is to improve accuracy and enhance safety and efficiency in the pharmaceutical store. The aim of this project is to develop software for the effective management of a pharmaceutical store. We have developed this software for ensuring effective policing by providing statistics of the drugs in stock. 

**1.1. 	Description on the topic**<br>
This program can be used in any pharmaceutical shops having a database to maintain. The software used can generate reports, as per the user’s requirements. The software can print invoices, bills, receipts etc. It can also maintain the record of supplies sent in by the supplier. Here, the admin who are handling the organization will be responsible to manage the record of the employee. Each employee will be given with a separate username and password.

**1.2	Problem Definition**<br>
The aim of the project is to create an effective software to help the pharmacist to maintain the records of the medicines, handle user details, generate invoice, check and renew validity and provide a scope of communication between users by using inbuilt messaging system. Pharmacy management system deals with the maintenance of drugs and consumables in the pharmacy unit. This pharmacy management system is user friendly.


**1.3	Objectives**<br>
**1.3.1 Primary objective**<br>
•To gain practical experience by modeling a software based on real world    problem.
•To understand how to work on Front-end (Java) and Back-end (MySQL) by using server(wamp).

**1.3.2 Secondary objective**<br>
•To develop an application that deals with the day to day requirement of any pharmacy.
•To develop the easy management of the medicines (drugs). 
•To handle the inventory details like sales details, purchase details and stock expiry and quantity.
•To provide competitive advantage to the pharmacy.
•To provide details information about the stock on details necessary and help locate it in shop easily. 
•To make the stock manageable and simplify the use of inventory in the pharmacy.



**1.4	Hardware and software tools:**<br>
The system services and goals are established by consultation with system user. They are then defined in details and serve as a system specification. System requirement are those on which the system runs.
**A.	Hardware Requirements:**<br>
o	Computer with either Intel Pentium processor or AMD processor.
o	128MB DDR RAM
o	40GB hard disk drive


**B.	Software Requirements:**<br>
o	Windows XP/7/10 operating system.
o	JRE and JDK.
o	MySQL server (WAMP or XAMPP or any)













# Chapter 2 
2. 	Design
Database Design is a collection of processes that facilitate the designing, development, implementation and maintenance of enterprise data management systems
It helps produce database systems:
o	That meet the requirements of the users
o	Have high performance.
2.1	 Architecture Description 
The design of a DBMS depends on its architecture. It can be centralized or decentralized or hierarchical. The architecture of a DBMS can be seen as either single tier or multi-tier.
2.1.1	ER Diagram
 
Fig 1: ER Diagram

An entity–relationship model describes interrelated things of interest in a specific domain of knowledge (Refer Fig 1). It is composed of entity types and specifies relationships that can exist between instances of those entity types.
 
2.1.2	Relational Schema Diagram
 Fig 2: Relational Schema
Relational schema is a collection of meta-data. Database schema describes the structure and constraints of data representing in a particular domain (Refer Fig 2). These two diagrams have been designed based on the tables (table1 – table8) as shown pictorially below in Chapter 3. 

Chapter 3 
3. 	IMPLEMENTATION
3.1	Description on Implementation 
The goal of this application is to manage the medicines and various function of the pharmacy. 
List of modules:
o	Login page.
o	Home page.
o	Company.
o	Purchase
o	Drugs
o	Sales
o	User/Settings
o	Messaging
3.1.1 Description on each module implemented
1.	Login pages
This module is used to prevent unauthorized access. Also, using this module the user is presented the form, the username determines the type of user login as shown below in table 1 and fig 3.

                 
Table 1: Login Table
 
Fig 3: Login Page

2.	Home Page
This module gives various options that help the pharmacist work on their daily transactions. It also gives contact information and about page as shown in fig 4.

 
Fig 4: Home Page
3.	Company page
This module provides options to add or remove a company. The user can view or update the existing companies from where the commodities are purchased as shown in table 2 and fig 5.
                           
Table 2: Company Table

 
Fig 5: Company form
4.	Purchase page
This module gives options to purchase drugs from company, check deals and update deals as shown in table 3 and fig 6. It is restricted to admin.

             
Table 3: Purchase Table

 
Fig 6: Buy Drugs Form

5.	Drugs page
This module gives options to check location of drug, sell drugs, renew validity, get alert on drug expiry, add or delete or update drugs etcetera.
Refer to table 4 and fig 7.

                
Table 4: Drugs Table

 
Fig 7: Drug Form
6.	Sales page
This module is the billing page. The user can generate invoices, check previous invoice as shown in table 5 and fig 8. 

 
Table 5: History_sales Table
 
Fig 8: Sales bill

7.	User and Settings page
The settings option can be used by anyone but the user option needs admin privileges. It provides options to add or delete or update users. The settings module can be used to check login details of other users, change password or to logout from the application. (see table 6, fig 9and fig 10).

                    
Table 6: User Table
 Fig 9: User Form

 
Fig 10: Login Details

8.	In-built Messaging module
This module provides users of the application with an interface to communicated with each other through messages. This is a robust module that comes with an inbox, as shown in table 7 and fig 11.

           
Table 7: Inbox Table
 
Fig 11: Messaging module

Chapter 4 
4. 	Result and Discussion
By using MySQL commands and its database this website Pharmacy management tends to store all the data received from the users including drugs sales details and the profit made by the owners are all in this data base.
This website allows the user to generate invoices for sales, check expiry and quantity remaining of the drugs. It also provides user with options to renew validity and add more drugs into the store and update the database accordingly.
By using xampp server these database commands are easily initiated into the database and the ER diagram with relational schema diagrams helps us to make the structure of the database faster and it was easier to make them understand the needs of the website.












CONCLUSIONS AND FUTURE SCOPE
o	Detailed information gathering has to be done. Without that the purpose for using the software won’t be satisfied properly.
o	However, it can give good profits in the long run.
o	Implementing the software requires change in the business practices.
o	Efficient organization of all knowledge is the analysis company and easy analysis access and retrieval of information is possible.
o	In this project we can also include BAR CODE facility using the bar code reader, which will detect the expiry date and the other information about the related medicines.
o	Company using this software will always be able to plan in future and always be aware of their financial position in the market.
o	It leads to ease in functioning of business processes.
o	The project can be made more robust by including biometric verification.
o	There is also a scope to expand by implementing newer technologies like cloud etcetera. 
