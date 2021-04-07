 /*
   shutdown hook is a thread 
   we can  registere this  thread with  java runtime environment 
    a java application can register a thread with jre using following method of  java.lang.Runtime  class

         public void addShutdownHook(Thread t); 

         same thread get executed when java application terminates
         To define working of shutdownhook define a class that implements runnable interface directly
         or indirectly.
         A shutdown hook is simply an initialized but unstarted thread. 
         When the virtual machine begins its shutdown sequence it will start all registered shutdown hooks 
        in some    unspecified order and let them run concurrently.
   */
  class Shutdown1 implements Runnable
      {   public void run()
              {
                  int ctr=1;
                   String  nm =  Thread.currentThread().getName();
                       while(ctr<=10)
                             {
              System.out.println(" performing cleanup  upon application termination  ....  " + ctr +  "   " + nm );
              ctr++;
               try { Thread.sleep(200); } catch(Exception e){}
                             }
              }
      }
   class DemoShut 
        {   public static void main(String args[])
                   {    Thread t1=new Thread(new Shutdown1()   );  t1.setName("first");
                         Thread t2=new Thread(new Shutdown1() );  t2.setName("second");
                           Runtime r  = Runtime.getRuntime( );
                         r.addShutdownHook( t1 );
                         r.addShutdownHook( t2 );
                   
                          Thread clerk1=new Thread(new Dispatch() );   clerk1.setName("varun");  clerk1.start();
                          Thread clerk2=new Thread(new Dispatch() );   clerk2.setName("Mohan");  clerk2.start();
                          int ctr  =1;
                          while(ctr<15)
                                  {
                                       System.out.println(" Hey guys keeps on working main working...."  + ctr );
                                       ctr++;
                                       try { Thread.sleep(200); } catch(Exception e){}
                                }
int rr=5/0;
//                                    System.exit(1);
                              System.out.println(" exiting main ....");
                              try { Thread.sleep(4000); } catch(Exception e){}
                   }
        }
      class Dispatch  implements Runnable
           {   public void run()  
                 {   String name = Thread.currentThread().getName();
                      for(int i=1;i<15;i++)
                           {
                                 System.out.println(  name +  "  m  performing Dispatch  " + i );
                            try {  Thread.sleep(200); } catch(Exception e) {}
                       }
                 }
           }     

















