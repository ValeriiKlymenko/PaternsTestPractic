package org.example.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory =createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + "is unknown specialty.");
        }
    }
}
