# Thoughts

At first, I thought about processing Roman numerals in pairs.

Very quickly I realized that this approach would not work because the symbols overlap. For example, `VIII` cannot be split into independent pairs.

After that, I switched to processing the string one character at a time from left to right.

The next idea was to compare the current symbol with the next one.

Looking at examples such as `IV`, `IX`, `VI`, and `VIII`, I noticed a simple pattern:

- if the next value is larger, the current value should be subtracted;
- otherwise, it should be added.

At that point, the algorithm itself was essentially complete.

The remaining work was figuring out the implementation details.

I used a `HashMap<Character, Integer>` to convert Roman symbols into integers. For the last character, I reused the current value as the next one, which allowed me to avoid a special case at the end of the loop.

After getting the solution accepted, I compared it with the common community implementation.

The algorithm turned out to be exactly the same, but the implementation is usually written a little differently. Instead of reusing the current value for the last character, it simply checks whether the next character exists before comparing the values.

Finally, I looked at performance improvements.

Since there are only seven possible Roman symbols, replacing the `HashMap` with a `switch` removes the lookup overhead while keeping the algorithm exactly the same.

This became the optimized implementation.

### What I learned

- The hardest part was discovering the algorithm, not writing the code.
- Looking for patterns in a few examples was enough to derive the solution.
- The same algorithm can have multiple implementations that differ only in readability or performance.
- Small implementation optimizations do not necessarily change the algorithm itself.