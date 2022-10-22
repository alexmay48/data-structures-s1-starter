 
# Landscape Reports

## Using Maps (Hash Maps / Tree Maps)

We have been hired by a landscape company to analyze their data to give them important reports. They have an application that employees use to record their working data, and this application exports this data onto a .csv file.

The company needs you to create reports base off this data like the time worked by each of the employees, and it needs to know which employees worked for each client just in case the client has complaints.

Fun Note: This was similar to some side work I did for an actual Landscaping company. This data is very real world. The names of the employees and clients have been changed/sanitized to protect identities.

## Assignment Goals

1. Practice using HashMaps / TreeMaps in applications.
2. Practice writing an application using real world data.
3. Practice writing code with good style and coding practices

## Cheating

Cheating is when you copy and paste from another person. When using snippets of code from online sources, it is typically fine if you are just taking a small snippet. However, if a little larger, you should always have a commented line in the code with the source name, like the URL.

It is typically best practice to always name your sources. (It is also nice to have a reference to that source if you need it in the future).

## The Problem

A landscape company needs some information from the working data of their employees. They need a summary of the time that each employee worked, and they need to know which employees worked on projects for each client. They have asked you to create these two reports.

IMPORTANT: One requirement of this application is that it must only scan the .csv file once. This will ensure performance and speed. This means that you must store the data you need into data structures as you scan the document.

The employee report will list all of the employees, with their time worked. Each line in the EmployeeTimeReport.txt should look like this:

`EMPLOYEE: (EmployeeName) --- TIME: (HH:MM)`

An example of that is below:

`EMPLOYEE: Carlos A --- TIME: 95:14`

IMPORTANT: An employee's time is determined by if the "Info" column reads "Clock In/Out".

IMPORTANT: The employee report must name all of the employees in alphabetical order.

The client report will list all of the clients and all of the employees that worked for that client during this two week period. It should look like this:

`CLIENT: (ClientName) --- EMPLOYEES: [(EmployeeName), (EmployeeName), (EmployeeName)]`

An example of that is below:

`CLIENT: Ana G --- EMPLOYEES: [Juan R, Omar G, Robert L]`

IMPORTANT: The client report must name all of the clients in alphabetical order, with the employees in alphabetical order as well.

## Testing
It is always a smart idea to have JUnit tests. If you write these tests knowing of their accuracy, it will help you find where you might have mistakes in your application.

Tests are required to receive full credit for the assignment.

## Starting Spot

Please accept the GitHub classroom invitation here to get started on your repository: 

Description of the files:

- ReportsMain.java - the entry point of the application
  - This should be a small application, and the majority of the application should remain in this file. This is the entry point because it contains the "main" method.

- Data Files
  - These are the data files that you will be reading from and generating the reports off of.
    - TimeDataLarge.csv
    - TimeDataMedium.csv
    - TimeDataSmall.csv
   
- Report Files
  - These report files are exact examples what the application is supposed to produce. They are provided so you can compare your solution to what they are supposed to be.
    - ClientWorkerReportMedium.txt
    - ClientWorkerReportSmall.txt
    - EmployeeTimeReportMedium.txt
    - EmployeeTimeReportSmall.txt

## Requirements

- In your solution, you must use a HashMap or TreeMap somewhere in your application.
- You must only scan the file once. This means when scanning each line of the application, you should store the data from the file in data structures as you go along. Now, once you have scanned the file, you will iterate over the data structures, and you can iterate over them as many times as you'd like.
- The reports must generate the report exactly as outlined in "The Problem" section. Here is a recap for that:

The employee report will list all of the employees, with their time worked. Each line in the EmployeeTimeReport.txt should look like this:

`EMPLOYEE: (EmployeeName) --- TIME: (HH:MM)`

An example of that is below:

`EMPLOYEE: Carlos A --- TIME: 95:14`

IMPORTANT: An employee's time is determined by if the "Info" column reads "Clock In/Out".

IMPORTANT: The employee report must name all of the employees in alphabetical order.

The client report will list all of the clients and all of the employees that worked for that client during this two week period. It should look like this:

`CLIENT: (ClientName) --- EMPLOYEES: [(EmployeeName), (EmployeeName), (EmployeeName)]`
An example of that is below:

`CLIENT: Ana G --- EMPLOYEES: [Juan R, Omar G, Robert L]`
IMPORTANT: The client report must name all of the clients in alphabetical order, with the employees in alphabetical order as well.

