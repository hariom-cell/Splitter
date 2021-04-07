  class  LazyThread  implements Runnable
       {
            public void run()
                 {
                   System.out.println("m sleeping..." + Thread.currentThread().getName() );
                     try{ 
                                 Thread.sleep(5000);
                                 System.out.println(" Feeling fresh    :  " + Thread.currentThread().getName() );
                          }  catch(InterruptedException e)
                                   {
                                        System.out.println(" Some body has disturbed me ...ab nahi jayenge " +  Thread.currentThread().getName( ) );
                                        return;                
                                    }
                 System.out.println(" ok chalo ab college chalte hai......");
              }
       }
class DemoThGp
      {
        public static void main(String args[])
           {
              ThreadGroup tg=new ThreadGroup("My Group...");

              LazyThread ob=new LazyThread();
                                      //    Thread ( ThreadGroup ,  Runnable target , String  str)
              Thread t1=new Thread(tg   , ob ,  "rohan");
              Thread t2=new Thread(tg  ,  ob  ,  "milind");
              Thread t3=new Thread(tg  ,  ob  , "golu");
               t1.start(); t2.start(); t3.start();
               System.out.println(" no of  currently active threads are  "    + tg.activeCount() );

                tg.list();

                try {   Thread.sleep(3000); }catch(Exception e) {}
                    if ( tg.activeCount() > 0 )
                          {
                                System.out.println("Threads are taking too much time");
                                tg.interrupt(); 
                          }                              
           }
      }

