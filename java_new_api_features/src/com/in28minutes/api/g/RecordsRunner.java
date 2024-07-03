package com.in28minutes.api.g;

public class RecordsRunner {
    //we can write in below 3 methods
    //record Person(String name,String email,String phoneNumber){}
//    record Person(String name,String email,String phoneNumber){
//        Person(String name,String email,String phoneNumber){
//            if(name==null)
//                throw new IllegalArgumentException("name is null");
//            this.name=name;
//            this.email=email;
//            this.phoneNumber=phoneNumber;
//        }
    record Person(String name,String email,String phoneNumber){//compact constructors
        Person{
            if(name==null)
                throw new IllegalArgumentException("name is null");
        }
        public String name(){
            System.out.println("Do Something");
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Prajith","sai2@gmail.com","9123456789");
        System.out.println(person);
        System.out.println(person.email);
        System.out.println(person.name);
        System.out.println(person.name());

        Person person1=new Person("Prajith","sai2@gmail.com","9123456789");
        Person person2=new Person("Sai","sai2@gmail.com","9123456789");
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));



    }

}
