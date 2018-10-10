# Sorting-Algorithms
Sorting algorithms for practice
------------------------------------------------------------------------------------------------------------------------------------------
Algorithms to be implemented for study purposes.
A program written in Java to implement algorithms for study purposes and analysis.
Each algorithm implemented is discussed below along with a brief description.

------------------------------------------------------------------------------------------------------------------------------------------
**1) Binary Search**
Recursive algorithm used to locate a target value within a sorted sequence of n elements.
Compares the target value to the middle element of the array.

If the target value is lesser than the middle element, recursively search for the target value within the sorted sequence before the middle element.
If the target value is more than the middle element, recursively search for the target value within the sorted sequence after the current middle element.
If the target value equals to the middle element, then the key is found.

Run Time:
Worst Case: O(log n) 
Best Case: O(1) - occurs when the target value/key == middle element in the first iteration of the recursion

Space:
O(1)


**2) Bubble Sort**
Iterates through the sequence of n elements, comparing adjacent elements and swapping them according to the correct order (ascending or descending). A comparison where elements are "bubbled" to the top of the list depending on the order. Bubble sort is too slow and impractical for most problems, however can be practical if the input mostly in sorted order.
It uses 2 for loops to iterate the sequence of n elements, outer for loop iterates through the sequence of elements, while the inner for loop iterates to compare adjacent elements.

Bubble sort should not be used for large sequence of elements.

Run Time:
Worst Case: O(n^2)
Best Case: O(n) - sequence of elements is already sorted

Worst Case: O(n^2) - comparisons and swaps


**3) Merge Sort**
Merge sort uses a recursion through divide and conquer. This algorithm will be broken down into 3 parts:

 3.1) Divide
 If the sequence of elements is smaller than a specified number then sort it in a straight forward way.
 Divide the sequence of elements into 2 or more subsets.
 
 3.2) Conquer
 Recursively solve the subproblems from the subsets in 3.1)
 
 3.3) Combine
 Merge each solution to the subproblems and merge them into a solution to the original problem
 
 As Merge sort uses a divide and conquer approach the perforance of this algorithm is:
 Worst Case: O(n log n)
 Best Case: O(n log n)
 

**4) Quick Sort**
Quick Sort uses a divide and conquer approach and recursion.
Although Quick sort and merge sort uses the same approach, the manner in which it is implemented varies. 
  
  4.1) Divide
  Choose an element from the sequence called the pivot. In common practice the last element in the sequence is chosen as the pivot.
  Remove elements from sequence and divide into 3 sequences:
  Sequence 1: elements < pivot
  Sequence 2: elements == pivot
  Sequence 3: elements > pivot
  
  4.2) Conquer
  Recursively sort sequence 1 and sequence 3 from the divide method
 
  4.3) Combine
  Combine the elements into the main sequence by inserting elements of sequence 1 first, then sequence 2 then sequence 3


Worst Case: O(n^2)
Best Case: O(n log n)


**5) Selection Sort**
Divides the sequence of elements into 2 sub-sequences:
Sequence 1: sorted array
Sequence 2: unsorted array

Selection Sort has 2 for loops, the first for loop iterates through the sequence of elements and sets the current element as minimum, the second for loop iterates through the remainder of the sequence and finds for elements smaller than the current minimum. After the entire sub-sequence has been iterated in the second for loop, the minimum is then stored into sequence 1  that is the sorted sub-array.

Worst Case: O(n^2)
Best Case: O(n^2)










