# Algorithm

## Category

- String
- Array

## Complexity

| Metric | Value    |
|:-------|:---------|
| Time   | O(n × m) |
| Space  | O(1)     |

> `n` — number of strings.
>
> `m` — length of the first string in the worst case.

## Data

Two loop indices and one character variable:

- **i** – current character position.
- **j** – current string index.
- **current** – character from the first string at position `i`.

## Core Idea

Use the first string as the reference prefix.

Process its characters from left to right.

For each character position:

1. Read the character from the first string.
2. Compare it with the character at the same position in every other string.
3. If a string ends at this position, return the prefix found so far.
4. If any character differs, return the prefix found so far.
5. If every character of the first string matches, return the entire first string.

## Notes

- No separate pass is required to find the shortest string.
- Comparison stops immediately when the first mismatch is found.
- A shorter string is detected during traversal.
- No additional data structures are required.
- The solution uses constant extra space.