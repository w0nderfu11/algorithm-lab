# Thoughts

At first, I tried to find a pattern using characters and indexes.

Since some previous string problems could be solved by comparing positions, I wondered whether the position of an opening bracket could somehow determine where its closing bracket should appear.

After checking examples such as `()[]{}`, `(())()`, and `([]){}`, it became clear that indexes were only useful for traversing the string. The matching bracket can appear at different positions depending on the nesting.

I also considered counting opening and closing brackets.

The counts could tell whether the total number of brackets matched, but they could not validate their order. For example, `([)]` has the correct counts but is still invalid.

That was the point where I realized that the algorithm needed to remember what had already been encountered.

Instead of storing the opening brackets themselves, I decided to store the closing brackets that I expected to see later:

- `(` means I expect `)`;
- `[` means I expect `]`;
- `{` means I expect `}`.

The next question was how those expectations should be processed.

For a nested example like `({[]})`, several expected brackets are stored before any of them can be checked. My first thought was a queue, but tracing the example showed that the most recently added expectation has to be checked first.

That is LIFO behavior, which led me to a stack.

I already understood LIFO from the call stack and method execution, but this was my first time really using a stack as an algorithmic data structure.

In Java, I implemented it using `Deque<Character>` with `ArrayDeque`.

The first working version kept the operations explicit:

- if an opening bracket appears, push its expected closing bracket;
- use `continue` to move directly to the next iteration;
- if a closing bracket appears while the stack is empty, return `false`;
- compare the closing bracket with the top of the stack;
- if they match, remove the expected bracket;
- otherwise, return `false`;
- after processing the whole string, check whether the stack is empty.

One implementation detail that initially confused me was control flow inside the `switch`.

I learned that `continue` inside a `switch` nested in a `for` continues the enclosing loop, while `break` only exits the `switch`. This allowed the opening-bracket cases to push an expectation and immediately move to the next character.

After the first solution worked, I started simplifying it.

Initially, I used `getFirst()` to read the expected bracket and then `pop()` to remove it. I realized that `pop()` already returns the element it removes, so both operations could be replaced with a single comparison against `stack.pop()`.

The final simplification was combining two failure cases:

- the stack is empty;
- the popped expectation does not match the current bracket.

Using `||` works especially well here because of short-circuit evaluation. If the stack is empty, Java does not evaluate the second condition, so `pop()` is never called on an empty stack.

The final solution still uses the same algorithm as the first working version, but expresses the validation more directly.

### What I learned

- Matching nested structures requires remembering order, not just counting elements.
- A stack is useful when the most recently stored value must be processed first.
- Storing the expected closing bracket can make the comparison logic simpler.
- `Deque` with `ArrayDeque` can be used as a stack in Java.
- `continue` inside a `switch` can continue the enclosing loop.
- `pop()` both removes and returns the top element.
- Short-circuit evaluation with `||` can be important for correctness, not just for writing shorter conditions.
- A working algorithm can often be improved by simplifying how the same operations are expressed without changing its complexity.