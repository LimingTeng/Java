//package StaticVSInstance;
//
///**
// * Created by LynnTeng on 2019/3/15.
// */
//public class StaticVariables {
//    // not logical not popular
//    class Dog {
//        private static String name; //static variable
//        public Dog(String name) {
//            Dog.name = name;        //constructor that sets the static variable to the parameter value passed to the constructor
//        }
//        public void printName() {
//            System.out.println("name = " + name);
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Dog rex = new Dog("rex");       //create instance(rex)
//            Dog fluffy = new Dog("fluffy"); //create instance(fluffy)
//            rex.printName();    //prints "fluffy"
//            fluffy.printName(); //prints "fluffy"
//        }
//    }
//}
