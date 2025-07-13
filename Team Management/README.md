# Team Management System

## Problem Statement

Create a class `Team` with the below private attributes:
- `teamID` - int
- `teamName` - String
- `location` - String
- `totalRunsByTeam` - int
- `numberOfWicketsInTeam` - int

Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

Create a class `Solution` with the `main` method. Implement one static method - `teamWithHighestRuns` in the `Solution` class.

---

### teamWithHighestRuns

Create a static method `teamWithHighestRuns` in the `Solution` class.

This method will:
- Take an array of `Team` objects,
- Take a `String` input representing the location,
- Take an `int` input representing the minimum number of wickets.

It returns the maximum `totalRunsByTeam` for the team **only if**:
- The team's location (case-insensitive) matches the given string, and
- The `numberOfWicketsInTeam` is **greater than** the input integer.

If no such team exists, return 0.

---

### Write code to perform the following tasks:

1. Read input to create 4 `Team` objects.
2. Take the location (String) and minimum wickets (int) as user input.
3. Call the method `teamWithHighestRuns` using these values.
4. If the returned value is greater than 0, print the value.
5. Otherwise, print `"No any resort"`.

---

### Note:
- All string comparisons should be **case-insensitive**.
- Do not use any static text or formatting while printing the output.

---

## Sample Input 1
```text
1
RCB
Bangalore
250
8
2
MI
Mumbai
270
7
3
CSK
Chennai
300
9
4
KKR
Kolkata
180
10
Chennai
6
```
## Sample Output 1
300

## Sample Input 2
```text
1
RCB
Bangalore
250
5
2
MI
Mumbai
270
4
3
CSK
Chennai
300
3
4
KKR
Kolkata
180
2
Delhi
6
```
## Sample Output 2
No any resort

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
