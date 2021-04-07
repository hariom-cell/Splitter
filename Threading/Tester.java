   class Tester
      {
        public static void main(String args[])
           {
         try
             {
                System.out.println("Registering shutdown hook...");
                Runtime r= Runtime.getRuntime();
                r.addShutdownHook(new Terminator());
                int a=Integer.parseInt( arr[0]);
                System.out.println(" Invoking call me ... ");
                Thread.sleep(5000);

             }
           }
      }