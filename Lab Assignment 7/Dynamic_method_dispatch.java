class Phone {
    public void on() {
      System.out.println("Phone is turning on...");
    }
  }
  
  class SmartPhone extends Phone {
    public void on() {
      System.out.println("SmartPhone is turning on...");
    }
  }
  
  class CellularPhone extends Phone {
    public void on() {
      System.out.println("CellularPhone is turning on...");
    }
  }
  
  public class Dynamic_method_dispatch  {
    public static void main(String[] args) {
      Phone phone1 = new SmartPhone();
      Phone phone2 = new CellularPhone();
  
      phone1.on(); 
      phone2.on(); 
    }
  }
