package com.company;

public class Main {

    public static void main(String[] args) {
	 Passport passport = new Passport();
	 passport.PassportID = 1;
	 passport.OwnerFIO = "John Bakery";
	 passport.AdditionalInfo = "Some details";

	 Animal animal = new Animal("Dog",15,10,true,passport);
	 System.out.println(animal.toString());
	 System.out.println(animal.hashCode());
	 Animal animal2 = (Animal)animal.clone();
	 System.out.println(animal.equals(animal2));
    }
}
