 class  BackgroundMusic  implements  Runnable
        {
            public void run()
               {
                   while ( true )
                     {
                          System.out.println(" playing background music...."); 
                     }
               }
        }
       class   Reading  implements  Runnable
             {
                   private  int   rotation;
                   Reading( int  r )
                       {
                         rotation  =  r;
                       }
            public void run()
               {
               int ctr=1;
                     String   nm  =  Thread.currentThread().getName();
                   while ( ctr<=rotation )
                     {
                       for( int i=1; i<=300;i++)
                            {           
     System.out.println("  m reading some  text.$$$$$$$$$$$$$$$$$$$$$$$$......"  + ctr  +  "   "   +  nm);
                            }
                      try {  Thread.sleep(100);  }  catch ( InterruptedException e )  {}

                          ctr++;
                     }
               }
                 
            }

            class  TestDaemon
                {
                        public static void main( String args[] )
                            {      Thread    helper   = new Thread( new  BackgroundMusic() );   
                                         helper.setDaemon( true);
                                    helper.start();
                                               
                                 //  Thread ( Runnable   targ ,  String  thname );

                                    Thread  t1   = new Thread ( new  Reading(50)  ,   "Rohit");     //t1.start();
                                    Thread  t2   = new Thread ( new  Reading(20)  ,   "Vipin");  //t2.start();
                                System.out.println(" End of  Application...");
				Thread.sleep(15000);
                           }
                   }


















