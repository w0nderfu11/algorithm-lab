# Algorithm

## Category

- Math

## Complexity

| Metric | Value |
|:-------|:------|
| Time   | O(d)  |
| Space  | O(1)  |

> `d` — number of digits.

## Data

Two integer variables:

- **number** – the remaining unreversed part.
- **reversedHalf** – the reversed second half of the number.

## Core Idea

Reverse only half of the digits instead of the entire number.

During each iteration:

1. Remove the last digit from the original number.
2. Append it to the reversed half.
3. Stop when both halves meet.
4. Compare the two halves, ignoring the middle digit if the number has an odd number of digits.

## Notes

- Each iteration processes exactly one digit.
- Only half of the digits are reversed.
- No extra memory is required.
- The optimization reduces the constant factor while keeping the same asymptotic complexity.