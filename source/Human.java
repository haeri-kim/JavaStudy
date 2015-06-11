class Human extends Life{
	String name;
	Human(String n, int a) {
		super(2, a);
		System.out.println("human constructor");
		name = n;
		//age = a;
		//legs = 2;

	}

}