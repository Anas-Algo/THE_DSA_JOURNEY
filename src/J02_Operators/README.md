# Java Operators

> My self-learning notes for understanding **Operators in Java**.

---

# 1. First Understand What an Operator Is

An **operator** is a symbol that tells Java to perform some operation on one or more values.

For example:

```java
int a = 10;
int b = 5;

int sum = a + b;
```

Here:

```text
10 + 5
```

`+` is an **operator**.

It tells Java:

> "Add these two values."

So we can think:

```text
Operand   Operator   Operand
   ↓          ↓          ↓
  10          +          5
```

### Remember

> **Operator = performs an operation**

> **Operand = the value on which the operation is performed**

---

# 2. Why Do We Need Operators?

Almost every useful program needs to perform some kind of operation.

For example:

```text
Calculate marks       → +
Compare two numbers   → >
Check a condition     → &&
Increase a value      → ++
Assign a value        → =
Choose between values → ?:
```

So operators are one of the basic building blocks of programming.

---

# 3. Types of Operators in Java

Java operators can be divided into these major categories:

```text
Operators
│
├── Arithmetic
├── Assignment
├── Relational
├── Logical
├── Unary
├── Bitwise
├── Shift
├── Ternary
└── instanceof
```

Don't try to memorize everything at once.

First become comfortable with:

```text
Arithmetic
Assignment
Relational
Logical
Unary
Ternary
```

These are the ones you'll use constantly.

---

# 4. Arithmetic Operators

Arithmetic operators are used for **mathematical calculations**.

The main arithmetic operators are:

```text
+    Addition
-    Subtraction
*    Multiplication
/    Division
%    Modulus
```

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```text
13
7
30
3
1
```

---

# 5. Addition `+`

```java
int a = 10;
int b = 5;

int result = a + b;
```

Result:

```text
15
```

Simple:

```text
10 + 5 = 15
```

---

# 6. Subtraction `-`

```java
int a = 10;
int b = 5;

int result = a - b;
```

Result:

```text
5
```

---

# 7. Multiplication `*`

```java
int a = 10;
int b = 5;

int result = a * b;
```

Result:

```text
50
```

---

# 8. Division `/`

```java
int a = 10;
int b = 3;

int result = a / b;
```

The result is:

```text
3
```

### Why not 3.33?

Because both `a` and `b` are `int`.

So:

```java
10 / 3
```

performs **integer division**.

The decimal part is discarded.

---

## 8.1 Integer Division

```java
System.out.println(10 / 3);
```

Output:

```text
3
```

But:

```java
System.out.println(10.0 / 3);
```

Output will be approximately:

```text
3.3333333333333335
```

because `10.0` is a decimal value.

### Important Memory Point

> **int / int → int**

> **If you want a decimal result, at least one operand should be a floating-point value.**

---

# 9. Modulus `%`

The `%` operator gives the **remainder** after division.

Example:

```java
int result = 10 % 3;
```

Result:

```text
1
```

Because:

```text
10 ÷ 3

3 × 3 = 9
10 - 9 = 1
```

So:

```text
10 % 3 = 1
```

---

## Why Is `%` Important?

It is extremely useful in programming.

For example, checking whether a number is even:

```java
int num = 10;

if (num % 2 == 0) {
    System.out.println("Even");
}
```

Why?

Because:

```text
Even number % 2 = 0
Odd number % 2  = 1
```

So `%` is not just a mathematical operator.

It becomes very useful in **logic and problem solving**.

---

# 10. Arithmetic Operators — Memory Trick

Remember:

```text
+   → Add
-   → Subtract
*   → Multiply
/   → Divide
%   → Remainder
```

### Mental shortcut

> **+ - * / % = calculation operators**

---

# 11. Assignment Operator `=`

The assignment operator is:

```java
=
```

It assigns a value to a variable.

Example:

```java
int age = 20;
```

Read this as:

> "Store 20 in the variable age."

