    class LazyThread extends Thread
        {
          public void run()
             {
               System.out.println(" Some has started me !! ");
              System.out.println(" Don't disturb m , sleeping... ");
              try
                  {
                    Thread.sleep(8000);
                    System.out.println("  Feeling Fresh ...");
                  }catch(InterruptedException e)
                      {
                             System.out.println(" Some body  disturbed  me.");
                      }
                int   number=0;
                        int ctr=1;
                   while(  true )
                     {
                       System.out.println("  \n  some working....   " + number++   +    "         "   +  isInterrupted() );
                           if (  interrupted() )
                                 { 
                                  for( int i=0; i<1500;i++)
                                       {
                                       System.out.println(" ok w r gng to stop.   some body ask us to stop .." + ctr );
                                      }
                                       ctr++;  
                                          if ( ctr == 5 )
                                             { break ; } 
                                 }
                     }
                 System.out.println(" after    ..exiting from run...");
               }
         }
    class Interruptor
        {
            public static void main(String args[])
               {
                  System.out.println(" Starting a Lazy Thread");
                  LazyThread th=new LazyThread();
                  System.out.println(" giving lazy 5 second to complete ");
                  th.start();
                  try
                     {  
                        th.join(5000);   
                    }catch(Exception e) {}
                      th.interrupt();
                  while( th.isAlive())
                     {
                       System.out.println(" Lazy is taking too much time to complete...interrupting it");
                       try {   Thread.sleep(3000);  } catch(InterruptedException e )  {}
                       th.interrupt();
                     }
                  System.out.println("  Exiting from  main...");
               }
        }









