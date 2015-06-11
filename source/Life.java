public class Life {
	int legs;
	int age;
	Life() {
		System.out.println("life constructor");
	}
	Life(int l, int a){
		legs = l;
		age = a;
		System.out.println("life constructor : " + l + ", " + a);

	}
  	public void breathing() {
  		System.out.println("breathing");
  	}

  	public void eating() {
  		System.out.println("eating");
  	}

  	public void sleeping(){
  		System.out.println("sleeping");
  	}
  }



