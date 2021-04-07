           public String getName();

         currentThread()
                is used to obtain reference of thread object for current thread
                public static Thread currentThread()
        setName( )
             is used to change name of existing thread object.... or used to assign
             name to thread object
            public void  setName(String name);
       getPriority ()  
             is used to obtain priority of   thread object
                  public int getPriority()
        setPriority()
                 is used to change existing priority of thread
                      public void setPriority( int prioooo);
                note : default prior. of every java thread object is 5        ( 1 .. 10 )
         sleep()
              is used to suspend execution of thread for specified interval of time
                   public  void  sleep ( long millis) throws InterruptedException

 ..    built in Thread class of java implements   Runnable interface....
              Runnable interface  contains only one method  i.e                  
                   public void  run();

        


















                          
       
                  
 

       class A
          {
             public static void main(String args[] )  throws InterruptedException
                {
                  System.out.println("hello");
                  Thread t  = Thread.currentThread();
                  System.out.println (  t.getName() );
                 System.out.println (  t.getPriority() );
                 t.sleep(2000);            
                System.out.println("exiting from main...");
               }
        }
