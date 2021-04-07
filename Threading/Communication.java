class Communication
     {
      public static void main(String args[]) throws Exception
          {
               Producer obj1=new Producer();
               Consumer   obj2=new Consumer(obj1);
                Thread t1=new Thread(obj1);
                Thread t2=new Thread(obj2);
              t1.start();  t2.start();
          }
    }
class Producer extends Thread
        {
            StringBuffer sb;
            boolean dataprodover=false;
            Producer()
             {
               sb=new StringBuffer();
             }
           public void run()
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
                   dataprodover=true;
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
                           try
                               {
                                //  while( prod.dataprodover==false )
                                 //       {  System.out.println("checking....checking checking cheking");
                                 //          Thread.sleep(100);
                                  //      }
                               }catch(Exception e){}
                               System.out.println(prod.sb);
                          }
                       }





