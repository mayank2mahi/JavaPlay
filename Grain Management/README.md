# Grain Management Program
## Description

Create a class Grain with below attributes:

**Class: Grain**

- `grainId` - int  
- `grainName` - String  
- `state` - String  
- `qtyInQuintal` - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with main method.

Implement two static methods - `countGrainByGivenName` and `getMinGrainFromMaharashtra` in Solution class.

---

### `countGrainByGivenName`:

Create a static method `countGrainByGivenName` in the Solution class. The method will return the count of Grain from array of Grain objects for the given Name. If no Grain with the given Name is present in the array of Grain objects, then the method should return 0.

---

### `getMinGrainFromMaharashtra`:

Create a static method `getMinGrainFromMaharashtra` in the Solution class.
This method will take an array of Grain objects and returns the Grain object having the minimum quantity(`qtyInQuintal`) from Maharashtra state. If found print the Grain in the main function, else return null if not found.

---

### Note:

All the searches should be case insensitive.

These methods should be called from the main method.

Write code in the main method to perform the following tasks:

1. Take the necessary input variable and call `countGrainByGivenName`.  
   For this method - The main method should print the returned value if it is greater than 0 else it should print `"No Grains with matching names are found"`.

2. Take the necessary input variable and call `getMinGrainFromMaharashtra`.  
   For this method - The main method should print the Grain object details as it is, if the returned value is not null, or it should print `"No Grains with matching names are found"`.

Also, write the code for accepting the inputs and printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the result.

---

### Sample Input Description:

1. The 1st input taken in the main section is the number of Grain objects to be added to the list of Grain objects.  
2. The next set of inputs is Id, Name, state and Qty(`qtyInQuintal`) for each Grain object taken one after the other and is repeated for a number of Grain objects given in the first line of input.  
3. The last line of inputs will be the arguments that need to be passed as parameters to the methods.

---

### Sample Input:
```text
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
Rice
MAHARASHTRA
200
114
Millet
TamilnNadu
400
rice
```

### Sample Output:
```text
2
113
RICE
MAHARASHTRA
200
```
---

### Note on using Scanner object:

Sometimes scanner does not read the new line character while invoking methods like `nextInt()`, `nextDouble()` etc.
Usually, this is not an issue, but this may be visible while calling `nextLine()` immediately after those methods.

Consider below input values:
```text
1001
Savings
```
Referring below code:
```java
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine();

→ Here we expect str to have value Savings. Instead it may be "".

If above issue is observed, then it is suggested to add one more explicit nextLine() after reading numeric value.
i.e; the above code becomes:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
sc.nextLine();
String str = sc.nextLine();