It does **not** mean "age is equal to 20" in the mathematical sense.

Think:

```text
age ← 20
```

---

# 12. Changing a Variable

```java
int age = 20;

age = 21;
```

Now:

```text
age = 21
```

The new value replaces the old value.

---

# 13. Compound Assignment Operators

Java provides shortcuts for common operations.

```text
+=
-=
*=
/=
%=
```

---

## `+=`

Instead of:

```java
int x = 10;

x = x + 5;
```

we can write:

```java
x += 5;
```

Both mean:

```text
x = x + 5
```

Result:

```text
15
```

---

## `-=`

```java
int x = 10;

x -= 3;
```

Equivalent to:

```java
x = x - 3;
```

Result:

```text
7
```

---

## `*=`

```java
int x = 10;

x *= 2;
```

Equivalent to:

```java
x = x * 2;
```

Result:

```text
20
```

---

## `/=`

```java
int x = 10;

x /= 2;
```

Equivalent to:

```java
x = x / 2;
```

Result:

```text
5
```

---

## `%=`

```java
int x = 10;

x %= 3;
```

Equivalent to:

```java
x = x % 3;
```

Result:

```text
1
```

---

# 14. Relational Operators

Relational operators are used to **compare values**.

They return a `boolean`:

```text
true
```

or:

```text
false
```

Operators:

```text
==    Equal to
!=    Not equal to
>     Greater than
<     Less than
>=    Greater than or equal to
<=    Less than or equal to
```

---

# 15. `==` Equal To

```java
int a = 10;
int b = 10;

System.out.println(a == b);
```

Output:

```text
true
```

Because both values are equal.

---

# 16. `!=` Not Equal To

```java
int a = 10;
int b = 5;

System.out.println(a != b);
```

Output:

```text
true
```

Because:

```text
10 ≠ 5
```

---

# 17. Greater Than `>`

```java
System.out.println(10 > 5);
```

Output:

```text
true
```

---

# 18. Less Than `<`

```java
System.out.println(5 < 10);
```

Output:

```text
true
```

---

# 19. Greater Than or Equal `>=`

```java
int age = 18;

System.out.println(age >= 18);
```

Output:

```text
true
```

Because 18 is equal to 18.

---

# 20. Less Than or Equal `<=`

```java
int marks = 40;

System.out.println(marks <= 40);
```

Output:

```text
true
```

---

# 21. Important Difference: `=` vs `==`

This is one of the most important things to remember.

```text
=    → Assignment
==   → Comparison
```

Example:

```java
int age = 20;
```

Means:

> Store 20 in age.

But:

```java
age == 20
```

Means:

> Is age equal to 20?

### Memory Trick

> **One `=` → put/store**

> **Two `==` → compare**

---

# 22. Logical Operators

Logical operators are used when we want to combine or modify conditions.

The main logical operators are:

```text
&&    AND
||    OR
!     NOT
```

These are extremely important when working with:

```java
if
else
while
for
```

and other conditions.

---

# 23. AND `&&`

`&&` means:

> **Both conditions must be true.**

Example:

```java
int age = 20;

System.out.println(age >= 18 && age <= 25);
```

Break it down:

```text
age >= 18 → true
age <= 25 → true

true && true → true
```

So the result is:

```text
true
```

### Truth Table

```text
true  && true  → true
true  && false → false
false && true  → false
false && false → false
```

### Memory Trick

> **AND = all conditions must be true**

---

# 24. OR `||`

`||` means:

> **At least one condition must be true.**

Example:

```java
int age = 17;

System.out.println(age == 17 || age == 18);
```

Break it down:

```text
age == 17 → true
age == 18 → false

true || false → true
```

### Truth Table

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

### Memory Trick

> **OR = one true is enough**

---

# 25. NOT `!`

`!` reverses a boolean value.

```java
boolean isJavaEasy = true;

System.out.println(!isJavaEasy);
```

Output:

```text
false
```

Because:

```text
!true → false
!false → true
```

