

class OS{
    String name;
    public OS(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}



class charger{
    String name;
    public charger(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Mobile{
    OS os= new OS("ANDRIOD");
    public void hasA(charger c){
        System.out.println(c.getName());
    }
}


public class ACProgms1 {
       public static void main(String[] args){
           Mobile m = new Mobile();
           charger c = new charger("Samsung");
           System.out.println(m.os.getName());
           m.hasA(c);
           
           
           
           
           /*
           System.out.println(m.os.getName());      TRY GIVING THIS---- GIVES AN ERROR.
           m.hasA(c);
           PrintStream println = System.out.println(os.getName());
           System.out.println(c.getName());   
           
           
           */
       } 
}

