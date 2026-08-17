# ☕ Java Learnings

Welcome to my **Java Learning Repository!** 🚀

This repository contains the Java concepts and practice programs I am learning step by step. Each program focuses on a particular concept, with simple explanations to make it useful for anyone who is also beginning their Java journey. 📚

---

# 📌 Topics Covered

Currently, this repository contains:

* ☕ Java Program Basics
* 📦 Variables and Data Types
* 🔀 `if-else` Statements
* ⌨️ Taking User Input using `Scanner`
* 🔢 Different Types of User Input
* 🧠 Boolean Conditions
* 📝 Printing and displaying information

---

# 1️⃣ Main.java — First Java Program

## 🧠 What does this program do?

This is my first basic Java program. It demonstrates the basic structure of a Java program and how to print a message on the screen.

## 💻 Code

```java
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to java learnings!");
    }
}
```

## 🔍 Explanation

### `public class Main`

This creates a class named `Main`.

A **class** is like a container that holds the code belonging to a particular program.

### `public static void main(String[] args)`

This is the **main method**.

The Java program starts executing from the `main()` method.

* `public` → allows the method to be accessed by Java.
* `static` → allows Java to run the method without creating an object of the class.
* `void` → means the method does not return a value.
* `main` → the special method where program execution begins.
* `String[] args` → stores command-line arguments.

### `System.out.println()`

This is used to **print output to the console**.

In this program:

```java
System.out.println("Welcome to java learnings!");
```

prints:

```text
Welcome to java learnings!
```

## 🎯 What I learned

* Basic Java program structure
* How a Java class is created
* What the `main()` method is
* How to print output using `System.out.println()`

---

# 2️⃣ variables.java — Variables, Data Types & if-else

## 🧠 What does this program do?

This program demonstrates how to create variables, store different types of data, print their values, and use a boolean variable with an `if-else` statement.

## 💻 Code

```java
public class variables {
    public static void main(String[] args) {
        int age, grade;
        double marks;
        boolean isStudent = false;

        age = 21;
        grade = 'A';
        marks = 99.67;

        System.out.println(age);
        System.out.println(grade);
        System.out.println(marks);

        if (isStudent) {
            System.out.println("you are a student");
        } else {
            System.out.println("you are NOT a student");
        }
    }
}
```

## 📦 What is a variable?

A **variable** is a named storage location used to store a value.

For example:

```java
int age = 21;
```

Here:

* `int` → data type
* `age` → variable name
* `21` → value

Think of a variable as a labeled box 📦 that stores some information.

---

## 🔢 Data Types Used

### `int`

```java
int age;
```

`int` is used to store **whole numbers**.

Example:

```java
age = 21;
```

### `double`

```java
double marks;
```

`double` is used to store **decimal numbers**.

Example:

```java
marks = 99.67;
```

### `boolean`

```java
boolean isStudent = false;
```

A `boolean` can have only two values:

```text
true
false
```

Here, `isStudent` is set to `false`.

---

## ⚠️ Important: `grade = 'A'`

In the program:

```java
int age, grade;
grade = 'A';
```

`grade` is declared as an `int`, but `'A'` is a **character (`char`)**.

Java converts the character `'A'` to its numeric Unicode value:

```text
'A' → 65
```

Therefore, this program prints:

```text
21
65
99.67
```

If the intention is to store the letter `A`, the better declaration would be:

```java
char grade;
grade = 'A';
```

Then it would print:

```text
A
```

💡 **Important lesson:** `int` and `char` are different data types.

---

## 🔀 if-else Statement

The program uses:

```java
if (isStudent) {
    System.out.println("you are a student");
} else {
    System.out.println("you are NOT a student");
}
```

The `if` statement checks whether the condition is `true`.

Since:

```java
boolean isStudent = false;
```

the condition is false, so the `else` block executes.

Output:

```text
you are NOT a student
```

## 🎯 What I learned

* What variables are
* How to declare variables
* `int` for whole numbers
* `double` for decimal numbers
* `boolean` for true/false values
* `char` for single characters
* How `if-else` works
* How conditions control which code gets executed

---

# 3️⃣ scanner.java — Taking User Input

## 🧠 What does this program do?

This program demonstrates how to take different types of input from the user using Java's `Scanner` class.

