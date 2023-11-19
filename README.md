# Live Coding Practice

This project is a collection of Java classes and tests created to practice and understand different structures and concepts in Java. The structures covered in this project include linked lists, arraylists, trees, stacks, queues, deques, hashsets, and hashmaps. 

Understanding these data structures is fundamental to becoming a proficient Java programmer, as they form the basis for more complex programming tasks. Each data structure has its own strengths and weaknesses in terms of time complexity, space complexity, and use cases, which are briefly explained below:

- *Linked List*: A linear data structure where each element points to the next. It has a time complexity of O(n) for access and search, and O(1) for insertion and deletion. It's useful when you need constant-time insertions/deletions and don't know the size of the list ahead of time.

- *ArrayList*: A resizable array, which can be found in the java.util package. It has a time complexity of O(1) for access, and O(n) for search, insertion, and deletion. It's best used when you need fast access to elements and the size of the list may change.

- *Tree*: A hierarchical data structure with a root value and subtrees of children, represented as a set of linked nodes. Time and space complexity can vary depending on the type of tree (binary, AVL, etc.), but generally, access, search, insertion, and deletion are O(log n). Trees are used in many areas, including operating systems, graphics, database systems, and computer networking.

- *Stack*: A linear data structure that follows the LIFO (Last In First Out) principle. It has a time complexity of O(1) for access, insertion, and deletion, and O(n) for search. Stacks are used in scenarios like backtracking, parsing, and function call implementation.

- *Queue*: A linear data structure that follows the FIFO (First In First Out) principle. It has a time complexity of O(1) for insertion and deletion, and O(n) for access and search. Queues are used in scenarios like CPU scheduling, disk scheduling, and data buffering.

- *Deque (Double Ended Queue)*: A queue allowing insertions and deletions from both ends. It has a time complexity of O(1) for insertion and deletion at both ends, and O(n) for access and search. Deques are used in scenarios like implementing both stacks and queues, and in problems involving list, array, or string traversal.

- *HashSet*: A collection that does not allow duplicate elements, and has no guarantee for element order. It has a time complexity of O(1) for basic operations like add, remove, contains, and size. HashSets are used when searching for items in a collection.

- *HashMap*: A map providing key-value storage. It does not maintain the order of elements. It has a time complexity of O(1) for basic operations like get and put. HashMaps are used for easy and fast data lookup.

![Linear_structures](https://github.com/timaelbaghdadi/liveCodingPractice/assets/63514409/098d78a3-5f8a-4f3d-865f-0bf4bd7a79e8)
![Non_linear_structures](https://github.com/timaelbaghdadi/liveCodingPractice/assets/63514409/c6a0f409-d3d4-4670-9b58-2171f6f55da6)

Some notes about the pictures: M means method, A means Advantages, D means disadvantages, C means class, I mean Interface

## Project Structure

The project is structured into two main parts: the classes and the tests. 

### Classes

- `AlternateTree.java`
- `AlternatingCharacters.java`
- `Anagram.java`
- `BalancedArray.java`
- `Cache.java`
- `FirstStringNonRepeated.java`
- `IntersectedValues.java`
- `LongestSubstring.java`
- `Main.java`
- `Node.java`
- `NodeTree.java`
- `QuickSortAlgorithm.java`
- `SingleLinkedList.java`
- `SubArray.java`
- `countOccurences.java`
- `maxSubArray.java`

### Tests

- `AlternateTreeTest.java`
- `AlternatingCharactersTest.java`
- `AnagramTest.java`
- `BalancedArrayTest.java`
- `FirstStringNonRepeatedTest.java`
- `SubArrayTest.java`
- `countOccurencesTest.java`
- `maxSubArrayTest.java`