### Memory Trick

> **! = reverse the boolean**

---

# 26. Logical Operators — Easy Memory

Remember:

```text
&& → AND → All must be true
|| → OR  → One true is enough
!  → NOT → Reverse
```

---

# 27. Unary Operators

Unary operators work on **one operand**.

Examples:

```text
+
-
++
--
!
```

The most important ones are:

```text
++
--
```

---

# 28. Increment `++`

`++` increases a value by `1`.

Example:

```java
int x = 10;

x++;
```

Now:

```text
x = 11
```

It is equivalent to:

```java
x = x + 1;
```

---

# 29. Decrement `--`

`--` decreases a value by `1`.

```java
int x = 10;

x--;
```

Now:

```text
x = 9
```

Equivalent to:

```java
x = x - 1;
```

---

# 30. Pre-Increment vs Post-Increment

This is where beginners often get confused.

There are two forms:

```java
++x;  // Pre-increment
x++;  // Post-increment
```

The important difference appears when the value is used in another expression.

---

## Post-Increment

```java
int x = 5;

int y = x++;
```

First:

```text
y gets 5
```

Then:

```text
x becomes 6
```

Final values:

```text
x = 6
y = 5
```

### Memory Trick

> **Post → use first, increase later**

---

## Pre-Increment

```java
int x = 5;

int y = ++x;
```

First:

```text
x becomes 6
```

Then:

```text
y gets 6
```

Final values:

```text
x = 6
y = 6
```

### Memory Trick

> **Pre → increase first, use later**

---

# 31. Same Idea With Decrement

Post-decrement:

```java
int x = 5;

int y = x--;
```

Result:

```text
x = 4
y = 5
```

Pre-decrement:

```java
int x = 5;

int y = --x;
```

Result:

```text
x = 4
y = 4
```

### Easy Rule

```text
++x → change first, use later
x++ → use first, change later

--x → change first, use later
x-- → use first, change later
```

---

# 32. Ternary Operator `?:`

The ternary operator is a short way of writing a simple `if-else`.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";
```

Because:

```text
age >= 18
```

is true, `result` becomes:

```text
Adult
```

---

# 33. Understanding Ternary Visually

```text
condition
    ↓
age >= 18
    │
 ┌──┴───┐
true   false
 │       │
Adult   Minor
```

Code:

```java
String result = age >= 18 ? "Adult" : "Minor";
```

### Memory Trick

Read it as:

> **"If condition is true, use this; otherwise use that."**

---

# 34. `if-else` vs Ternary

Normal `if-else`:

```java
int age = 20;
String result;

if (age >= 18) {
    result = "Adult";
} else {
    result = "Minor";
}
```

Ternary:

```java
String result = age >= 18 ? "Adult" : "Minor";
```

Ternary is useful for **simple decisions**.

Don't force complicated logic into a ternary just to make the code shorter.

---

# 35. `instanceof` Operator

`instanceof` is used to check whether an object belongs to a particular type.

Example:

```java
String name = "Anas";

System.out.println(name instanceof String);
```

Output:

```text
true
```

For now, remember:

> **`instanceof` → checks an object's type**

You'll understand this much better after learning **classes, objects, inheritance, and OOP**.

---

# 36. Bitwise Operators

Bitwise operators work at the level of **individual bits**.

Operators include:

```text
&     AND
|     OR
^     XOR
~     NOT
```

Example:

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

To understand these properly, I first need to understand **binary numbers**.

For now:

> **Bitwise operators → work directly with bits**

These become more useful in areas such as:

* Low-level programming
* Performance-sensitive code
* Flags
* Networking
* Cryptography
* Competitive programming

---

# 37. Shift Operators

Java also has shift operators:

```text
<<    Left shift
>>    Signed right shift
>>>   Unsigned right shift
```

Example:

```java
int x = 5;

