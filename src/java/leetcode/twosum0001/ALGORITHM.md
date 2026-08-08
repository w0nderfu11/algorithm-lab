# Algorithm

## Category

- Array
- HashMap

## Complexity

| Metric | Value |
|:-------|:------|
| Time   | O(n)  |
| Space  | O(n)  |

## Data Structure

**HashMap<Integer, Integer>**

- **Key** – expected number.
- **Value** – index of the first number.

## Core Idea

Traverse the array only once.

For each element:

1. Check whether the current number is expected.
2. If yes, return both indices.
3. Otherwise, store the number that is required to complete the pair.

## Notes

- Average HashMap lookup: **O(1)**.
- Each element is processed exactly once.
- The solution is based on **lookup inversion**:
    - instead of storing visited values,
    - store the values expected in the future.