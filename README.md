# Salary Calculator

This is a Java console application that allows a manager to calculate the pay for up to **three employees** by entering their **hourly rate** and **hours worked**. The program includes **input validation** to ensure accurate entries.

> **Course**: CSIS 212-B02  
> **Author**: David Lyman  
> **No external citations used**

---

## 📁 Project Structure

salarycalc/
├── SalaryCalc.java // Source file with input validation and salary logic
├── SalaryCalc.class // Compiled bytecode file

---

## 💡 Features

- Collects input for **hourly rate** and **hours worked**
- Calculates salary for **three employees**
- **Input validation** ensures no negative numbers are accepted
- Provides clean and formatted output for all employees
- Simple control flow using loops and conditionals

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or later
- Text editor or IDE (e.g. IntelliJ, Eclipse, VS Code)

### 📦 How to Run

1. Clone or download the `salarycalc` folder.
2. Open a terminal and navigate to the folder:

   ```bash
   cd salarycalc
3. Compile the Java file:

   ```bash
   javac SalaryCalc.java
4.Run the program:

   ```bash
  java salarycalc.SalaryCalc
```

📄 Sample Run
Please enter hourly rate: 20
Please enter the hours you worked: 40
Please enter hourly rate: 25
Please enter the hours you worked: 35
Please enter hourly rate: 30
Please enter the hours you worked: 20

Pay for employee 1: $800.00
Pay for employee 2: $875.00
Pay for employee 3: $600.00

---
🧠 Concepts Demonstrated
Loops for iterative input (for 3 employees)

Input validation using do-while and conditionals

Arithmetic operations for salary calculation

Formatted output using System.out.printf

Scanner class for user input

--- 

📜 License
This project is for academic purposes only and is not licensed for production or distribution.
