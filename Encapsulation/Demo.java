class Human{
    private int age;
    private String name;

    public int getAge(){//getter
        return age;
    }
    public void setAge(int age){//setter
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Demo{
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(19);
        h1.setName("Erish");
        // h1.name = "erish";
        // System.out.println(h1.name);
        System.out.println(h1.getAge()+":"+ h1.getName());
        System.out.println(h1.getName());
    }
}