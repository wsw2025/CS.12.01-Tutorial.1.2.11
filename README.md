# CS.12.01-Tutorial.1.2.11

This question involves reasoning about one-dimensional and two-dimensional arrays of integers. You will write three static methods, all of which are in a single enclosing class, named DiverseArray. The first method returns the sum of the values of a one-dimensional array; the second method returns an array that represents the sums of the rows of a two-dimensional array; and the third method analyzes row sums. 

a) Write a static method arraySum that calculates and returns the sum of the entries in a specified one-dimensional array. The following example shows an array arr1 and the value returned by a call to arraySum.

int[] arr1 = {1, 3, 2, 7, 3};

The value returned by arraySum(arr1) would be 16.

b) Write a static method rowSums that calculates the sums of each of the rows in a given two-dimensional array and returns these sums in a one-dimensional array. The method has one parameter, a two-dimensional array arr2D of int values. The array is in row-major order: arr2D[r][c] is the entry at row r and column c. The method returns a one-dimensional array with one entry for each row of arr2D such that each entry is the sum of the corresponding row in arr2D. As a reminder, each row of a two-dimensional array is a one-dimensional array. 

For example, if mat1 is the array represented by the following table, the call rowSums(mat1) returns the array {16, 32, 28, 20}.

<img width="730" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.11/assets/57818506/e7841a08-72e8-4c7e-9365-7858bffde04b">

c) A two-dimensional array is diverse if no two of its rows have entries that sum to the same value. In the following examples, the array mat1 is diverse because each row sum is different, but the array mat2 is not diverse because the first and last rows have the same sum. 

<img width="731" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.11/assets/57818506/961fe80a-8c4b-4d92-b22f-87e66f21d886">

<img width="728" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.11/assets/57818506/5c966332-d0f3-43f4-a84a-2518935469da">

Write a static method isDiverse that determines whether or not a given two-dimensional array is diverse. The method has one parameter: a two-dimensional array arr2D of int values. The method should return true if all the row sums in the given array are unique; otherwise, it should return false. In the arrays shown above, the call isDiverse(mat1) returns true and the call isDiverse(mat2) returns false. 

