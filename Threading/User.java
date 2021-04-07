

    class AWork extends Thread
     {        public void run() 
                            {
                                 for(int i=0;i<5000;i++)
                                  {    System.out.println(" form aAWorkd    i =" + i  );  }
                            }
     }

     class  User
                 {  
                public static void main(String args[])
                  {
                      AWork   t1=new AWork(); 
                      t1.setDaemon( true );
                       t1.start(); 

                                 for(int i=0;i<50;i++)
                                  {    System.out.println(" in main  =" + i  );  }

                  }

             }