System.out.println(x << 1);
```

At the binary level, bits are shifted.

For example:

```text
5 → 0101
```

Left shifting by one:

```text
0101 → 1010
```

which represents:

```text
10
```

Don't memorize shift operators before understanding **binary representation**.

---

# 38. Operator Precedence

What happens when an expression contains multiple operators?

Example:

```java
int result = 10 + 5 * 2;
```

Will Java calculate:

```text
(10 + 5) * 2 = 30
```

or:

```text
10 + (5 * 2) = 20
```

The answer is:

```text
20
```

because multiplication has higher precedence than addition.

So Java evaluates:

```text
5 * 2
```

first.

Then:

```text
10 + 10
```

---

# 39. Basic Precedence Order

A useful simplified order to remember:

```text
()
++
--
!
*
/
%
+
-
<
>
<=
>=
==
!=
&&
||
?:
=
```

Don't blindly memorize the entire list.

The most important early pattern is:

```text
()
 ↓
* / %
 ↓
+ -
 ↓
< > <= >=
 ↓
== !=
 ↓
&&
 ↓
||
 ↓
?:
 ↓
=
```

---

# 40. Parentheses Make Things Clear

If you're ever unsure, use parentheses.

Instead of:

```java
int result = 10 + 5 * 2;
```

write:

```java
int result = 10 + (5 * 2);
```

Or:

```java
int result = (10 + 5) * 2;
```

Parentheses make your intention obvious.

### Memory Rule

> **When in doubt, use parentheses.**

---

# 41. A Very Important Example

Consider:

```java
int a = 10;
int b = 5;
int c = 2;

int result = a + b * c;
```

Don't calculate from left to right blindly.

First:

```text
b * c
5 * 2 = 10
```

Then:

```text
a + 10
10 + 10 = 20
```

Therefore:

```text
result = 20
```

---

# 42. Operators With Strings

The `+` operator can also be used for **String concatenation**.

Example:

```java
String name = "Anas";
int age = 20;

System.out.println(name + age);
```

Output:

```text
Anas20
```

Java joins them together.

Another example:

```java
System.out.println("My age is " + age);
```

Output:

```text
My age is 20
```

### Important

Here `+` is not performing normal mathematical addition.

It is performing **String concatenation**.

---

# 43. A Common String + Number Example

```java
System.out.println(10 + 20 + " Java");
```

Result:

```text
30 Java
```

Why?

Java evaluates:

```text
10 + 20
```

first.

Then:

```text
30 + " Java"
```

becomes String concatenation.

But:

```java
System.out.println("Java " + 10 + 20);
```

produces:

```text
Java 1020
```

Because once Java starts concatenating with a String, the following `+` operations are treated as concatenation.

### Memory Trick

> **With `+`, pay attention to where the String appears.**

---

# 44. Complete Example

```java
public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational
        System.out.println(a > b);
        System.out.println(a == b);

        // Logical
        System.out.println(a > 5 && b < 5);

        // Assignment
        a += 5;
        System.out.println(a);

        // Increment
        a++;
        System.out.println(a);

        // Ternary
        String result = a > b ? "A is greater" : "B is greater";
        System.out.println(result);
    }
}
```

This small program uses many of the operators I've learned.

---

# 45. Operator Cheat Sheet

| Category      | Operators          | Purpose                 |    |                    |
| ------------- | ------------------ | ----------------------- | -- | ------------------ |
| Arithmetic    | `+ - * / %`        | Mathematical operations |    |                    |
| Assignment    | `= += -= *= /= %=` | Assign/update values    |    |                    |
| Relational    | `== != > < >= <=`  | Compare values          |    |                    |
| Logical       | `&&                |                         | !` | Combine conditions |
| Unary         | `++ -- + - !`      | Work with one operand   |    |                    |
| Ternary       | `?:`               | Short `if-else`         |    |                    |
| Bitwise       | `& \| ^ ~`         | Work with bits          |    |                    |
| Shift         | `<< >> >>>`        | Shift bits              |    |                    |
| Type checking | `instanceof`       | Check object type       |    |                    |

---

# 46. The Most Important Operators for Me Right Now

As a beginner, I should become comfortable with these first:

```text
Arithmetic:
+  -  *  /  %

