# CENG211 – Programming Fundamentals

## Homework #3

In this homework, you are expected to implement a “Library Management System” in Java.  
You should fulfill the concepts of:

- Abstract Data Types  
- Interfaces  
- Abstract Classes  
- Inheritance  
- Polymorphism  

Library Management System has a paid borrowing policy. There are books and magazines that can be borrowed by the members. The library needs to store information about these borrowed items to keep them in order. You are expected write a Java program to handle borrowing operations and perform tasks related to borrowed items.

Each item that can be borrowed (book or magazine) has a priority in order to use in the calculation of borrowing price. These priorities are: Invaluable, highly significant and noteworthy. Invaluable means the most important item. Highly significant means the second most important item and finally noteworthy means the least important item.

Each borrowing item book and magazine should be searchable by its title, also the title and itemType together. (Hint: Searchable interface)

The customer should be able to borrow books and magazines. So, each item must be borrowed and has necessary methods to borrow it. (Hint: Borrowing interface)

The library applies different price policies for different members. There are two types of members as student and general. For the student members, a discount is applied. If the student has a scholarship, he/she gets 30% discount. If the student does not have any scholarship, gets only 20% discount. General members do not receive any discount.

There will be start and end dates from which the borrowing period will be calculated. There is also a penalty for late returns. For books, if the borrowed time exceeds 10 days, $5 will be added to total charge. For the magazines, if the borrowed time exceeds 7 days, $2 will be added to the total price. (10 and 7 days do not consider as late).

! Calculate the borrowing charge, late charge, and discount in separate methods. Then, calculate the total price that the member should pay.

Borrowing charge for a book per day: $5.  
Borrowing charge for a magazine per day: $10.

Book Borrowing Charge:  
Borrowing Charge for Book = (Number of Days Borrowed) × (Borrowing Charge per Day for Book) ×(Priority)  
Borrowing Charge for Magazine = (Number of Days Borrowed) × (Borrowing Charge per Day for Magazine) × (Priority)

- Invaluable: 3 (the most important)  
- Highly significant: 2  
- Noteworthy: 1 (the least important)

Example borrowing charge:  
If the number of days borrowed is 7 and invaluable, the borrowing charge for book is: 7*5*3 = $105.  
If the number of days borrowed is 7 and noteworthy, the borrowing charge for book is: 7*5*1 = $35.  

(Late charge and discount will be calculated, if exist, after this step.)

In csv file, there is an itemNumber, title, priority (invaluable: very valuable, highly significant: has considerable importance, noteworthy: not as critical as other two categories.), itemType (book/magazine), author/genre, publisher/producer, customerType (studentWScholar/studentWoScholar,general), startBorrow, endBorrow.

You are expected to print itemNumber, title, itemType, the number of total borrowing days, exceeds the date or not (exceeds /not exceeds) and the total price that the member must pay.

You are also expected to search “History of Art” title with “book” itemType, and “Animal Farm” title if they exist or not. If it exists, print “exists” and itemNumber, title, itemType, the number of total borrowing days, exceeds the date or not (exceeds /not exceeds) and the total price that the member must pay. If it does not exist, print “does not exist”.

### Example Output:

```
Item Number: 101 Title: **** Item Type: **** Borrowing Days: ** days Exceed: Exceeds/Not Exceeds Total Price: $**

Item Number: 102 Title: **** Item Type: **** Borrowing Days: ** days Exceed: Exceeds/Not Exceeds Total Price: $**
.
.
.
Item Number: 2001 Title: **** Item Type: **** Borrowing Days: ** days Exceed: Exceeds/Not Exceeds Total Price: $**

Exist Item Number: *** Title: *** Item Type: *** Borrowing Days: ** days Exceeds/Not Exceeds Total Price: $**

Does not exist.
```

---
