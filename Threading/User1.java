      class Shared
          {
                int x;
              Integer y;
                public int square(int a)
                  {
                     x=a;
                         this.y=a;
                synchronized(this.y)
                    {
                     try {  Thread.sleep(1000); } catch(Exception e) {}
                  System.out.println(" value of x = " + x);
                  System.out.println(" value of y= " + y);
                  }
                        return( y*y );
                    
                  }
         }
      class MyThread extends Thread
           {
               Shared s; int value;
               public MyThread( Shared s,int value)
                   { this.s=s;  this.value=value;}
                public void run() 
                 {
                    System.out.println(   s.square(value)  );
                 }
           }     
      class User1
          {
                public static void main(String args[])
                  {
                       Shared s=new Shared();
                         MyThread t1=new MyThread(s,10);  t1.start();
                         MyThread t2=new MyThread(s,20);  t2.start();
                         MyThread t3=new MyThread(s,15);  t3.start();
                  }
         }