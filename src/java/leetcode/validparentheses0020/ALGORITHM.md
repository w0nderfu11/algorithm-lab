# Algorithm

## Category

- String
- Stack

## Complexity

| Metric | Value |
|:-------|:------|
| Time   | O(n)  |
| Space  | O(n)  |

> `n` — length of the input string.

## Data Structure

**Deque<Character>**

Used as a stack to store expected closing brackets.

- `(` → store `)`
- `[` → store `]`
- `{` → store `}`

## Core Idea

Process the string from left to right.

For each character:

1. If it is an opening bracket, push the expected closing bracket onto the stack.
2. If it is a closing bracket and the stack is empty, return `false`.
3. Otherwise, pop the expected bracket from the stack.
4. If the popped bracket does not match the current character, return `false`.
5. After processing the entire string, return whether the stack is empty.

## Notes

- The stack follows the LIFO order, which naturally handles nested brackets.
- Storing expected closing brackets avoids converting opening brackets during comparison.
- `ArrayDeque` is used as the stack implementation.
- Short-circuit evaluation prevents `pop()` from being called when the stack is empty.
- Each character is processed exactly once.
- The worst-case stack size is O(n).