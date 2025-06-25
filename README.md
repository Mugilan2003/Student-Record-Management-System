

# Student Record Management System (Java CLI)

##  Project Description

A simple **console-based Java application** that allows users to manage student records. This CRUD application uses Java's OOP features and an `ArrayList` to store and manipulate data.


##  Features

*  Add student details (ID, Name, Mark)
*  View all student records
*  Update student record by ID
*  Delete student record by ID
*  Exit program gracefully

---

##  Technologies Used

* Java (JDK 17+ recommended)
* IDE: VS Code / IntelliJ IDEA / Eclipse
* No external libraries needed

---

## File Structure

```
rePractice/
├── Student.java         // Student class with fields, constructor, getters, setters, toString()
└── StudentDataBase.java // Main class with CRUD logic and user menu
```

---

##  How It Works

###  Add Student

* Prompts for ID, name, and marks.
* Adds a new `Student` object to the `ArrayList`.

###  View Students

* Lists all students using the overridden `toString()` method.

###  Update Student

* Searches student by ID.
* Updates name and mark if found.

###  Delete Student

* Removes student by ID from the list.

---

##  Sample Run

```
Student Record Management
1.Add
2.View
3.Update
4.Delete
5.Exit
Enter Your Choice :
```

---

##  Requirements

* Java installed (`java -version`)
* Any Java IDE or terminal

