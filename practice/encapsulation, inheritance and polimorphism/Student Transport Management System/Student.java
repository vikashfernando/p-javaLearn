public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id,String name,int age){
        this.id=id;
        this.name=name;
        setAge(age);
    }

    public String getId(){
        return (this.id);
    }
    public String getName(){
        return (this.name);
    }
    public int getAge(){
        return(this.age);
    }

    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if ((age>10) && (age<25)){
            this.age=age;
        }
        else{
            System.out.println("invalid age pls enter correct age...");
        }
    }


}
