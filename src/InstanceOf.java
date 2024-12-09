public class InstanceOf {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        if(dog instanceof Dog){
            System.out.println("Dog is an instance of Dog");
        }

        if(cat instanceof Cat){
            System.out.println("Cat is an instance of Cat");
        }
    }
}
