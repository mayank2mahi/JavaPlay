# 🏍️ Bike Showroom Management - Java Program

This Java program is designed to manage bikes in a showroom and perform the following operations:

1. **Find the bike with the maximum price.**
2. **Search for a bike by its name** (case-insensitive).

---

## 📌 Problem Statement

Create a class `Bike` with the following **private attributes**:

- `id` - `int`
- `quantity` - `int`
- `name` - `String`
- `price` - `int`

Include the following in the `Bike` class:

- A **parameterized constructor** (in the order listed above).
- **Getters and setters** for all attributes.

---

## ✅ Requirements

Create a class `Solution` with the following:

### `main` method

- Read input using `Scanner`.
- Call the required static methods.
- Display the results as per specifications.

---

### 1️⃣ Method: `findMaxPriceOfBike(Bike[] arr)`

- Input:
  ```
  `arr`: Array of `Bike` objects
  ```
- Output:
  ```
  Returns the `Bike` object with the maximum `price`
  If no such object exists, return `null`
  ```

#### Output Format:

- If a bike is found:
```
id-<id>
quantity-<quantity>
name-<name>
price-<price>
```
- Else:
No Bike found with mentioned attribute


---

### 2️⃣ Method: `searchBikeByName(Bike[] arr, String name)`

- Input:
  ```
  `arr`: Array of `Bike` objects
  `name`: The bike name to search for (case-insensitive)
  ```
- Output:
  ```
  Returns the `Bike` object with the matching name
  If not found, return `null`
  ```

#### Output Format:

- If a bike is found:
```
id-<id>
quantity-<quantity>
name-<name>
price-<price>
```
- Else:
```
No Bike found with mentioned attribute
```


---

## 🔡 Sample Input 1
```
4
101
2
TVS Rider
110000
102
3
Yamaha FZ
150000
103
11
Royal Enfield
300000
104
20
Dominar
230000
Dominar
```


### ✅ Sample Output 1
```
id-103
quantity-11
name-Royal Enfield
price-300000
id-104
quantity-20
name-Dominar
price-230000
```

---

## 🔡 Sample Input 2
```
4
101
0
Pulsar
110000
102
0
Glamour
150000
103
0
Shine
100000
104
0
MT
200000
Dominar
```


### ✅ Sample Output 2
```
id-104
quantity-0
name-MT
price-200000
No Bike found with mentioned attribute
```


---

## 📝 Notes

- All **string comparisons** (e.g., bike name) should be **case-insensitive**.
- Avoid any additional formatting — output should match the exact structure shown above.
- If using `Scanner` and facing issues after reading integers (like skipping string input), add an extra `sc.nextLine()` after reading `int` or `double`.

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
