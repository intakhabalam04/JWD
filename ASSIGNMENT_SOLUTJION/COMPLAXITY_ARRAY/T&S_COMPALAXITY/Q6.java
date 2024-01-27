// To solve the recurrence relation \(T(n) = 2T\left(\frac{n}{2}\right) + k\) using the recurrence tree method, we'll build a tree to represent the recursive calls and analyze the total work done at each level.

// The recurrence relation suggests that each level of recursion has a work cost of \(k\), and there are \(\log_2 n\) levels.

// Let's build the recursion tree:

// ```
// Level 0: T(n)
//          |
// Level 1: T(n/2)    T(n/2)
//            |          |
// Level 2: T(n/4)    T(n/4)   T(n/4)   T(n/4)
//             .          .         .         .
//             .          .         .         .
//             .          .         .         .
// Level k: T(1)      T(1)     T(1)     T(1) ... (k times)
// ```

// At each level, there are \(2^k\) subproblems, and each subproblem has a size of \(n/2^k\). The total work done at each level is \(k\), as indicated by the recurrence relation.

// Now, let's sum up the work done at each level:

// \[
// \begin{align*}
// \text{Total work} &= k + k + \frac{k}{2} + \frac{k}{2^2} + \ldots + \frac{k}{2^{\log_2 n}} \\
// &= k\left(1 + \frac{1}{2} + \frac{1}{2^2} + \ldots + \frac{1}{2^{\log_2 n}}\right) \\
// &= k(2 - 1) \quad \text{(using the formula for the sum of a geometric series)} \\
// &= k
// \end{align*}
// \]

// Therefore, the total work done is \(k \cdot \log_2 n\), and the time complexity of the recurrence relation \(T(n) = 2T\left(\frac{n}{2}\right) + k\) is \(O(k \log n)\).