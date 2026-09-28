import java.util.Scanner;
public class Dog {
// Scanner object for user input
static Scanner sc = new Scanner(System.in);

    int id;
    String name;
    String weight;
    int age;

 Dog(int id, String name, String weight, int age) {
     this.id = id;
     this.name = name;
     this.weight = weight;
     this.age = age;

    }


   // Dog objects
    static Dog dog1 = new Dog(0,"","",0);
     static Dog dog2 = new Dog(0,"","",0);
     static Dog dog3 = new Dog(0,"","",0);
    static Dog dog4 = new Dog(0,"","",0);
     static Dog dog5 = new Dog(0,"","",0);
    static Dog dog6 = new Dog(0,"","",0);
    static Dog dog7 = new Dog(0,"","",0);
    static Dog dog8 = new Dog(0, "", "", 0);
    static Dog dog9 = new Dog(0,"","",0);
    static Dog dog10 = new Dog(0,"","",0);
    static Dog dog11 = new Dog(0,"","",0);
    static Dog dog12 = new Dog(0,"","",0);



// Dog attributes


// Method to display welcome message
public static void welcome() {  
System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system."); }

public static int selection() {
    System.out.println("Select a menu option:");
    System.out.println(" 1) Create a dog record");
    System.out.println(" 2) Display dog record");
    System.out.println(" 3) Update dog record");
    System.out.println(" 4) Exit Program");

    System.out.print("Enter selection here --> ");
    int selection = sc.nextInt();
    while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
        System.out.println("Invalid menu option");
        selection = sc.nextInt();
    }
    
    return selection;
}
//Method to create a dog record
public static void createDogRecord() {
    if (dog1.id != 0 && dog2.id != 0 && dog3.id != 0 && dog4.id != 0 && dog5.id != 0 && dog6.id != 0 && dog7.id != 0 && dog8.id != 0 && dog9.id != 0 && dog10.id != 0 && dog11.id != 0 && dog12.id != 0) {
        System.out.println("MPLS Dog Boarding is full.");
        return;
    }

    
    System.out.print("Enter dog ID #: ");
    int id = sc.nextInt();
     
    if (dog2.id  != 0 && dog2.id == id || dog3.id != 0 && dog3.id == id || dog4.id != 0 && dog4.id == id || dog5.id != 0 && dog5.id == id || dog6.id != 0 && dog6.id == id || dog7.id != 0 && dog7.id == id || dog8.id != 0 && dog8.id == id || dog9.id != 0 && dog9.id == id || dog10.id != 0 && dog10.id == id || dog11.id != 0 && dog11.id == id || dog12.id != 0 && dog12.id == id) {
        System.out.println("Dog ID already exists. Please enter a unique ID.");
        return;

        
    }
    sc.nextLine(); {

     System.out.print("Enter dog name: ");
    String name = sc.nextLine();

    System.out.print("Enter dog weight: ");
    String weight = sc.nextLine();

    System.out.print("Enter dog age: ");
    int age = sc.nextInt();

    Dog newDog = new Dog(id, name, weight, age);
// Assign the new dog to the first available slot
    if (dog1.id == 0) {
        dog1 = newDog;
    } else if (dog2.id == 0) {
        dog2 = newDog;
    } else if (dog3.id == 0) {
        dog3 = newDog;
    } else if (dog4.id == 0) {
        dog4 = newDog;
    } else if (dog5.id   == 0) {
        dog5 = newDog;
    } else if (dog6.id == 0) {
        dog6 = newDog;
    } else if (dog7.id == 0) {
        dog7 = newDog;
    } else if (dog8.id == 0) {
        dog8 = newDog;
    } else if (dog9.id == 0) {
        dog9 = newDog;
    } else if (dog10.id == 0) {
        dog10 = newDog;
    } else if (dog11.id == 0) {
        dog11 = newDog;
    } else if (dog12.id == 0) {
        dog12 = newDog;
    }

    System.out.println("Dog record created.");
}
}
// Method to display dog record
public static void displayDogRecord() {
     System.out.println("Dogs currently in the system:");
// Display all dogs in the system
  if (dog1.id != 0) {
       System.out.println("Dog ID #: " + dog1.id + ", for " + dog1.name);
    }
    if (dog2.id != 0) {
        System.out.println("Dog ID #: " + dog2.id + ", for " + dog2.name);
    }
    if (dog3.id != 0) {
        System.out.println("Dog ID #: " + dog3.id + ", for " + dog3.name);
    }
    if (dog4.id != 0) {
        System.out.println("Dog ID #: " + dog4.id + ", for " + dog4.name);
    }
    if (dog5.id != 0) {
        System.out.println("Dog ID #: " + dog5.id + ", for " + dog5.name);
    }
    if (dog6.id != 0) {
        System.out.println("Dog ID #: " + dog6.id + ", for " + dog6.name);
    }
    if (dog7.id != 0) {
        System.out.println("Dog ID #: " + dog7.id + ", for " + dog7.name);
    }
    if (dog8.id != 0) {
        System.out.println("Dog ID #: " + dog8.id + ", for " + dog8.name);
    }
    if (dog9.id != 0) {
        System.out.println("Dog ID #: " + dog9.id + ", for " + dog9.name);
    }
    if (dog10.id != 0) {
        System.out.println("Dog ID #: " + dog10.id + ", for " + dog10.name);
    }
    if (dog11.id != 0) {
        System.out.println("Dog ID #: " + dog11.id + ", for " + dog11.name);
    }
    if (dog12.id != 0) {
        System.out.println("Dog ID #: " + dog12.id + ", for " + dog12.name);
    }

    System.out.println("Enter the ID of the dog you want to display: ");
    int id = sc.nextInt();
// Check if the dog with the given ID exists and display its details
    if (dog1.id != 0 && dog1.id == id) {
        printDog(dog1);
    } else if (dog2.id != 0 && dog2.id == id) {
        printDog(dog2);
    } else if (dog3.id != 0 && dog3.id == id) {
        printDog(dog3);
    } else if (dog4.id != 0 && dog4.id == id) {
        printDog(dog4);
    } else if (dog5.id != 0 && dog5.id == id) {
        printDog(dog5);
    } else if (dog6.id != 0 && dog6.id == id) {
        printDog(dog6);
    } else if (dog7.id != 0 && dog7.id == id) {
        printDog(dog7);
    } else if (dog8.id != 0 && dog8.id == id) {
        printDog(dog8);
    } else if (dog9.id != 0 && dog9.id == id) {
        printDog(dog9);
    } else if (dog10.id != 0 && dog10.id == id) {
        printDog(dog10);
    } else if (dog11.id != 0 && dog11.id == id) {
        printDog(dog11);
    } else if (dog12.id != 0 && dog12.id == id) {
        printDog(dog12);
    } else {
        System.out.println("Dog ID not found.");
    }
}
// Method to print dog details
public static void printDog(Dog dog) {
    System.out.println("Dog ID #: " + dog.id);
    System.out.println("Dog Name: " + dog.name);
    System.out.println("Dog Weight: " + dog.weight);
    System.out.println("Dog Age: " + dog.age);
}
// Method to update dog record
    public static void updateDogRecord() {
    System.out.println("Enter the ID of the dog you want to update: ");
    int id = sc.nextInt();
// Check if the dog with the given ID exists and update its details
    Dog dogUpdate = null;
    if (dog1.id != 0 && dog1.id == id) {
        dogUpdate = dog1;
    } else if (dog2.id != 0 && dog2.id == id) {
        dogUpdate = dog2;
    } else if (dog3.id != 0 && dog3.id == id) {
        dogUpdate = dog3;
    } else if (dog4.id != 0 && dog4.id == id) {
        dogUpdate = dog4;
    } else if (dog5.id != 0 && dog5.id == id) {
        dogUpdate = dog5;
    } else if (dog6.id != 0 && dog6.id == id) {
        dogUpdate = dog6;
    } else if (dog7.id != 0 && dog7.id == id) {
        dogUpdate = dog7;
    } else if (dog8.id != 0 && dog8.id == id) {
        dogUpdate = dog8;
    } else if (dog9.id != 0 && dog9.id == id) {
        dogUpdate = dog9;
    } else if (dog10.id != 0 && dog10.id == id) {
        dogUpdate = dog10;
    } else if (dog11.id != 0 && dog11.id == id) {
        dogUpdate = dog11;
    } else if (dog12.id != 0 && dog12.id == id) {
        dogUpdate = dog12;
    }
    if (dogUpdate == null) {
        System.out.println("Dog ID not found.");
        return;
    }

    sc.nextLine(); // consume the newline character

    System.out.print("Enter new dog name: ");
    dogUpdate.name = sc.nextLine();

    System.out.print("Enter new dog weight: ");
    dogUpdate.weight = sc.nextLine();

    System.out.print("Enter new dog age: ");
    dogUpdate.age = sc.nextInt();

    System.out.println("Dog record updated.");

}
// Main method
public static void main(String[] args) {
    welcome();

    while (true) {
// Display menu and get user selection
    int selection = selection();
    if (selection == 1) {
        createDogRecord();
    } else if (selection == 2) {
        displayDogRecord();
    } else if (selection == 3) {
        updateDogRecord();
    } else if (selection == 4) {
        System.out.println("Exiting program...");
        System.exit(0); 

        
            
            
            

        }
    }
}

}
