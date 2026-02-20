[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/nggHHQzK)
# Experiment 54: Finally Block

## Problem Statement

Write a program to demonstrate the use of the `finally` block.
Perform a division operation inside a `try` block.
Regardless of whether an exception occurs or not, the `finally` block should execute and print "Finally block executed".

**Exception Handling:**
* If the division is valid, print "Result: [value]".
* If `ArithmeticException` occurs (division by zero), print "Error: [exception message]" (e.g., "Error: / by zero").

## Input Format

* Two integers $a$ and $b$.

## Output Format

* `Result: [value]` OR `Error: [message]`
* `Finally block executed`

### Example 1

**Input:**

```text
10 2
```

**Output:**

```text
Result: 5
Finally block executed
```

### Example 2

**Input:**

```text
5 0
```

**Output:**

```text
Error: / by zero
Finally block executed
```
