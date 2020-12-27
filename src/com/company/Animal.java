package com.company;

public final class Animal {
    private final String _Species;
    private final int _Weight;
    private final int _Age;
    private final boolean _Vaccinated;
    private  final Passport _Passport;

    public Animal(String species, int weight, int age, boolean vaccinated,Passport passport) {
        _Species = species;
        _Weight = weight;
        _Age = age;
        _Vaccinated = vaccinated;
        _Passport = new Passport();

        _Passport.PassportID = passport.PassportID;
        _Passport.OwnerFIO = passport.OwnerFIO;
        _Passport.AdditionalInfo = passport.AdditionalInfo;
    }

    public String getSpecies(){
        return this._Species;
    }

    public  int getWeight(){
        return  this._Weight;
    }

    public  int getAge(){
        return  this._Age;
    }

    public boolean isVaccinated(){
        return  this._Vaccinated;
    }

    public  Passport getPassport(){
        Passport pas = new Passport();
        pas.PassportID = _Passport.PassportID;
        pas.OwnerFIO = _Passport.OwnerFIO;
        pas.AdditionalInfo = _Passport.AdditionalInfo;
        return  pas;
    }

    @Override
    protected Object clone() {
        Animal animal = new Animal(this._Species,this._Weight,this._Age,this._Vaccinated,this.getPassport());
        return animal;
    }

    @Override
    public int hashCode() {
        int val = 0;
        val += this._Species.length();
        val += this._Age;
        val += this._Weight;
        if(this._Vaccinated)
            val += 1;
        val += this._Passport.PassportID;
        val += this._Passport.OwnerFIO.length();
        val += this._Passport.AdditionalInfo.length();
        return val % 14 + this._Species.length();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return  false;
        if(this == obj)
            return  true;
        if(this.getClass() != obj.getClass())
            return false;

        Animal anotherAnimal = (Animal)obj;

        if (this._Species != anotherAnimal._Species)
            return  false;
        if(this._Age != anotherAnimal._Age)
            return  false;
        if(this._Weight != anotherAnimal._Weight)
            return  false;
        if(this._Vaccinated != anotherAnimal._Vaccinated)
            return  false;

        Passport firstPassport = this._Passport;
        Passport secondPassport = anotherAnimal._Passport;

        if(firstPassport.PassportID != secondPassport.PassportID)
            return  false;
        if(firstPassport.OwnerFIO != secondPassport.OwnerFIO)
            return  false;
        if(firstPassport.AdditionalInfo != secondPassport.AdditionalInfo)
            return  false;

        return  true;
    }

    @Override
    public String toString() {
        return "Animal: " + this._Species + " Weight: " + this._Weight + " Age: " + this._Age + " Vaccinated: " + this._Vaccinated + " Passport Data: PassportID: " + this._Passport.PassportID + " AnimalOwner: " + this._Passport.OwnerFIO + " AdditionalInfo: " + this._Passport.AdditionalInfo + " EndPasswordData";
    }
}