The program asks the user for:

* 👤 Name
* 🎂 Age
* 📊 CGPA
* 🎨 Favourite color
* 🎓 Whether they are a student

It then displays all the information.

## 💻 Code

```java
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = sc.nextLine();

        System.out.print("enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("enter your cgpa: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();

        System.out.print("enter your favourite color: ");
        String color = sc.nextLine();

        System.out.print("are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        sc.nextLine();

        System.out.println("-------------DETAILS-----------");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("favourite color: " + color);

        if(isStudent){
            System.out.println("you are enrolled as a student!");
        }
        else{
            System.out.println("you are not enrolloed!");
        }

        sc.close();
    }
}
```

---

## 📥 Importing Scanner

```java
import java.util.Scanner;
```

`Scanner` belongs to Java's `java.util` package.

We import it so that we can use the `Scanner` class in our program.

---

## ⌨️ Creating a Scanner

```java
Scanner sc = new Scanner(System.in);
```

This creates a Scanner object named `sc`.

`System.in` tells Scanner to receive input from the keyboard.

Think of it as:

> 🎤 "Java, listen to what the user types."

---

## 📝 Taking String Input

```java
String name = sc.nextLine();
```

`nextLine()` reads a complete line of text.

For example:

```text
Enter your name: Chinnu
```

The value `"Chinnu"` is stored in the `name` variable.

---

## 🔢 Taking Integer Input

```java
int age = sc.nextInt();
```

`nextInt()` reads a whole number.

Example:

```text
Enter your age: 21
```

The value `21` is stored in `age`.

---

## 🔢 Taking Decimal Input

```java
double cgpa = sc.nextDouble();
```

`nextDouble()` reads a decimal number.

Example:

```text
Enter your cgpa: 9.2
```

The value `9.2` is stored in `cgpa`.

---

## 🎨 Taking Another String

```java
String color = sc.nextLine();
```

This reads the user's favourite color.

Example:

```text
Enter your favourite color: Blue
```

---

## ✅ Taking Boolean Input

```java
boolean isStudent = sc.nextBoolean();
```

This accepts:

```text
true
```

or

```text
false
```

The value is then stored in `isStudent`.

---

# ⚠️ Why is `sc.nextLine()` used after `nextInt()` and `nextDouble()`?

You may notice these lines:

```java
int age = sc.nextInt();
sc.nextLine();
```

and:

```java
double cgpa = sc.nextDouble();
sc.nextLine();
```

This is important when using `Scanner`.

`nextInt()` and `nextDouble()` read the number but leave the **Enter/newline** in the input buffer.

The following:

```java
sc.nextLine();
```

consumes that leftover newline.

This allows the next `nextLine()` to correctly read the user's text.

💡 This is a very common beginner issue when learning `Scanner`.

---

# 🔀 Using if-else with User Input

At the end:

```java
if(isStudent){
    System.out.println("you are enrolled as a student!");
}
else{
    System.out.println("you are not enrolloed!");
}
```

The program checks the value entered by the user.

If the user enters:

```text
true
```

the `if` block executes.

If the user enters:

```text
false
```

the `else` block executes.

---

# 🔒 Closing Scanner

At the end:

```java
sc.close();
```

This closes the Scanner after we finish using it.

It is good practice to close resources that are no longer needed.

---

# 🎯 What I Learned

Through these programs, I learned:

* ☕ Basic Java program structure
* 📦 Variables
* 🔢 Data types
* 🔤 `char`
* 🔘 `boolean`
* 🔀 `if-else`
* ⌨️ `Scanner`
* 📝 String input
* 🔢 Integer input
* 🔢 Decimal input
* ✅ Boolean input
* 🧠 Handling `nextLine()` after numeric input
* 🖥️ Displaying output

---

# 🚀 My Java Learning Journey

This repository will grow as I learn more Java concepts.

### 📚 Coming Next

* 🔀 Conditional Statements
* 🔁 Loops
* 📋 Arrays
* 🧩 Methods
* 🏗️ Object-Oriented Programming
* 📦 Classes & Objects
* 🔐 Encapsulation
* 🧬 Inheritance
* 🎭 Polymorphism
* 🚀 And eventually DSA with Java

> 💡 **Learning by writing, understanding, and practicing — one program at a time.**
