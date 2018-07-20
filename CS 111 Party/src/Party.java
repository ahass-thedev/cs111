public class Party {
	public static void main(String[] args) {
		int guests, slicesPerPerson, cansPerPerson,cansPerCase,slicesPerPie;
		double costPizza, costCans, costTotal;
		System.out.println("How many guests are attending?");
		guests = IO.readInt();
		System.out.println("How many slices per person");
		slicesPerPerson = IO.readInt();
		System.out.println("How many cans per person?");
		cansPerPerson = IO.readInt();
		System.out.println("What is the cost of a pizza pie?");
		costPizza = IO.readDouble();
		System.out.println("How many slices in a pie?");
		slicesPerPie = IO.readInt();
		System.out.println("What is the cost of a case of soda");
		costCans = IO.readDouble();
		System.out.println("How many cans in a case of soda");
		cansPerCase = IO.readInt();
		
		double totalPizzaSlices = guests * slicesPerPerson;
		double totalPies = (double) Math.ceil(totalPizzaSlices / slicesPerPie);
		double totalPizzaCost =  totalPies * costPizza;

		double totalCans = guests * cansPerPerson;
		double totalCases = (double) Math.ceil(totalCans / cansPerCase);
		double totalCanCost = totalCases * costCans;
		
		IO.outputDoubleAnswer(totalPizzaCost + totalCanCost);
		
	}

}
