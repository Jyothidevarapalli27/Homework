public class Main {
    public static void main(String[] args) {
//
        //object creating
        /*Parent p = new Parent();
        p.greet();
        child c = new child();
        child.greet();*/

        //Upcasting: using parent class method to hold child class object.
        // ex:
      // Parent p = new child();

       //down casting: using child class reference to hold the parent class object
       //for this we need explicit typecasting child type class.
       //ex:
      // child c  = (child) new Parent();

//Polymorphism Object
        //Animal a = new Dog();
        //Animal b = new Cat();

//AbstractObject
        /*Shape r = new Rectangle(5,6);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        Circle c = new Circle(4);
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());*/


        // interface
        Vehicle v = new Car();
        Vehicle v1 = new Bike();

        v.start();
        v.stop();
        v1.stop();
        v1.start();
    }
}