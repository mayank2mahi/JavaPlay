# 🌾 Grain Management Program - Java

This Java program is designed to manage grain records and perform operations such as:

1. **Count grains by name** (case-insensitive).
2. **Find the grain with the minimum quantity from Maharashtra**.

---

## 📌 Problem Statement

Create a class `Grain` with the following attributes:

- `grainId` - `int`
- `grainName` - `String`
- `state` - `String`
- `qtyInQuintal` - `int`

Include the following in the `Grain` class:

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

### 1️⃣ Method: `countGrainByGivenName(Grain[] arr, String name)`

- Input:
  - `arr`: Array of `Grain` objects
  - `name`: Name of the grain to search for
- Output:
  - Returns the count of grains matching the given name (case-insensitive)
  - If no match, return `0`

#### Output Format:

- If count > 0:
  ```
  count
  ```
- Else:
  ```
  No Grains with matching names are found.
  ```

---

### 2️⃣ Method: `getMinGrainFromMaharashtra(Grain[] arr)`

- Input:
  ```
  `arr`: Array of `Grain` objects
  ```
- Output:
  ```
  Returns the Grain object from Maharashtra with the minimum quantity (qtyInQuintal)
  If no such grain exists, return null
  ```

#### Output Format:

- If result is not null:
  ```
  <grainId>
  <grainName>
  <state>
  <qtyInQuintal>
  ```
- Else:
  ```
  No Grains with matching names are found
  ```


---

## 🔡 Sample Input 1
```
4
111
Rice
TamilNadu
500
112
WHEAT
Maharashtra
300
113
RICE
MAHARASHTRA
200
114
Millet
TamilnNadu
400
Rice
```


### ✅ Sample Output 1
```
2
113
RICE
MAHARASHTRA
200
```

---

## 📝 Notes

- All string comparisons (region, etc.) should be **case-insensitive**.
- Avoid any extra formatting or additional output text.
- You may need to handle the `Scanner` newline issue. If you use `nextInt()` or `nextDouble()`, add an extra `sc.nextLine()` before calling `nextLine()` to avoid input skipping.

---

## 💡 Technologies Used

- Java 8+
- OOP (Object-Oriented Programming)
- Standard Input/Output

---

## 👨‍💻 Author

Developed by Mayank Singh - Contributions and suggestions are welcome!
