# Photographer Management - Java Program

This Java program is designed to manage a list of photographers and perform two main operations:

1. **Count photographers by specialization** (case-insensitive).
2. **Retrieve the second highest rated photographer**.

---

## 📌 Problem Statement

Create a class `Photographer` with the following attributes:

- `id` - `int`
- `name` - `String`
- `specialization` - `String`
- `rating` - `double`

Include the following in the `Photographer` class:

- A **parameterized constructor** in the specified order.
- **Getters and setters** for all attributes.

Create a class `Solution` with the following:

- A `main` method to:
  - Read input using `Scanner`
  - Invoke the required methods
  - Display the results

- Implement two static methods:

---

### 1️⃣ `countPhotographersBySpecialization(Photographer[] arr, String specialization)`

- Returns the number of photographers whose `specialization` matches the input string (case-insensitive).
- If no photographers match, return `0`.

#### Output:
- If count > 0:  
  `"Number of photographers in <specialization>: <value>"`
- Else:  
  `"No photographers found for the given specialization."`

---

### 2️⃣ `getSecondHighestRatedPhotographer(Photographer[] arr)`

- Returns the `Photographer` object with the **second highest rating**.
- If multiple photographers have the same rating, return the first one among them (based on input order).
- If fewer than 2 unique ratings are present, return `null`.

#### Output:
- If result is not null:  
```
id-<id>
name-<name>
specialization-<specialization>
rating-<rating>
```

- Else:  
`"Second highest rated photographer not available."`

---

## 🔡 Sample Input 1
```
4
101
Meera
Wildlife
4.1
102
Raj
Portrait
4.2
103
Anita
wildlife
4.5
104
Veer
Fashion
4.8
Wildlife
```

### ✅ Output 1
```
Number of photographers in Wildlife: 2
id-103
name-Anita
specialization-wildlife
rating-4.5
```

---

## 🔡 Sample Input 2
```
4
101
Meera
Wildlife
4.9
102
Raj
Portrait
4.2
103
Anita
Wildlife
4.5
104
Veer
Fashion
4.8
Home Decor
```

### ✅ Output 2
```
No photographers found for the given specialization.
id-104
name-Veer
specialization-Fashion
rating-4.8
```

---

## 📝 Notes

- All string comparisons are **case-insensitive**.
- Avoid formatting the output — just print as specified.
- If facing issues while reading strings after numeric inputs, use an extra `nextLine()` call after reading `int` or `double` inputs to clear the newline character.

---

## 💡 Technologies Used

- Java 8+
- Standard Input/Output
- Object-Oriented Programming Principles

---

## 🧑‍💻 Author

Developed by Mayank Singh - Feel free to contribute or suggest improvements.

