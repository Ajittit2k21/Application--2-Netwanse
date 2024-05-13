Datastructure in java

Collections  framework 

  Collection is an object , it able to represent a group of other objects

The Collection in Java is a framework that provides an architecture to store 
and manipulate the group of objects.

java Collection operations:
Search
Sort
insert
delete
Manipulate

The java.util package contains 
all the classes and interfaces for the Collection framework.

Java Collection framework is set of Interfaces and class
java.util.*

Interfaces   		Classes
List         			ArraysList Vector,LinkedList,
Set		     	HashSet,LinkedHasSet,TreeSet	
Queue			PriorityQueue,ArrayDeque

--------------------------------------------------------
Map                  		  sortedMap            


Cursors and Iterators:

1. Enumeration 
   it is applicable for only legacy collection to retirve elements in one by one
   fashion
   steps use
   a. Create Enumeration Object
      
   b. use methods
       hasMoreElements()
       nextElement()

   //used with read operation only

2.Iterator
Iterator interface provides the facility of iterating the elements in a 
forward direction
steps to use
a. Create Object
  
b. use methods
*public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
*public Object next()	It returns the element and moves the cursor pointer to the next element.
*public void remove()	It removes the last elements returned by the iterator. It is less used.

//* Iterator is able to allow both read operation and remove operation

3.ListIterator
 steps to use
 a.Create object
 b. use methods
    hasNext() next(), nextIndex() hasPrevious(), previous(),previousIndex()  
 It is able to read elements in both forward and backword direction
 it is allow operation like read,insert,replace while Iterating elements

List(Interface) 
list is a direct child of interface to collection interface
List is indexed
list is allow duplicate elements
list is follow insertion order
list is not follow sorting order
list is able to allow any no of null values
list is able to allow hetrogeneous elements


 Methods
add()
set()
get()
remove()
indexOf()
lastIndexOf()

   ArrayList
     It is direct implementation of list interface
     it is index based
     it allows duplicate elements
     it follows insertion order
     it will not follow sorting
     it allows hetrogeneous elements
     it allows any no fo null values
     its dynamic array in nature=Mutable
     initial capacity is 10
     it is not synchronized
     no method is synchronized
     follows parallel execution 
     reduce execution time
     it will improve app performance
     it is not thread safe

   Vector
     It is direct implementation of list interface
     it is index based
     it allows duplicate elements
     it follows insertion order
     it will not follow sorting
     it allows hetrogeneous elements
     it allows any no fo null values
     its dynamic array in nature
     initial capacity is 10
     it is  synchronized
     method are synchronized
     follows Sequential execution 
     it will increse execution  time
     it will reduce app performance
     it is thread safe

Methods: addElements() , firstElement() lastElements(),elementAt(),removeElement()
         removeElementAt()


** Stack
      Chlid class of Vector class. It able to arrange all the elements as per
      "Last in First Out(LIFO)".
Methods:
        push(),pop(),peek(),search()     
   


LinkedList
     It is direct implementation of list interface
     it is index based
      it follows insertion order
     it will not follow sorting
     it allows hetrogeneous elements
     it allows any no fo null values
     its internal data structure is dubly linked list.
     it is not  synchronized
     no method is synchronized
     follows parallel execution 
     reduce execution time
     it will improve app performance
     it is not thread safe

Methods:
     addFirst(),addLast(),getFirst(),getLast(),removeFirst(),removeLast()


Set 
   It is a direct child of interface to Collection interface
   it is not index based
   it will not allow duplicate elements
   it will not follow insertion order
        * but LinkedHashSet will follow insertion order
   it will not follow sorting order
   it will allow only one null value

  HashSet
   It is a direct child of interface Set
   all element is HashSet is arrange one the basis of its hashcode values
   it is not index based
   it will not allow duplicate elements
   it will not follow insertion order
        * but LinkedHashSet will follow insertion order
   initial capacity is 16 *** increase 75% of its initial capcacity
   it will not follow sorting order
   it will allow only one null value
     no method is synchronized
     follows parallel execution 
     reduce execution time
     it will improve app performance
     it is not thread safe
  
**    
  LinkedHashSet vs Hashset
 1. HashSet is not following insertion Order
    LinkedHashset is following insertion order
 2. Internal datastructure of hashset is hashtable
    Internal data structure of LinkedHash Set is LinkedList

  TreeSet
  It was not lagacy collection
  it has provided implementation for collection set,sortedSet,navigableSet
  it is not indexed based
  not duplicate values are allowed
  it is not follow insertion order
  **it follow sorting order
  it allows only homogeneous /same type elements.
  

***storedSet(java 1.2),NavigableSet(java6)


Queue(from java5)

  * it is direct Child of collection interface
  * it follow FIFO order
  * it allow duplicate elements 
  * it is not following insertion order
  ** it follows sorting order
  ** it will not allow null values
  * it will not allow hetrogeneous elements
  * it able to allow comparable object by default
  * if we want to add non comparable object then we have to use comparator.
  * it able to mange all elements prior to process.

Methods:
  offer()===>insert()
  peek()====>return head element  empty return null
  element()===> head element      empty raise exception
  poll()===> remove head element ====> empty return null
  remove()=== remove head element==== empty raise exception
Priority Queue:
  * not lagacy collection
  * it is direct Child of collection Queue
  * it follow FIFO order
  * it allow duplicate elements 
  * it is not following insertion order
  ** it follows sorting order(?)
  ** it will not allow null values
  ** it arrange all the elements prior to processing on basis of the priorities.  
  * it initial capacity is 11  //**
  * it not synchronized
  * no method is synchronized
  * it allow more than one thead to access data at a time
  *it is not thead safe
  *it follows Parallel execution
  * it will not allow hetrogeneous elements
  * it able to allow comparable object by default
  * if we want to add non comparable object then we have to use comparator.
  * it able to mange all elements prior to process.
  



Map:(java2)//python:dict
*it is not child of collection interaface
 *it is able to arrange all the elements in the form of key-value pairs
 *in map, both keys and values are objects
 *duplicates are not allowed at keys ,but values may be duplicated
 *only one null value is allowed at keys side but no null are allowed at 
  value side
 *Both keys and values are able to allow hetrogeous elements
 *insertion order is not followed
 * sorting order is not followed

 HashMap
 *it is implimentation of Map interaface
 *it is able to arrange all the elements in the form of key-value pairs
 *in map, both keys and values are objects
 *duplicates are not allowed at keyws ,but values may be duplicated
 *only one null value is allowed at keys side but no null are allowed at 
  value side
 *Both keys and values are able to allow hetrogeous elements
 *insertion order is not followed
 * sorting order is not followed
 * interal DataStructure is hashtable
 * initial capacity is 16
 * no synchronized ,not thread safe
 * parallel execution


Tree Map:
 *it is implimentation of Map,SortedMap,NavigableMap interaface
 *it is able to arrange all the elements in the form of key-value pairs
 *in map, both keys and values are objects
 *duplicates are not allowed at keyws ,but values may be duplicated
 *only one null value is allowed at keys side but no null are allowed at 
  value side
 *Both keys and values are able to allow hetrogeous elements
 *insertion order is not followed
 * sorting order is followed
 * interal DataStructure is "Red-Black-Tree"
 * initial capacity is 16
 * no synchronized ,not thread safe
 * parallel execution
