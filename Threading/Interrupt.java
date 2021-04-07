  Interrupting Thread..... using    interrupt()   method...
           1     interrupt()   and  checking wheater a thread is interrupted or not using 
           2     interrrupted();
           3     isInterrupted();   methods.....
Interrupting Thread   ..   means  requesting a thread to terminate it's working ... 
    1. in  default manner a thread terminated when its run method returns or  finish his work
    2. in jdk1.0 there was a stop() method that another thread can call to terminate 
        how ever this method is now depricated means there is no longer a way to force an 
        thread to  terminate.
   However to terminate a thread  interrupt() method can be used to request termination of  thread.
   Note : every thread object implicitly consist of interrupted status value same value is of boolean type   
             ( by default it consist of  false value )
     public void interrupt()
     when we call interrupt() method then interrupted status  of thread object is set to true
    To check current interrupted status of a thread object  Thread class provides two methods
              1.   interrupted()
                      public static boolean interrupted();
                     Test wheather the current thread  has been interrupted. call of interrupted() has                                       side effect i.e. it  reset the   interrupted   status of the current thread to false.
       Note :so it means that second subsequent call of interrupted always return a  false value.
              2.  isInterrupted()
                      public boolean isInterrupted()
                   test wheather the current thread  has been interrupted. 
   unlike  interrupted() method this method does not change the interrupted  status of   the thread.

if we call interrupted() or isInterrupted() method on a thread which is blocked by sleep or  wait  then InterruptedException will occur   and  sleep() and wait() will over after the     same exception get fired.




 