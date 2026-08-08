# Thoughts

At first, the brute-force solution came to mind.

It works, but it checks every pair of numbers, which immediately gives O(n²). Since the array has to be traversed anyway, I started thinking about how to avoid the second loop instead of trying to optimize it.

The next idea was to use a HashMap.

The challenging part wasn't deciding to use the HashMap—it was deciding what should actually be stored inside it.

After trying a few examples on paper, I realized that I only needed to know whether the missing number had already appeared.

That led to the first solution:

- store each visited number with its index;
- calculate the required value (`target - current`);
- check whether it already exists in the map.

This reduced the complexity to O(n).

After that, I looked at another common solution.

At first, it looked unusual because it stores something completely different. Instead of storing numbers that have already been seen, it stores the numbers expected to appear later.

Eventually I realized that both solutions have exactly the same complexity.

The real difference is the way the information is represented.

The second solution inverts the lookup logic, making the implementation slightly cleaner without changing the algorithm itself.

### What I learned

- A HashMap can remove the need for nested loops.
- Sometimes improving a solution is about changing how the data is represented, not about changing the complexity.
- Two solutions can have the same Big-O while one is still cleaner than the other.