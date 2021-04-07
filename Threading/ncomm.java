class ncomm
     {
      public static void main(String args[]) throws Exception
          {
               Producer obj1=new Producer();
               Consumer   obj2=new Consumer(obj1);
               Consumer   obj3=new Consumer(obj1);

                Thread t1=new Thread(obj1);
                Thread t2=new Thread(obj2);
                Thread t3=new Thread(obj3);

             t3.start();  t2.start();  t1.start(); 
          }
     }
class Producer extends Thread
        {
            StringBuffer sb;     boolean   status=false;
            Producer()
             {
               sb=new StringBuffer();
             }
           public void run()
              {
                synchronized(sb)
                 {
                    for(int i=1;i<=10;i++)
                       {
                         try
                             {
                               sb.append(i+":");
                               System.out.println("appending");
                              Thread.sleep(1000);
                            }catch(Exception e){}
                       }
                  status=true;
                  sb.notifyAll();
              }
        }
   }
  class Consumer extends Thread
                 {
                     Producer prod;
                     Consumer(Producer prod)
                        {
                           this.prod=prod;
                        }
                    public void run()
                        {
              synchronized(prod.sb)
                 {     
                              try
                               {
                               System.out.println("checkig...");
                                if ( prod.status==false )
                                 {
                              try{ prod.sb.wait(); } catch(Exception e){}
                                  }
                               }catch(Exception e){}
                               System.out.println(" contents of sb = " + prod.sb);
                  }
                      }
          }
/*
  wait()
   causes a thread to wait until it is notified. 
   This mehtod can only be called from synchronized method
   when  wait () method executes it break the synchronized block so that object lock is removed
     
   Note  : when sleep() is called from the synchronized block at that time object is still under lock

   Generally sleep is used for making a thread to wait for some time
   where as wait() is used in connection to notify and notifyAll

   notifyAll()
          ... unblock the threads that called wait() on this object
          .. can only be called from synchronized block

   notify()
          .. unblocks one randomly selected thread among the threads that called wait on this object
        
*/






