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
List         	ArraysList Vector,LinkedList,
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
 
 ------------------------------------------------------------------------------------------------------------------------
 Networking in Java
 
 //stand alone machine---
                                           
//Console Application
//GUI Application
                 

 //Server=(?)----at your home(mother)---Controlling(Managing)other----provide right,make rules for communication
                                                                                         
 //client---> me,brother,papa(?)(client)-----follow rules,work accroding to given rights


//client program
//server program



//server----data send----client program---receive
                                 Non web application  
                              ------> Desktop tech-----> Project---GUI---(your Computer)
                                                                                  notepad,wordpad,paint,clock,calc---DesktopGUI

                               ----> networking Bases--> At your home,office,school,college,company
                                                                               --->multiple computer(Connection) with single 			                  application
                                                                               ---> desktop sharing(computer)--networking
Network Based(Local Area netwok)----MAN---

                                                 
Netwoking in Java

1.Stand Alone Application
 An application without client server Architecture is
 stand alone application
2.Distributed Application
  An application with client server Architecture is
  Distributed application
  types of application
  1.Socket programming
  2.RMI
  3.CORBA
  4.EJBs
  5.Web services

 Socket Programming
  
  Socket: is a channel or medium to transfer data from one machine to another 
  machine.

  In Socket programming we have to establish sockets on the basis of system 
  IP address and port numbers
cmd
IP: Internet Protocol
is an unique identity to each and every machine over the network
which is provides by network admin at the time of configuration
1. Standalone/loopback 127.0.0.1=Localhost
2. Given by User
3. Given By Server

                                 ipv4 vs ipv6
                                what class A ,ClassB.... address type
Port:
port number is an unique identity to each and every process being executed with 
in a single machine and it would be provided by local os
it is vertual not physical,standard protocals use predefined port
 ex: http port 80

java Internet modules
A list of some important modules in java Network/Internet programming.

Protocol	Common function	Port No	
HTTP		Web pages	80	httplib, urllib, xmlrpclib
NNTP		Usenet news	119	nntplib
FTP		File transfers	20	ftplib, urllib
SMTP		Sending email	25	smtplib
POP3		Fetching email	110	poplib
IMAP4		Fetching email	143	imaplib
Telnet		Command lines	23	telnetlib
Gopher		Document transfers	70	gopherlib, urllib


import java.io.*;  //java filehandling
import java.net.*;
The java.net package provides support for the two common network protocols 

TCP - TCP stands for Transmission Control Protocol, which allows for reliable communication between two applications.
TCP is typically used over the Internet Protocol, which is referred to as TCP/IP.

UDP - UDP stands for User Datagram Protocol, a connection-less protocol that 
      allows for packets of data to be transmitted between applications.

InetAddress class

Represent an IP address and provides methods to
get the IP of any hostname;
*it throws UnknownHostException
*it comes from java.net package

User Datagram Protocol (UDP)
It is connection-less protocols can keeps track
Fast because it lacks any extra features
Less-Reliable(cant keeps track)
Preferred for Uni-directional communication
Data is send and received inform of Packets

UDP provides 2 classes:
1. DatagramPacket
2. DatagramSocket

Both these classes comes from java.net package

DatagramSocket
It is used for sending and receiving of Packets
Constuctors:
DatagramSocket()
// Makes use of non-occupied port

DatagramPacket(int port)
// Makes use of specified port no.
send(<DatagramPacket>)
receive(<DatagramPacket>)

TCP(Transmission Control Protocol)  //networking---> OSI/TCP/IP layers---learn---Theory---->TCS

+TCP is Connection oriented protocols it keeps track
  make sure lost packets are re-sent
+Its slower  because of all added additional functionality
+ Preferred for Connection oriented comm.(Bi-Directional)
+ Data streams are used to send and receive data;
+ Reliable keeps all tracks

To work on TCP, Java provides 2 classes:
1. Socket
2. ServerSocket

Both these classes comes from java.net package

Socket
	Creates/Sends the Request
Constructors:
	Socket(InetAddress ia, int port)

	OutputStream getOutputStream()
	//Used for writing to Socket
	InputStream getInputStream()
	//Used for reading from Socket
	close()

