public class child extends Parent {
    @Override
    public void greet() {
        super.greet();
        System.out.println("good morning");
    }
    child(){
        System.out.println("child");
    }
}
