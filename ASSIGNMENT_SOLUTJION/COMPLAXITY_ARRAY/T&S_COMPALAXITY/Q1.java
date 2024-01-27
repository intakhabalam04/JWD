/*
 * Let's analyze the time complexity of the given Java code. The outer loop runs from 1 to n, and for each iteration of the outer loop, the inner loop runs from 1 to i. This results in the following number of iterations:
 * 
 * 1 + 2 + 3 + ... + n
 * 
 * This is an arithmetic series, and its sum can be calculated using the formula for the sum of the first n natural numbers:
 * 
 * 
 * Sum = n * (n + 1) / 2
 * 
 * Therefore, the time complexity of the given code is O(n^2).
 * 
 * To improve the time complexity, we need to find a way to reduce the number of iterations. One approach is to observe that the inner loop is essentially counting the number of elements in a triangular pattern. The sum can be expressed as the sum of the first n natural numbers:
 * 
 * 
 * Sum = n * (n + 1) / 2
 * 
 * So, the code can be simplified to:
 * 
 * int sum = n * (n + 1) / 2;
 * 
 * This reduces the time complexity to O(1) as the number of iterations is constant regardless of the input size. This improvement is possible because the inner loop is essentially summing the values 1 to i for each iteration of the outer loop, and the total sum follows a predictable pattern.
 * 
 * 
 */