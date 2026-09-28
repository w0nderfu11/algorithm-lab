# Thoughts

At first, I understood that the comparison had to start from the beginning of every string.

The initial idea was to compare characters at the same index across all strings:

- compare the first character of every string;
- then compare the second character;
- continue until the first mismatch.

The main implementation problem was handling strings with different lengths.

My first approach was to find the shortest string before starting the character comparison.

That led to the first solution:

- make a separate pass through the array to find the minimum string length;
- use that length as the limit for character positions;
- compare each character with the character at the same position in every other string;
- return immediately when a mismatch is found.

The solution was correct and already had good complexity, but it required an additional pass only to determine the shortest length.

After that, I realized that finding the shortest string in advance was unnecessary.

Instead, while comparing characters, I could simply check whether the current string had already ended.

This removed the preliminary pass completely.

The first string could then be used as the reference. For every character in it, the algorithm checks the same position in all remaining strings.

If another string ends or contains a different character at that position, the prefix found so far is returned immediately.

If the entire first string is processed successfully, then the first string itself is the longest common prefix.

### What I learned

- A correct optimization does not always require changing the Big-O complexity.
- Sometimes a preliminary pass can be removed by handling its condition directly during the main traversal.
- Early returns make it possible to stop as soon as the answer is known.
- Using one input element as a reference can eliminate the need for additional data structures.
- The main algorithm can often handle edge cases such as shorter or empty strings naturally instead of separate special cases.