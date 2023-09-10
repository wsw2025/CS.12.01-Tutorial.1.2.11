# CS.12.01-Tutorial.1.2.11

This question involves reasoning about one-dimensional and two-dimensional arrays of integers. You will write three static methods, all of which are in a single enclosing class, named DiverseArray. The first method returns the sum of the values of a one-dimensional array; the second method returns an array that represents the sums of the rows of a two-dimensional array; and the third method analyzes row sums. 

a) Write a static method arraySum that calculates and returns the sum of the entries in a specified one-dimensional array. The following example shows an array arr1 and the value returned by a call to arraySum.

int[] arr1 = {1, 3, 2, 7, 3};

The value returned by arraySum(arr1) would be 16.

b) Write a static method rowSums that calculates the sums of each of the rows in a given two-dimensional array and returns these sums in a one-dimensional array. The method has one parameter, a two-dimensional array arr2D of int values. The array is in row-major order: arr2D[r][c] is the entry at row r and column c. The method returns a one-dimensional array with one entry for each row of arr2D such that each entry is the sum of the corresponding row in arr2D. As a reminder, each row of a two-dimensional array is a one-dimensional array. 

For example, if mat1 is the array represented by the following table, the call rowSums(mat1) returns the array {16, 32, 28, 20}.

<img width="734" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.11/assets/57818506/e62b2788-d9f8-4273-a826-fff6cb45ebe8">

c) A two-dimensional array is diverse if no two of its rows have entries that sum to the same value. In the following examples, the array mat1 is diverse because each row sum is different, but the array mat2 is not diverse because the first and last rows have the same sum. 

<img width="737" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.11/assets/57818506/707c9fe2-3c46-4a7a-80a4-e086b2ecab44">

<img width="732" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.11/assets/57818506/8b80bac3-017f-490c-afd8-834f5e1d73d3">

Write a static method isDiverse that determines whether or not a given two-dimensional array is diverse. The method has one parameter: a two-dimensional array arr2D of int values. The method should return true if all the row sums in the given array are unique; otherwise, it should return false. In the arrays shown above, the call isDiverse(mat1) returns true and the call isDiverse(mat2) returns false. 

