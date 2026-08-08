# Thoughts

The first step was realizing that the solution should be built around a loop.

After that, I started recalling the operations needed to process a number digit by digit: extracting the last digit with `% 10`, removing it with `/ 10`, and building a reversed number by multiplying the current result by 10.

That naturally led to the first solution:

- reverse the entire number;
- compare it with the original.

The solution was correct, but after getting it accepted, I wondered whether reversing every digit was actually necessary.

I noticed that after each iteration one part of the number became smaller while the reversed part became larger.

Once I realized that both parts would eventually meet in the middle, it became clear that there was no need to continue processing the remaining digits.

The next challenge was determining exactly when to stop and how to compare the two halves for both even and odd numbers.

After working through several examples by hand, I arrived at the optimized solution that reverses only half of the digits.

Although both solutions have the same Big-O complexity, the optimized version performs only about half as many iterations.

### What I learned

- Solving the problem first makes it much easier to look for optimizations.
- Sometimes the key optimization is recognizing that part of the work is unnecessary.
- Working through examples on paper can reveal patterns that are challenging to notice by looking only at the code.
- Two algorithms can have the same asymptotic complexity while one still performs noticeably less work in practice.