- An employee is associated with an Employee if the row of data has a client in the client column.
- The application must create .txt files that have each of the line endings with CRLF. This means that when writing to the file, you should have "\r\n" at the end of each line, and NOT simply "\n".
- You are more than welcome to write other class files, and encouraged to do so.

## Notes/Tips/Tricks for Solution

Here I will provide some things to know about the application and some tips on how to proceed. As long as you fulfill the requirements, you can implement it whatever way you want. Ultimately, the end user just needs the report to be produced how they asked. However, there are ways to get this done easily, and there are a million ways to solve this problem in a complicated way.

While there are many ways to solve it, using objects will probably help tremendously. Let's think about how we would maybe create these objects:

- I have Clients, and each Client needs to contain their name and a list of employees
- While the client needs to have a list of these employees, each of the employee name should only occur once
- I have Employees, and each Employee needs to contain their name and time worked
- Both the Client and Employee have a name field
- Both the Clients and Employees will need to be sorted by their name

From the thoughts above, I hope you can see a pattern of what we can do with some objects. Since both have the need of a "name" field, we can create a parent class that has that field. Now, both need to be sorted by that name field. What can we do to an object in Java to make it so that it can be sorted? Implement Comparable!!!

So, maybe you can have a parent class be declared like this:

`public abstract class Person implements Comparable<Person>`

In that parent Person class, you will need to implement the compareTo() method, but you just need to sort it by name, which will probably a String, so you can just use String's compareTo() method inside it.

You can have Employee extend Person, but then have their own variable for time worked, and then have Client extend Person, but have an object contain the list of employees. (This data structure object should maybe be a set of some sort so there is no duplicate employee added...)

## Analysis
This course is not only about creating software to do "something" but also about understanding why programs (algorithms and data structures) work in the way they do. When you are satisfied that your program is correct, you are to write an analysis document discussing your findings.

### Program Analysis Document

You are to create an "Analysis Document" for your program. The purpose of this document is to discuss what you have learned in the programming assignment, and what you understand about it.

The document should only be written when you have finished programming and have thoroughly tested your code, so make sure to leave plenty of time to do this!

Note: This document should be as concise as possible but still fully answer the questions below.

Call your analysis document: "analysis.pdf"

Make sure you put a title on your paper and your name. Please also make well defined sections for each of the questions below. Use your best writing skills. Make sure to proofread your essay before handing it in.

The document should have following sections:

1. Overview of Project
     - In a paragraph or two summarize what you learned about using Maps in this assignment.
     - Did you use a Hash Map or a Tree Map to solve the problem. Why did you choose the data structure you used?
2. Complexity
    - What is the Big O complexity of the application? (This may be different for each student, depending on if there are inner for-loops and such in their algorithm. The "N" of this Big O complexity should be the number of rows in the .csv.)
3. Software Development Log
    - How much time did you spend on this project? 
    - What was the most time consuming part of the programming? What can you do better in the future?
    - What problems came up that took disproportionate amounts of time?
    - What would you change about the assignment?

Please place the analysis PDF in the src/main/resources folder. 

## Finishing Up

Make sure you test the program thoroughly and systematically.

Your code should be well-commented (Javadoc comments are required) and formatted such that it is clear and easy to read. You must have at least: comments for every method describing what the method does, what the arguments are (and what they mean), and what the return value is, as well as any special cases that the method handles or can run in to. This may be provided for many of the methods already, but make sure that you do it for any helper methods you may write. You should also have comments on any line or block of code that is not self-explanatory.

Turn in your project through committing in GitHub. 

Please keep the same folder structure as the starter code. The handing must be through GitHub. When submitting this assignment in canvas, please state that you are done, and please name what the last commit message to your GitHub repository was that I will use for grading.

Each partner should submit a copy of the solution. Each partner's solution should be the same as their partners unless indicated in their write up that something went wrong.

As always include an assignment.properties file.

## README Info and Code Pledge
In addition to the information provided for the assignment requirements, sometimes when you create your program, you will want to inform the user (in this case the Teacher) something about how to run your program, or what cool features you have added that are not obvious. Please add TO THE END of this README (in the "Any Additional Information" section) any information that should be noted to the teacher.

Please fill out the following:

Your Name: 

Your ID: 

The Date: 

The Class Number: 

The Assignment Number: 

Your partner name (when appropriate): 

I pledge that the work done here was my own and that I have learned how to write this program, such that I could throw it out and restart and finish it in a timely manner. I am not turning in any work that I cannot understand, describe, or recreate. I further acknowledge that I contributed substantially to all code handed in and vouch for it's authenticity. (YOUR-NAME)

TODO: Type your name at the end of this pledge to acknowledge it.

### Any Additional Information
