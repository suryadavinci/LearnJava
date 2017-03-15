
public class Duck {
	
	public void quack(){
		System.out.println("Quack Quack");
	}
	
	public void swim(){
		System.out.println("Swim Swim");
	}
	public void fly(){
		System.out.println("I can Fly");
	}

}

class rubberDuck extends Duck implements Flys{
	public void fly(){
		System.out.println("Nope. Can't fly.");
	}
}


interface Flys{
	public void fly();
}