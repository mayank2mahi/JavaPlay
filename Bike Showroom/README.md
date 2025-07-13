# Bike Showroom Management

## Problem Statement

Create a class `Bike` with the below private attributes:
- `id` - int
- `quantity` - int
- `name` - String
- `price` - int

Write getters, setters, and parameterized constructors in the above-mentioned attribute sequence as required.

Create a class `Solution` with the `main` method. Implement two static methods - `findMaxPriceOfBike` and `searchBikeByName` in `Solution` class.

---

### findMaxPriceOfBike

Create a static method `findMaxPriceOfBike` in the `Solution` class.

This method will take an array of Bike objects and returns the bike Object with max price if found, else return 0 if not found.

---

### searchBikeByName

Create a static method `searchBikeByName` in the `Solution` class. This method will take an array of Bike objects and Name as input and returns the Bike object having the mentioned Name if found else return null if not found.

These methods should be called from the `main` method.

---

### Write code to perform the following tasks:

1. Take necessary input variable and call `findMaxPriceOfBike`. For this method - The main method should print the Bike Object with the max price as it is the returned value is greater than 0 else it should print `"No Bike found with mentioned attribute"`.

2. Take the necessary input variable and call `searchBikeByName`. For this method - The main method should print the Bike object details as it is if the returned value is not null, or it should print `"No Bike found with mentioned attribute"`

---

**Note**:
- All String comparison needs to be case in-sensitive.
- Do not use any static test or formatting for printing the result. Just invoke the method and print the result.

---

## Sample Input 1
```text
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

## Sample Output 1
```text
Id-103
quantity-11
name-Royal Enfield
price-300000
id-104
quantity-20
name-Dominar
price-230000
```

## Sample Input 2
```text
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

## Sample Output 2
```text
id-104
quantity-0
name-MT
price-200000
No Bike found with mentioned attribute

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
