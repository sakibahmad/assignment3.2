class example {
	int x;
	int y;
	String name;

	public static void main(String args[]) {
		example pnt = new example();
		System.out.println("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	}
}

/*
 * EXPLANATION AS we did not initialize variable so they are going to store null
 * values so object of class example that is pnt will be refering the value of
 * variable as null
 */
