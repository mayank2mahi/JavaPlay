# 🏨 Resort Management - Java Program

This Java program is designed to manage resorts and perform the following operations:

1. **Find the average price of resorts** by category and rating.

---

## 📌 Problem Statement

Create a class `Resort` with the following **private attributes**:

- `resortId` - `int`
- `resortName` - `String`
- `category` - `String`
- `price` - `double`
- `rating` - `double`

Include the following in the `Resort` class:

- A **parameterized constructor** (in the order listed above).
- **Getters and setters** for all attributes.

---

## ✅ Requirements

Create a class `Solution` with the following:

### `main` method

- Read input using `Scanner`.
- Call the required static method.
- Display the result based on the method’s return value.

---

### 1️⃣ Method: `findAvgPriceByCategory(Resort[] arr, String category)`

- **Input:**

  ```
  `arr`: Array of `Resort` objects
  `category`: The category to search for (case-insensitive)
  ```
- Output:
  ```
  Returns the average `price` (as int) of all resorts from the input array:
  - Matching the given category (case-insensitive)
  - Having a rating greater than 4.0
  If no such resort is found, return 0.
  ```

#### Output Format:

- If a matching resort is found:
```
Average price of the <category> Resort: <average>
```
- Else:
```
There are no such available resort
```
---

## 🔡 Sample Input 1
```
1005
Samudra
3 star
3500.00
3.5
1001
O by Tamara
5 Star
7500.00
4
1007
Edens resort
3 Star
2500.00
4.7
1003
Tea Valley
3 Star
4600.00
4.3
3 Star
```


### ✅ Sample Output 1
```
Average price of the 3 Star Resort: 3550
```

---

## 🔡 Sample Input 2
```
1005
Coastal Breeze
4 Star
9500.00
3.9
1002
Sky High
4 Star
8700.00
3.8
1008
Sea View
4 Star
7200.00
3.5
1004
Green Hill
4 Star
8800.00
3.9
4 Star
```


### ✅ Sample Output 2
```
There are no such available resort
```


---

## 📝 Notes

- All **string comparisons** (like category) are **case-insensitive**.
- Only resorts with **rating > 4.0** are considered.
- The **average** must be returned as an **integer value**.
- Use an extra `nextLine()` after reading integers or doubles to clear the newline character from the buffer.

---

### 🔄 Example Fix for Scanner Input Issue

```java
Scanner sc = new Scanner(System.in);
int id = sc.nextInt();
sc.nextLine(); // Clear newline
String name = sc.nextLine();
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
