# Prgoramming Fundementals Homework 3: Library Management System

## Overview

This project implements a **Library Management System** using **Java**, where users can borrow books and magazines, and the system manages borrowing fees, late charges, discounts, and more. The project makes use of **Abstract Data Types (ADTs)**, **interfaces**, **abstract classes**, **inheritance**, and **polymorphism**.

## Project Structure

- **Abstract Classes and Interfaces**: These are used to manage different borrowable items like books and magazines and to apply discounts based on member types.
- **Inheritance and Polymorphism**: Different types of members (students and general) and items (books and magazines) are implemented using these OOP concepts.

## Features

1. **Item Borrowing**: 
    - Books and magazines can be borrowed for specific durations, with different borrowing charges.
    - Each item has a priority level (invaluable, highly significant, noteworthy), which affects the borrowing fee.

2. **Member Types**: 
    - **Student members**: They receive discounts based on their scholarship status (30% with scholarship, 20% without).
    - **General members**: No discounts are applied.

3. **Late Fees**:
    - For books: If the borrowing period exceeds 10 days, a late fee of $5 is added.
    - For magazines: If the borrowing period exceeds 7 days, a late fee of $2 is added.

4. **Search Functionality**:
    - Search for items by title and item type (book or magazine).
    - Example searches: "History of Art" (book) and "Animal Farm".

5. **Price Calculation**:
    - Borrowing charge = (Number of days borrowed) × (Daily borrowing charge) × (Priority).
    - Total cost = Borrowing charge + Late fees (if applicable) − Discounts (if applicable).

6. **CSV Data Input**:
    - A CSV file provides input data including item numbers, titles, priorities, item types, and more.

## Example Output
```
Item Number: 101 Title: **** Item Type: **** Borrowing Days: ** days Exceed: Exceeds/Not Exceeds Total Price: $**
Item Number: 102 Title: **** Item Type: **** Borrowing Days: ** days Exceed: Exceeds/Not Exceeds Total Price: $** ...
Exist Item Number: *** Title: *** Item Type: *** Borrowing Days: ** days Exceeds/Not Exceeds Total Price: $** Does not exist.
```
