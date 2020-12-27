package com.company;

public final class Animal {
    private final String _Species;
    private final int _Weight;
    private final int _Age;
    private final boolean _Vaccinated;
    private  final Passport _Passport;

    public Animal(String species, int weight, int age, boolean Vaccinated,Passport Passport) {
        _Species = species;
        _Weight = weight;
        _Age = age;
        _Vaccinated = Vaccinated;
        _Passport = new Passport();

        _Passport.PassportID = Passport.PassportID;
        _Passport.OwnerFIO = Passport.OwnerFIO;
        _Passport.AdditionalInfo = Passport.AdditionalInfo;
    }

    public String GetSpecies(){
        return this._Species;
    }

    public  int GetWeight(){
        return  this._Weight;
    }

    public  int GetAge(){
        return  this._Age;
    }

    public boolean IsVaccinated(){
        return  this._Vaccinated;
    }

    public  Passport GetPassport(){
        Passport pas = new Passport();
        pas.PassportID = _Passport.PassportID;
        pas.OwnerFIO = _Passport.OwnerFIO;
        pas.AdditionalInfo = _Passport.AdditionalInfo;
        return  pas;
    }
}
