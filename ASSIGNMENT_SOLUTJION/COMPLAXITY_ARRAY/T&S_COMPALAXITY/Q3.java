// To solve the recurrence relation \( T(n) = T(n - 1) + c \) using the substitution method, let's make a guess and then prove it using mathematical induction.

// **Guess:**
// Let's assume that \( T(n) \) can be expressed as \( T(n) = a + nc \), where \( a \) is a constant.

// **Base Case (n = 1):**
// \[
// T(1) = a + 1 \cdot c = a + c
// \]
// Now, we need to choose \( a \) such that \( T(1) \) matches the given recurrence relation.

// Since \( T(1) = T(0) + c \), let's set \( a + c = T(0) + c \). This implies \( a = T(0) \).

// **Inductive Step:**
// Assume that \( T(k) = a + kc \) for some \( k \geq 1 \).

// Now, let's use this assumption to express \( T(k+1) \):
// \[
// \begin{align*}
// T(k+1) &= T(k) + c \\
// &= (a + kc) + c \\
// &= a + (k + 1)c
// \end{align*}
// \]

// This is in the form \( a + nc \) with \( n = k + 1 \).

// **Conclusion:**
// By induction, we've shown that if \( T(k) = a + kc \) for some \( k \geq 1 \), then \( T(k+1) = a + (k+1)c \).

// Therefore, our guess \( T(n) = a + nc \) is correct.

// **Solution:**
// The solution to the recurrence relation \( T(n) = T(n - 1) + c \) is \( T(n) = T(0) + nc \), where \( T(0) \) is the initial condition.