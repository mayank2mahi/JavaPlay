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