Assignment:
=  +=  -=  *=  /=  %=

Comparison:
==  !=  >  <  >=  <=

Logical:
&&  ||  !

Unary:
++  --

Ternary:
?:
```

I don't need to master bitwise and shift operators immediately.

I'll understand them better when I reach the topics where they're actually useful.

---

# 47. Memory Map

I can remember operators by asking:

```text
"What am I trying to do?"
```

### Calculate something?

```text
+ - * / %
```

### Store/update something?

```text
= += -= *= /= %=
```

### Compare something?

```text
== != > < >= <=
```

### Combine conditions?

```text
&& || !
```

### Increase/decrease by 1?

```text
++ --
```

### Make a quick decision?

```text
?:
```

### Work with bits?

```text
& | ^ ~ << >> >>>
```

### Check object type?

```text
instanceof
```

---

# 48. My Mental Model

Whenever I see an expression like:

```java
int result = a + b * 2;
```

I should break it down:

```text
a
↓
operand

+
↓
operator

b
↓
operand

*
↓
operator

2
↓
operand
```

Then I should ask:

1. What operators are present?
2. Which operator has higher precedence?
3. What type are the operands?
4. What will the result's type be?
5. Is the result being assigned to a variable?

This way I'm **thinking like a programmer**, instead of just memorizing symbols.

---

# 49. Practice Questions

Don't look at the answers immediately.

## Question 1

What is the output?

```java
int a = 10;
int b = 3;

System.out.println(a / b);
System.out.println(a % b);
```

---

## Question 2

What is the output?

```java
int x = 5;

x += 10;

System.out.println(x);
```

---

## Question 3

What is the output?

```java
System.out.println(10 > 5);
System.out.println(10 == 5);
```

---

## Question 4

What is the output?

```java
int age = 20;

System.out.println(age >= 18 && age <= 25);
```

---

## Question 5

What is the final value of `x`?

```java
int x = 10;

x++;
x++;
x--;

System.out.println(x);
```

---

## Question 6

What are the final values?

```java
int x = 5;
int y = x++;

System.out.println(x);
System.out.println(y);
```

---

## Question 7

What are the final values?

```java
int x = 5;
int y = ++x;

System.out.println(x);
System.out.println(y);
```

---

## Question 8

What is the output?

```java
int a = 10;
int b = 20;

int result = a > b ? a : b;

System.out.println(result);
```

---

## Question 9

What is the output?

```java
System.out.println(10 + 20 + " Java");
System.out.println("Java " + 10 + 20);
```

---

# 50. Final Revision

If I have only 2 minutes to revise this topic, I'll remember:

```text
+  → addition
-  → subtraction
*  → multiplication
/  → division
%  → remainder

=  → assignment

== → equal?
!= → not equal?
>  → greater?
<  → smaller?
>= → greater/equal?
<= → smaller/equal?

&& → AND
|| → OR
!  → NOT

++ → +1
-- → -1

?: → short if-else

& | ^ ~ → bitwise
<< >> >>> → shifting

instanceof → type checking
```

And the most important conceptual distinction:

```text
=   → assign
==  → compare
```

---

# 51. What I Should Actually Remember

I don't need to memorize every operator by repeatedly reading this README.

I should remember **what problem each operator solves**.

```text
Need calculation?
        ↓
Arithmetic

Need to store/update?
        ↓
Assignment

Need comparison?
        ↓
Relational

Need multiple conditions?
        ↓
Logical

Need +1 / -1?
        ↓
Increment / Decrement

Need simple if-else?
        ↓
Ternary

Need bit-level operations?
        ↓
Bitwise / Shift

Need to check an object's type?
        ↓
instanceof
```

> **Operators are just tools.**
>
> **The real skill is knowing when to use which tool.**
