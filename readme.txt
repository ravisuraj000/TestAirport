in yor env variable
JAVA_HOME=<JAVA_11>  // this should be a jdk
PATH
   <java11location>\bin
   <maven>\bin

open a fresh command prompt
   java -version  // 11
   mvn -v     // 3.8

i have corrected all the support for java11  and pom.xml

SET SONAR_TOKEN=6379bcaa4b655956355255165fcf9e3800cbf00a


1.  Whether my code is good or not would require a code review :
    Static Code analysis you will do at your ned

	Sonar Lint is on the developer


2.

Requirement :
1.  Properties file to hold Resource Locations Configurations
2.  Externalized Property file
git clone https://nileshdevdas@bitbucket.org/nileshdevdas/tcs1.git

IController
	   You are using this controller in you WebService-->
		CUT--> WebService--

	class WebService {

	   WebService (IController controller){

	   }

	   public Response getAirports(){

		//l1
		 controller.doSomething(); // get mocked
		// ln
		//ln 1000..
	   }
	}


	IDAO

	IService

	IController

	1. CodeCoverage = 80 %
	2. Code Grade  = B / C ...
	3. Vulnerability = 0
	4. Sonalint Issue should be mininum
	6. 10 Test Case Should  have passed during the week end

Usage with SOLID -->
Applied Interface Driven Design -->
Exception Handling
Use of Enum
Use of Streams is mandatory
Use of Property (no hard Coding)
Document is required
You will mock only non CUT -> Dependencies
Site and Sonar Has to be Updated on every commit :
You Project has be on Git-> BitBucket->
Mocking is required in your test cases
We are platform agnostic and hence we don't c:/ c:\ /opt
Loggers ---> Application should audit logging



Time Independant Processing
   A -- > Send and forget
   A can send and wait seperately
   A can send and do the activt --> B invoke callback
Parallel  Processing
   At a time i want mulitple things to work :
	1mn->
    NFR --> Non Functional Requirements
		TPS (Transaction Per Second)
		SLA Service level Agreement Timeout
	cpu --> Sequentially 1000
	break my job in smaller part maping reducing --> breaking
	chunking --> assinging parellel programs

Event Driven
Async Programming





Callback ? Object --> With required  Functions for the  Execution thread 	to call

Thread ? What is expected --->
CPU and Core ->

1.  in intel
	1 CPU = N Cores  1 Core = 2 OS Dedicate thread
	But tht does not mean that i can run on 2 thread

2. Every thread is hungry and has starvation
		I has work to do ---> Cpu ---> Starvation

3. SHaring the food ---> Pool --> ---> Share --->
	Person write to a file --> busy ---> Cpu is sliced to given to
	some else ---> Network --> socket --> Cpu is sliced to some 	else


4.   n/w , io , wait ,  ....... other things compute

5.   Is there a thumb rule on how many threads i can create
	Unit of work --> That you wish to execute independantly

6.   a) Parellel work requires split Jobs --> Large JOb --> May take more time thank processing
	b) Then Synchronization --> Context Switching --> Noisiing
		to find out who is busy and not
	c) contention resource content , cpu . memory , io and what not

java.util.conccurent program practices ----> ThreadPool


What will the world be without pooling and with pooling
1. reusable :
2. management
3. better resource

Circuit Breaker ->
while true {
	Open A Thread(); // disaster
}
while(true){
	get A thread fomr pool  // disaster control
}

centrialize monitoring (Shut down the pool ) everything shuts down
controlling
Pool gives Exception --> Rejecttion handler
Named Resource --> Printing -10
Handling Iventor x thread

Exception in a file ---> The exctpion database tbale ->
It was using themain pool ---> the 2 million record -->
2 million ---> using a main connection ---> the main program thread
data control they control

Thread pool 10 resource --> In theis error writing facility


1. Callables --> Future Programming callback
	ForkJoin -->
   Using the the thread pools

java




I have 20 Cores --->
I have Stable Snaphot -> 30% ---> 60%Max burning

10 Thread ---> Outcomes -->
		Decreasong -> A OS Switching Debt

1. what is your target system
2. How complex is the work
3. what the dependent systems on you workload (Remote, io, ntwork)

jvm = 80 threads in per core * cores --> Good definition Max Java Threads supported by java

It is importatnt to first understand the whether you have enough
work load to give it to thread

1. Thread Pool
2. Thread has  submit and Execute
3. Rejection Handler control shudown and terminate and
	pooling behaviours
4.Runnable , Callable --> Future
5. Threads will have context Switching
6. Thread pool is the way to fair sharing cpu ot required resource
7. Synchronization, Atomicity and the the ThreadLocal (Scoped Variables)


Singleton:- one instance for
Per Jvm
Per ClassLoader
Per Application (ServletContext)
Per Thread  Thread --> have Object that it want lifectle of the thread
Per .....

Timer
And Thread


DeadlOck
ReadWrite Locks

each file is 10 mb->
you get 30 files a miniute
10* 30 = 300 min --> there is no lag and you should be able to pricess
all record in the given time
there a a down 4 hours now how to recover the 4 hrs by upscaling your
processing time

Audit Logging --> I want process large log fiel using parellel processing





1.  How to do split records on collection
2.  How to create a fixed pool thread
3.  use of timers
4.  Use of timers + threads + parllel processing to remove the lag


1. you willl keep on running -->
2. everytime you find files you read them
3. process and delete them
4. more files will be coming
5. you change you thread setting to process more file in a thread
	and more threads
6. how to measure
7. how do you monitor
8. more threads = more memory = Xmx and Xms needs to be relalgigned
9. Impact of the same on the GC



A timer which copies the file in events
A Processor whichis capable of processing records parellel
A Construct or a elastic behavoior to grow on configuration -->
	100 file --> Parellel (This is the Time contraint solution)

chances may get bad --> Space-> Memory >Cpu Issue

1. Backlog stop the consumer -0-> Create a backlog
2.  The back log cleared flexibily tuning number of thread
3. contraints Compute space and heap ....



	//cron based , fixed shcudules
	Load SImulator

	Timer timer = new Timer();
	timer.scheduleAtFixedRate(task ,  500 ,   5000)

	public class SomeJunkTask extends TimerTask {


   		public void run(){
			// read file split file do anything
			// read somu input file---> and make 10 copies and put it in event folder
			Files.copy(from ,to);
		}
	}


There is  a second Application which is like while true {

	is to read the total number files avail directory
	   decide a threadhold that how my files can be processed paraellely
	   1 file 2 lakh records
	what if  start processing manually linear
}

1 records = 410 ms   , 120
1 second =  2.5 * 300 (
100 rec per seconds

I need to also back lock (NFR)  2 hr of backlog ---> how many threads and how much time will be required
that mathematics  n in a sisue number of resource -->

Time --> Space contraint --> Distributed component


1. Program dataProducer
	Timer --> runs 5 seconds make copy 10 files


2. Data Consumer ==> Time Complexity
	Multithreading --> Space Complexity -->

	a) THe consumer program can be configurable --> to thread --> properyt 10 --> 30 -> throw Invalid Configuration
	b) This program shudt (Maint)
	large amoutnn backlog --> and how much

	Record takes 1kb ===> x number split and that many threads --?


NFr of x in y time using n resource and support z backlog

Elastic -->

Xms xxx  Xmx xxx --->
Thread pools












