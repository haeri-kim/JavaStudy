class Requirement {
	public static void main(String[] args) {
		//Animal animal = new Animal("mammal");
		//animal.breathing();
		//animal.eating();
		//animal.sleeping();
		

		Human human = new Human("haeri", 15);
		human.breathing();
		human.eating();
		human.sleeping();

		//System.out.println("Animal species  : " + animal.species );
		System.out.println("name : " + human.name);
		System.out.println("age : " + human.age);
		System.out.println("legs : " + human.legs);
		


	
	}
}