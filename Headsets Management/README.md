# 🎧 Headsets Management - Java Program

This Java program is designed to manage a list of headsets and perform two main operations:

1. **Calculate the total price of headsets from a given brand** (case-insensitive).
2. **Retrieve the available headset with the second minimum price**.

---

## 📌 Problem Statement

Create a class `HeadSets` with the following attributes:

- `headsetName` - `String`
- `brand` - `String`
- `price` - `int`
- `available` - `boolean`

Include the following in the `HeadSets` class:

- A **parameterized constructor** in the specified order.
- **Getters and setters** for all attributes.

Create a class `Codechef` with the following:

- A `main` method to:
  - Read input using `Scanner`
  - Invoke the required methods
  - Display the results

- Implement two static methods:

---

### 1️⃣ `findTotalPriceForGivenBrand(HeadSets[] arr, String brand)`

- Returns the **sum of prices** of all headsets where the brand matches the input string (case-insensitive).
- If no matching brand is found, return `0`.

#### Output:
- If total > 0:  
  `<total price>`
- Else:  
  `"No Headsets available with the given brand"`

---

### 2️⃣ `findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr)`

- Returns the `HeadSets` object that is **available** and has the **second minimum price** among all available headsets.
- If no such headset exists (less than 2 available), return `null`.

#### Output:
- If result is not null:  
```
<Headset Name>
<Price>
```

- Else:  
`"No Headsets available"`

---

## 🔡 Sample Input 1
```
3
Logitech Wired
Logitech
1500
true
Sony WH-1000XM4
Sony
2000
true
Boat Rockerz
Boat
1000
false
Logitech
```

### ✅ Output 1
```
1500
Logitech Wired
1500
```

---

## 🔡 Sample Input 2
```
2
HyperX Cloud
HyperX
2500
false
Razer Kraken
Razer
3000
false
Sony
```

### ✅ Output 2
```
No Headsets available with the given brand
No Headsets available
```

---

## 📝 Notes

- All string comparisons are **case-insensitive**.
- Use Boolean.parseBoolean() for reading boolean values.
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
