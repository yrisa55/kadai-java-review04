package animal;

public class Human extends Animal implements Thinkable {
   private String interest;

   public Human(String name, int age, String interest){
       super(name, age);
       this.interest = interest;
   }

   @Override
   public void think() {
       System.out.println("私は" + interest + "について考えています。");
   }
}
