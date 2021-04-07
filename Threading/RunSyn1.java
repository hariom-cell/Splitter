  class Share1
     {
       static int x;
       static synchronized void show(String s,int a)
              {
                x=a;
               System.out.print("\n Starting(show) " + s + "   " + x);
               try
                   {
                     Thread.sleep(2000);
                   }catch(Exception e){}
             System.out.println(" Ending(show) " + s + "   " + x);
            }
      static  synchronized void show1(String s,int a)
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
              Share1 s;
              public CustomThread1(Share1 s,String str)
                  {
                       super(str); this.s=s;
                       start();
                  }
              public void run()
                 {
                   s.show(Thread.currentThread().getName(),10);
                   Share1.show(Thread.currentThread().getName(),10);
                }
        }
   class CustomThread2 extends Thread
        {
              Share1 s;
              public CustomThread2(Share1 s,String str)
                  {
                       super(str); this.s=s;
                       start();
                  }
              public void run()
                 {
                   s.show(Thread.currentThread().getName(),20);
                   Share1.show(Thread.currentThread().getName(),20);
                 }
        }
   class CustomThread3 extends Thread
        {
              Share1 s;
              public CustomThread3(Share1 s,String str)
                  {
                       super(str); this.s=s;
                       start();
                  }
              public void run()
                 {
                      s.show(Thread.currentThread().getName(),30);
                      Share1.show(Thread.currentThread().getName(),30);

                 }
        }


   class RunSyn1
         {
             public static void main(String args[])
                {
                   Share1 st=new Share1();
        CustomThread1 t1=new CustomThread1(st,"one");
        CustomThread2 t2=new CustomThread2(st,"two");
        CustomThread3 t3=new CustomThread3(st,"three");
               }
         }
