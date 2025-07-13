# 📰 Journalist Management System - Java Program

This Java program is designed to manage a list of journalists and perform two main operations:

1. **Calculate the average experience of journalists by region** (case-insensitive).
2. **Search for a journalist by ID**.

---

## 📌 Problem Statement

Create a class `Journalist` with the following attributes:

- `id` - `int`
- `name` - `String`
- `experience` - `int` (in years)
- `region` - `String`

Include the following in the `Journalist` class:

- A **parameterized constructor** (in the same order as listed above).
- **Getters and setters** for all attributes.

---

## ✅ Requirements

Create a class `Solution` with the following:

### `main` method
- Read input using `Scanner`.
- Call the required methods.
- Display the results as per the logic.

---

### 1️⃣ Method: `findAverageExperienceByRegion(Journalist[] arr, String region)`

- Input:
  - `arr`: Array of `Journalist` objects
  - `region`: A region name as a `String`
- Output:
  - Returns the **average experience** of journalists from the given region (case-insensitive).
  - If no journalists match, return `0`.

#### Output Format:

- If average > 0:
Average experience: <value>
- Else:
No Journalist found from the given region.


---

### 2️⃣ Method: `searchJournalistById(Journalist[] arr, int id)`

- Input:
- `arr`: Array of `Journalist` objects
- `id`: Journalist ID to search
- Output:
- Return the `Journalist` object if found; otherwise return `null`.

#### Output Format:

- If found:
```
id-<id>
name-<name>
experience-<experience>
region-<region>
```
- Else:
No Journalist found with the given id.


---

## 🔡 Sample Input 1
```
3
201
Ravi
10
South
202
Leena
6
North
203
Amit
8
South
South
202
```


### ✅ Sample Output 1
```
Average experience: 9.0
id-202
name-Leena
experience-6
region-North
```


---

## 🔡 Sample Input 2
```
3
201
Ravi
10
South
202
Leena
6
North
203
Amit
8
South
South
209
```


### ✅ Sample Output 2

```
Average experience: 9.0
No Journalist found with the given id.
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

