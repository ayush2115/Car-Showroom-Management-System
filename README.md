# Car Showroom Management System

This repository contains a Java project for a Car Showroom Management System. The system allows users to manage showrooms, employees, cars, and keep track of car purchase history.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Files Overview](#files-overview)
- [Usage](#usage)
- [Instructions](#instructions)

## Overview

The Car Showroom Management System is designed to streamline the management of car showrooms by providing functionalities to add and view showrooms, employees, cars, and purchase history. The system offers a user-friendly interface for easy navigation and operation.

## Features

- Add and manage showrooms, including details such as name, address, manager, total employees, and total cars in stock.
- Add and manage full-time and part-time employees with details like name, age, department, and showroom name.
- Add and manage cars with details like name, color, fuel type, price, type, and transmission.
- Sell cars to customers and maintain purchase history.
- View details of showrooms, employees, and cars.
- Calculate payroll for employees.

## Files Overview

- **Main.java**: Contains the main method and user interface logic.
- **Employee.java**: Abstract class representing an employee.
- **FullTimeEmployee.java**: Class representing a full-time employee.
- **PartTimeEmployee.java**: Class representing a part-time employee.
- **Showroom.java**: Class representing a showroom.
- **Car.java**: Class representing a car.
- **PurchaseHistory.java**: Class representing purchase history.
- **Utility.java**: Interface providing common methods.

## Usage

1. Run `Main.java` to start the program.
2. Follow the menu prompts to perform various actions like adding showrooms, employees, cars, selling cars, and viewing purchase history.

## Instructions

- To add a showroom, choose option 1 from the main menu and follow the prompts to enter showroom details.
- To add an employee, choose option 2 and specify the employee type (full-time or part-time), then provide employee details.
- To add a car, choose option 3 and provide car details.
- To view showrooms, employees, or cars, select the respective option from the main menu.
- To sell a car, choose option 8 and enter the car ID, customer name, and purchase price.
- To view car purchase history, choose option 9 from the main menu.