ServerSocket
	Special Socket that is capable to accept request.

Constructors:
	ServerSocket(int port)
	ServerSocket(int port, int maxqueue)
Methods:
	Socket accept()
	//Makes the server wait, until it accepts request from client, on receiving client's request,
	it returns the client's Socket
	close() //Closes the ServerSocket
	
	<------------------------------------------------------------------------------------------------------------------------------->
	<------------------------------------------------------------------------------------------------------------------------------->
	
	Multithreading in Java

Process: process is flow of execution to perform task

Procedure: is set of instruction to represent a particular task

Single Process machanism
Sequential execution---> only one process to execute-->
*it takes more time
*reduce performance

Multi Process/MutiTasking  Machanism

MultiTasking is allow to load more than one task in main memory and it able to 
allow more than one process to execute

*Process-based Multitasking (Multiprocessing)
*it will reduce execution time(but in comparision to single process fast)

*Heavy weight Context Switching
 Switching from one process to another requires  some time for saving and 
 loading registers, memory maps, updating lists, etc.

*improve performance
*A process is heavyweight(separate memory area)
*High Cost


*Thread-based Multitasking (Multithreading)
Multithreading in java is a process of executing multiple threads simultaneously.

Thread:
* A thread is a lightweight subprocess, the smallest unit of processing.
* It is a separate path of execution
* It uses a shared memory area.
* Threads are independent, so it doesn't affect other threads if an 
  exception occurs in a single thread

Single Thread Model:
It Will allow one Thread  to execute application
*sequential execution
*more time
*more cost
*low performance


Multi-threading = Multi-tasking(Sharing of time) + Sharing of Data + Inter-Thread Communication
Multi-Threading
*Parallel Execution
*Threads share the same address space.
*A thread is lightweight.
*Low Cost
*light Weight Context Switching
.*less time
*improve performance



**main() thread 
*This thread effects the other ‘child’ threads
*It performs various shutdown actions
*It is created automatically when your program is started.
*By default every application have single Thread, the "main" thread

***Applet does not have its own Thread, it makes use of Browser Thread

Way to create threads in java application
1) Extending Thread class:
    a.Declare user define class which extends java.lang.Thread
    class Myclass extends Thread{

   }
  b. Override Thread class run() method in user defined class with the
     implementation
  c.In main Class in main() method Create object for used defined class
2) Implementing Runnable Interface
   a)Declare an user defined class implements java.lang.Runnable Interface
	class MyClass implements Runnable{

	}
   b) Provide implementation part in run() method
   c) In main class, in main() method() create a thread and access user defined
      thread class run() method()


Life Cycle of Thread
1.new/Born state:  ThreadClass tr=new ThreadClass("ChildThread");
2.ready/runnable State: tr.start()-----queue===>CPU
3.Running State:  //-----> CPU----time---working
4.Dead/Destroy state://over
5.Blocked state: //sleep
    sleep(),wait(),supend(), perform IO operation

    --->
       when sleep time over
       notify()/notifyAll() 
       resume()
       when IO operation Completed



Synchronization:
in java applicatin  if we have execute more than one thread on a single data
item then there may be a chance to to get data inconsistency
it may generate wrong data in java application
  Synchronization is machanism , it able to allow only one thread at a 
  time ,it will not allow more than one at a time.
  *It gives Security and  avoids data corruption
  *but take more time

  there are two ways to achieve Synchronization
  1)synchronized method
   public synchronized void Method()
	{
		// instructions
	}
  2)synchronized block
     synchronized{
		// instructions
	}


Inter thread Communication
 The Process of providing communication between more than one thread is called
 as Inter thread communication
 
To perfom Interthread Communication we have to use the following methods
1) wait()
2)notify()
3) notifyAll()

* Deamon Threads
These threads are running internally to provide services to some other thread
and it will be terminated along with the the thread which are taking services



<--------------------------------------------------------------------------------------------------------------------------->
Qes 1. What is Computer?
Ans: Computer is a digital electronic machine that can be programmed to carry out of sequences of arithmatic or logical operation
     automatically(animation).
     Computer is invented by the charles Babbage in 1965	
     Cumputer stand is a common operating machine purposely used for  Technological and Educational Reserach	 
  