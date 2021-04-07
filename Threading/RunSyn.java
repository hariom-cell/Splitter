  class Share
     {
        int x;
        synchronized void show(String s,int a)
              {
                x=a;
               System.out.print("\n Starting(show) " + s + "   " + x);
               try
                   {
                     Thread.sleep(2000);
                   }catch(Exception e){}
             System.out.println(" Ending(show) " + s + "   " + x);
            }
       void show1(String s,int a)
              {
                x=a;
               System.out.print(" Starting(show1) " + s + "   " + x);
               try
                   {
                     Thread.sleep(2000);
                   }catch(Exception e){}
             System.out.println(" Ending(show1) " + s + "   " + x);
            }
      }
   class CustomThread1 extends Thread
        {
              Share s;
              public CustomThread1(Share s,String str)
                  {
                       super(str); this.s=s;
                       start();
                  }
              public void run()
                 {
                   s.show(Thread.currentThread().getName(),10);
                   s.show1(Thread.currentThread().getName(),10);
                    
                
         }
        }
   class CustomThread2 extends Thread
        {
              Share s;
              public CustomThread2(Share s,String str)
                  {
                       super(str); this.s=s;
                       start();
                  }
              public void run()
                 {
                   s.show(Thread.currentThread().getName(),20);
                   s.show1(Thread.currentThread().getName(),20);
                 }
        }
   class CustomThread3 extends Thread
        {
              Share s;
              public CustomThread3(Share s,String str)
                  {
                       super(str); this.s=s;
                       start();
                  }
              public void run()
                 {
                      s.show(Thread.currentThread().getName(),30);
                      s.show1(Thread.currentThread().getName(),30);

                 }
        }


   class RunSyn
         {
             public static void main(String args[])
                {
                   Share st=new Share();
        CustomThread1 t1=new CustomThread1(st,"one");
        CustomThread2 t2=new CustomThread2(st,"two");
        CustomThread3 t3=new CustomThread3(st,"three");
               }
         }
