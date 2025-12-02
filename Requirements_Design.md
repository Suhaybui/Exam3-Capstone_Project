Exam 3 – Capstone Project: Requirements & Design Document
Goal:
The purpose of this phase is to analyze the problem and choose the most efficient data structure for storing and managing the system’s data. The design must support fast lookup, fast insertion, and smooth scalability as the dataset grows.
Chosen Design: HashMap + LinkedList Hybrid
This design combines the speed of a hash table with the ordered traversal of a linked list.
Why this structure?
	•	HashMap → O(1) insert, O(1) search
	•	LinkedList → preserves ordering and allows easy iteration
	•	Works efficiently for dynamic or growing datasets

DataManager
------------------------------------
map : HashMap<String, Node>
list : LinkedList<Node>
------------------------------------
insert(key, value)
get(key)
remove(key)
iterate()

Node
------------------------------------
key : String
value : Object
timestamp : long
------------------------------------
getKey()
getValue()
getTimestamp()
Big-O Complexity Justification
Insert
HashMap insert → O(1)
LinkedList add → O(1)
Total: O(1)
Search
HashMap lookup → O(1)
Remove
HashMap delete → O(1)
LinkedList unlink → O(1)
Total: O(1)
Traverse
LinkedList scan → O(n)
Why This Design Works
This hybrid provides:
	•High performance
	•Good scalability
	•Simple implementation
	•Ordered traversal when needed
This makes it ideal for capstone-level systems with frequent inserts/lookups.
