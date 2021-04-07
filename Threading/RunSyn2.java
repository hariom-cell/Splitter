   class Share3
      {
           int flag =0; int data=0;
         synchronized  public void submit()
              {
                flag=1; 
               try
                  {
                     Thread.sleep(1000);
                  }catch(Exception e){}
              data=1;
             System.out.println("Value submitted ");
            notify();
           }
      synchronized int withDraw()
             {
                  if ( flag ==0)
                     {
                         try
                             {
                                System.out.println(" Wait block");
                                wait();
                               }catch(Exception e){}
                      }
                   return(data);
             }
     }
       class Thread1 extends Thread
          {
                Share3 s;
                public Thread1(Share3 s, String str)
                  {
                     super(str); this.s=s;
                    start();
                  }
             public void run()
               {
                  System.out.println(s.withDraw() );
               }
         }

       class Thread2 extends Thread
          {
                Share3 s;
                public Thread2(Share3 s, String str)
                  {
                     super(str); this.s=s;
                    start();
                  }
             public void run()
               {
                  s.withDraw() ;
               }
         }
      class RunSyn2
           {
               public static void main(String args[])
                  {
                     Share3 st=new Share3();
                   Thread t2=new Thread2(st,"two");
                     Thread t1=new Thread1(st,"one");
                
                 }
         }
 