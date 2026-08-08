# Algorithm

## Category

- String
- Hash Table

## Complexity

| Metric | Value |
|:-------|:------|
| Time   | O(n)  |
| Space  | O(1)* |

> `n` — length of the Roman numeral.
>
> *The algorithm itself uses constant extra space. The lookup table contains only seven fixed Roman symbols, so its size does not depend on the input.

## Data

Two integer variables:

- **current** – value of the current Roman symbol.
- **result** – accumulated integer value.

## Core Idea

Process the Roman numeral from left to right.

During each iteration:

1. Read the current Roman symbol.
2. Compare its value with the next symbol (if one exists).
3. If the next value is larger, subtract the current value.
4. Otherwise, add the current value.

## Notes

- Each Roman symbol is processed exactly once.
- The algorithm naturally handles subtractive notation (`IV`, `IX`, `XL`, `XC`, `CD`, `CM`).
- Only a few integer variables are used during traversal.
- The solution runs in linear time with constant extra space.