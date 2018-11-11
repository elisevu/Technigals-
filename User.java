public class User
{
   private Balance bal;
   private String username, password, location;
   public User() {
      bal = new Balance(0,"weekly");
      username = "";
      password = "";
      location = "";
   }
   public User(Balance b, String u, String p, String l)
   {
      bal = b;
      username = u;
      password = p;
      location = l;
   }

   public String getBalance() 
   {
      return bal.balToString();
   }
   public String getLocation()
   {
      return location;
   }
   public Balance setBalance(Balance x)
   {
      Balance y = new Balance();
      y = bal;
      bal = x;
      return y;
   }
   public String setUsername(String user)
   {
      String old = "";
      old+=username;
      username=user;
      return old;
   }
   public String setPassword(String pass)
   {
      String old = "";
      old+=password;
      password=pass;
      return old;
   }
   public String getLocation(String loc)
   {
      String old = "";
      old+=location;
      location=loc;
      return old;
   }
   public String toString()
   {
      return "user: " + username + "/n" + "location: " + location + "/n" + bal.balToString(); 
   }

   public class Balance 
   {
      private int salary;
      private String frequency;
      public Balance()
      {
         salary = 0;
         frequency = "weekly";
      }	
      public Balance(int s, String f)
      {
         salary=s;
         frequency=f;
      }
   
      public int getSalary()
      {
         return salary;
      }
      public String getFrequency()
      {
         return frequency;
      }
      public String balToString()
      {
         return frequency + " : $" + salary;
      }
   }

}
