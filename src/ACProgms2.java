
class Heart{
    float weight;
    int heartbeat;
    public Heart( float weight, int heartbeat){
        
        this.weight= weight;
        this.heartbeat=heartbeat;
    }
    public float getWeight(){
        return weight;
    }
    public int getHeartBeat(){
        return heartbeat;
    }
}

class Brain{
    float weight;
    String color;
    
    public Brain(float weight, String color){
        this.color= color;
        this.weight= weight;
    }
    public float getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
}

class Book{
    String title;
    int cost;
    
    public Book(String title, int cost){
        this.title=title;
        this.cost=cost;
    }
    public String getTitle(){
        
        return title;
    }
    public int getCost(){
        return cost;
    }
    
}

class Bike{
    
    String brand;
    int speed;
    
    public Bike(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }
        public String getBrand(){
            return brand;
        }
        public int getSpeed(){
            return speed;
        }
    }

class Student{
    
    Heart h = new Heart(300.5f,70);
    Brain b = new Brain (200.5f, "Grey");
    
    public void hasA(Book bo){
        System.out.println(bo.getTitle());
        System.out.println(bo.getCost());
    }
    public void hasA(Bike bi){
        System.out.println(bi.getBrand());
        System.out.println(bi.getSpeed());
    }
}


public class ACProgms2 {
public static void main(String[] args){
    Student s = new Student();
    Book bo = new Book("Java", 300);
    Bike bi = new Bike("Pulsar",100);
    
    System.out.println(s.h.getHeartBeat());
    System.out.println(s.h.getWeight());
    System.out.println(s.b.getWeight());
    System.out.println(s.b.getColor());
    s.hasA(bi);
    s.hasA(bo);
    s= null;
    
/*    System.out.println(s.h.getHeartBeat());
    System.out.println(s.h.getWeight());
    System.out.println(s.b.getWeight());
    System.out.println(s.b.getColor());
    s.hasA(bi);
    s.hasA(bo);
    
    
    System.out.println(s.h.getHeartBeat());
    System.out.println(s.h.getWeight());
    System.out.println(s.b.getWeight());
    System.out.println(s.b.getColor());

*/
   
    
    System.out.println("----------------------------------------");
    System.out.println(bo.getTitle());
    System.out.println(bo.getCost());
    System.out.println(bi.getBrand());
    System.out.println(bi.getSpeed());
}    
}
