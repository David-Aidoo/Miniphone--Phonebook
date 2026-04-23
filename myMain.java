<<<<<<< HEAD
package ContactProject;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class myMain {
    public static void main(String[] args) {
        // So this project is like a miniphonebook that will keep track of all my
        // contacts and allow me to make any modification.
        ArrayList<BusinessContact> businessArray = new ArrayList<>();
        ArrayList<PersonalContact> personalArray = new ArrayList<>();
        ArrayList<Object> favourites = new ArrayList<>();

        // Declaration of variables that would be used.
        Integer choice;
        myMain mymain = new myMain();
        PersonalContact theNewPersonalContact;
        BusinessContact theNewBusinessContact;

        // Going to create some personal contacts that are going to be used later on in
        // the program.
        PersonalContact personalContact1 = new PersonalContact("Karianne", "friend from Senior High School",
                "0542721566");
        PersonalContact personalContact2 = new PersonalContact("Jayden", "Program mate", "0273912233");

        // Add these contacts to the personal Array
        personalArray.add(personalContact1);
        personalArray.add(personalContact2);

        // Going to create some business contacts that are going to be used later on in
        // the program.
        BusinessContact businessContact1 = new BusinessContact("MyMotherCare", "Baby Accessories", "0556789909",
                "MyMotherCare@gmail.com", "MyMotherCare");
        BusinessContact businessContact2 = new BusinessContact("Illyana Stitches", "Dress Making company", "0245676897",
                "IllyanaStiches@gmail.com", "Illyana Stitches");

        // Add these contacts to the business Array.
        businessArray.add(businessContact1);
        businessArray.add(businessContact2);

        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Welcome to miniphonebook.\nSelect any option to continue\n1. Create a new contact\n2. Search for a contact in your phonebook.\n3. Remove contact from phonebook.\n4. Add to favourites\n5. Make modification to a contact\n6. View all the contacts\n7.Exit "));

            switch (choice) {
                case 1: {

                    // The first case is used to create an object of either businessclass or the
                    // personalclass. This case also allows you to create
                    // contacts the number of times you would like to.
                    Integer typeOfContact;

                    while (true) {
                        typeOfContact = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to create a personal contact\nInput 2 to create a business contact"));

                        if (typeOfContact == 1) {
                            // Specify the number of contacts you would like to add to create a loop that
                            // would allow you to create the number of contacts you would like.
                            Integer times = Integer.parseInt(
                                    JOptionPane.showInputDialog("Input the number of contacts you would like to add."));
                            for (int i = 0; i < times; i++) {
                                JOptionPane.showMessageDialog(null, "Create a new personal contact");
                                theNewPersonalContact = mymain.toCreatePersonal();
                                personalArray.add(theNewPersonalContact);
                            }
                            break;
                        } else if (typeOfContact == 2) {
                            // Specify the number of contacts you would like to create.
                            Integer times = Integer.parseInt(JOptionPane
                                    .showInputDialog("Input the number of business contacts you would like to create"));
                            for (int i = 0; i < times; i++) {
                                JOptionPane.showMessageDialog(null, "Create a new business contact");
                                theNewBusinessContact = mymain.toCreateBusinessContact();
                                businessArray.add(theNewBusinessContact);
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Input");
                        }
                    }

                    break;
                }
                case 2: {
                    // The second case is used to search for a contact.
                    Integer num;
                    while (true) {
                        num = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to search for a personal contact\nInput 2 to search for a business contact"));
                        if ((num != 1) && num != 2) {
                            JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                        } else {
                            break;
                        }
                    }
                    // This is the switch statement for the search by name or the search by contact.
                    switch (num) {
                        case 1: { // Search for a personal contact
                            Integer numSearch;
                            while (true) {
                                numSearch = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Input 1 to search by name\nInput 2 to search by phoneNumber"));
                                if ((numSearch != 1) && numSearch != 2) {
                                    JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                                } else {
                                    break;
                                }
                            }

                            if (numSearch == 1) {
                                boolean results = true;
                                String nameOFcontact = JOptionPane
                                        .showInputDialog("Input the name of the contact to search for");
                                for (PersonalContact theName : personalArray) {
                                    if (theName.getname().equalsIgnoreCase(nameOFcontact)) {
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null,
                                                "The name: " + theName.getname() + "\nThe contact: "
                                                        + theName.getcontact() + "\nThe relationship: "
                                                        + theName.getrelationship());
                                    } else {
                                        continue;
                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }
                            } else if (numSearch == 2) {
                                boolean results = true;
                                String contactdigits = JOptionPane.showInputDialog(null,
                                        "Input the phoneNumber you would like to search for");
                                for (PersonalContact theContact : personalArray) {
                                    if (theContact.getcontact().equals(contactdigits)) {
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null,
                                                "The name: " + theContact.getname() + "\nThe relationship: "
                                                        + theContact.getrelationship() + "\nThe contact: "
                                                        + theContact.getcontact());
                                    } else {
                                        continue;
                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }
                            }

                            break;
                        }

                        case 2: {
                            // This is the case for searching for a business contact.
                            Integer numSearch;
                            while (true) {
                                numSearch = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Input 1 to search by name\nInput 2 to search by phoneNumber"));
                                if ((numSearch != 1) && numSearch != 2) {
                                    JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                                } else {
                                    break;
                                }
                            }
                            if (numSearch == 1) {
                                // Here, we are searching by name.
                                boolean results = true;
                                String nameOfContact = JOptionPane
                                        .showInputDialog("Input the name of the contact you would want to search for");
                                for (BusinessContact businessContact : businessArray) {
                                    if (businessContact.getname().equalsIgnoreCase(nameOfContact)) {
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null, "The name: " + businessContact.getname());
                                        JOptionPane.showMessageDialog(null,
                                                "The relationship: " + businessContact.getrelationship());
                                        JOptionPane.showMessageDialog(null,
                                                "The contact: " + businessContact.getcontact());
                                        JOptionPane.showMessageDialog(null,
                                                "The email : " + businessContact.getemail());
                                        JOptionPane.showMessageDialog(null,
                                                "The name of the company: " + businessContact.getcompany());
                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }

                            } else if (numSearch == 2) {
                                // Here, we search for a business contact with a phone number.
                                boolean results = true;
                                String thecontact = JOptionPane
                                        .showInputDialog("Input the contact you would like to search for.");
                                for (BusinessContact businessContact : businessArray) {
                                    if (businessContact.getcontact().equals(thecontact)) {
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null, "The name: " + businessContact.getname());
                                        JOptionPane.showMessageDialog(null,
                                                "The relationship: " + businessContact.getrelationship());
                                        JOptionPane.showMessageDialog(null,
                                                "The contact: " + businessContact.getcontact());
                                        JOptionPane.showMessageDialog(null,
                                                "The email : " + businessContact.getemail());
                                        JOptionPane.showMessageDialog(null,
                                                "The name of the company: " + businessContact.getcompany());

                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }
                            }

                            break;
                        }
                    } // The end of the switch for searching for a business or a personal contact.

                    break;// This is the break for case 2
                }
                case 3: {
                    // This case is used to remove a contact from the phonebook.
                    Integer remove;
                    while (true) {
                        remove = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to remove a personal contact\nInput 2 to remove a business contact"));
                        if (remove == 1) {
                            // This is used to remove a personal contact.
                            boolean results = true;
                            String thecontact = JOptionPane
                                    .showInputDialog("Input the name of the contact you would like to remove.");
                            for (PersonalContact personalContact : personalArray) {
                                if (personalContact.getname().equalsIgnoreCase(thecontact)) {
                                    results = false;
                                    personalArray.remove(personalContact);
                                    JOptionPane.showMessageDialog(null, "Successfully removed!");
                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist");
                            }
                            break;
                        } else if (remove == 2) {
                            // This is used to remove a business contact
                            boolean results = true;
                            String theContact = JOptionPane
                                    .showInputDialog("Input the name of the business contact you would like to remove");
                            for (BusinessContact businessContact : businessArray) {
                                if (businessContact.getname().equalsIgnoreCase(theContact)) {
                                    results = false;
                                    businessArray.remove(businessContact);
                                    JOptionPane.showMessageDialog(null, "Successfully removed!");

                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist.");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid input");
                        }
                    }
                    break;
                }

                case 4: {
                    // This is used to add a contact to favourites.
                    Integer num;
                    while (true) {
                        num = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to add a personal contact to favourites\nInput 2 to add a business contact to favourites"));
                        if (num == 1) {
                            boolean results = true;
                            String nameOFcontact = JOptionPane
                                    .showInputDialog(
                                            "Input the name of the contact you would like to add to favourites.");
                            for (PersonalContact personalContact : personalArray) {
                                if (personalContact.getname().equalsIgnoreCase(nameOFcontact)) {
                                    results = false;
                                    favourites.add(personalContact);
                                    JOptionPane.showMessageDialog(null, "Added to favourites");
                                } else {
                                    continue;
                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist.");
                            }
                            break;
                        } else if (num == 2) {
                            boolean results = true;
                            String nameOFcontact = JOptionPane
                                    .showInputDialog(
                                            "Input the name of the contact you would like to add to favourites.");
                            for (BusinessContact businessContact : businessArray) {
                                if (businessContact.getname().equalsIgnoreCase(nameOFcontact)) {
                                    results = false;
                                    favourites.add(businessContact);
                                    JOptionPane.showMessageDialog(null, "Added to favourites");
                                } else {
                                    continue;
                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist.");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid input, please try again!");
                        }
                    }
                    break;
                }
                case 5: {
                    // This case is used to make modifications to the some of the details of the
                    // contacts.
                    Integer option;
                    while (true) {
                        option = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Input one to make modifications to a personal contact.\nInput two to make modifications to a business contact"));

                        if (option == 1) {
                            // This is used to make modifications to a personal contact.
                            boolean results = true;
                            Integer modify;
                            String theContact = JOptionPane
                                    .showInputDialog("Input the name of the contact you would like to modify");
                            for (PersonalContact personalContact : personalArray) {
                                if (personalContact.getname().equalsIgnoreCase(theContact)) {
                                    results = false;
                                    while (true) {
                                        modify = Integer.parseInt(JOptionPane.showInputDialog(
                                                "Input 1 to modify the name\nInput 2 to modify the relationship\nInput 3 to modify the contact\nInput 4 to exit"));
                                        switch (modify) {
                                            case 1: {
                                                String nameofcontact = JOptionPane
                                                        .showInputDialog("Input the updated name for the contact");
                                                personalContact.setname(nameofcontact);
                                                break;
                                            }
                                            case 2: {
                                                String relationship = JOptionPane.showInputDialog(
                                                        "Input the updated relationship for this contact.");
                                                personalContact.setrelationship(relationship);
                                                break;
                                            }
                                            case 3: {
                                                while (true) {
                                                    try {
                                                        String newphone = JOptionPane.showInputDialog(
                                                                "Input the updated contact for this contact");
                                                        personalContact.setPhoneNumber(newphone);
                                                        break;
                                                    } catch (IllegalArgumentException e) {
                                                        JOptionPane.showMessageDialog(null, "Invalid contact");
                                                    }
                                                }
                                                break;
                                            }
                                            case 4: {
                                                break;
                                            }
                                            default:
                                                JOptionPane.showMessageDialog(null, "Invalid input");
                                                break;
                                        }
                                        if (modify == 4) {
                                            break;
                                        }
                                    }

                                } else {
                                    continue;
                                }

                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist");
                            }
                            break;
                        } else if (option == 2) {
                            // This is used to make modifications to a business contact.
                            boolean results = true;
                            Integer modify;
                            String theContact = JOptionPane
                                    .showInputDialog("Input the name of the contact you would like to modify");
                            for (BusinessContact businessContact : businessArray) {
                                if (businessContact.getname().equalsIgnoreCase(theContact)) {
                                    results = false;
                                    while (true) {
                                        modify = Integer.parseInt(JOptionPane.showInputDialog(
                                                "Input 1 to modify the name\nInput 2 to modify the relationship\nInput 3 to modify the contact\nInput 4 to modify the email\nInput 5 to modify the company name\nInput 6 to exit"));
                                        switch (modify) {
                                            case 1: {
                                                String nameofcontact = JOptionPane
                                                        .showInputDialog("Input the updated name for the contact");
                                                businessContact.setname(nameofcontact);
                                                break;
                                            }
                                            case 2: {
                                                String relationship = JOptionPane.showInputDialog(
                                                        "Input the updated relationship for this contact.");
                                                businessContact.setrelationship(relationship);
                                                break;
                                            }
                                            case 3: {
                                                while (true) {
                                                    try {
                                                        String newphone = JOptionPane.showInputDialog(
                                                                "Input the updated contact for this contact");
                                                        businessContact.setPhoneNumber(newphone);
                                                        break;
                                                    } catch (IllegalArgumentException e) {
                                                        JOptionPane.showMessageDialog(null, "Invalid contact");
                                                    }
                                                }
                                                break;
                                            }
                                            case 4: {
                                                while (true) {
                                                    try {
                                                        String newemail = JOptionPane.showInputDialog(
                                                                "Input the updated email for this contact");
                                                        businessContact.setEmail(newemail);
                                                        break;
                                                    } catch (IllegalArgumentException e) {
                                                        JOptionPane.showMessageDialog(null, "Invalid email address");
                                                    }
                                                }
                                                break;
                                            }
                                            case 5: {
                                                String nameofCompany = JOptionPane
                                                        .showInputDialog("Input the updated name of the company");
                                                businessContact.setCompany(nameofCompany);
                                                break;
                                            }
                                            case 6: {
                                                break;
                                            }
                                            default:
                                                JOptionPane.showMessageDialog(null, "Invalid input");
                                                break;
                                        }
                                        if (modify == 6) {
                                            break;
                                        }
                                    }

                                } else {
                                    continue;
                                }

                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Input, please try again.");
                        }
                    }
                    break;
                }

                case 6: {
                    // This case is used to view all the contacts.
                    // This is used to view all the personal contacts
                    for (int i = 0; i < personalArray.size(); i++) {
                        JOptionPane.showMessageDialog(null, personalArray.get(i).getname());
                    }
                    for (int i = 0; i < personalArray.size(); i++) {
                        JOptionPane.showMessageDialog(null, businessArray.get(i).getname());
                    }
                    break;
                }

                case 7: {
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Input please try again!");
                    break;
            }

        } while (choice != 7);
    }

    // I want to create a function that creates an object of personal class
    public PersonalContact toCreatePersonal() {
        JOptionPane.showMessageDialog(null, "Input the required values to create the contact");
        String name = JOptionPane.showInputDialog("Input the name of the contact");
        String relationship = JOptionPane.showInputDialog("Input your relationship with the contact");

        String phoneNumber;
        while (true) {
            phoneNumber = JOptionPane.showInputDialog("Input the mobile contact of the individual");
            if (phoneNumber.matches("^0(24|25|27|53|52|54|55|57|59)[0-9]{7}$")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, please try again");
            }
        }
        PersonalContact newPersonalContact = new PersonalContact(name, relationship, phoneNumber);
        return newPersonalContact;

    }

    // We are creating a function that creates a business object and returns the
    // object.
    public BusinessContact toCreateBusinessContact() {
        JOptionPane.showMessageDialog(null, "Input the required values to create the contact");
        String name = JOptionPane.showInputDialog("Input the name of the contact");
        String relationship = JOptionPane.showInputDialog("Input your relationship with the contact");
        String phoneNumber;
        while (true) {
            phoneNumber = JOptionPane.showInputDialog("Input the mobile contact of the individual");
            if (phoneNumber.matches("^0(24|25|27|53|52|54|55|57|59)[0-9]{7}$")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, please try again");
            }
        }
        String company = JOptionPane.showInputDialog("Input the name of the institution or organization");
        String email;
        while (true) {
            email = JOptionPane.showInputDialog("Input the email of the institution");
            if (email.matches("^.*@gmail.com$")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email, please try again");
            }
        }
        BusinessContact newBusinessContact = new BusinessContact(name, relationship, phoneNumber, email, company);
        return newBusinessContact;
    }
}
=======
package ContactProject;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class myMain {
    public static void main(String[] args) {
        // So this project is like a miniphonebook that will keep track of all my
        // contacts and allow me to make any modification.
        ArrayList<BusinessContact> businessArray = new ArrayList<>();
        ArrayList<PersonalContact> personalArray = new ArrayList<>();
        ArrayList<Object> favourites = new ArrayList<>();

        // Declaration of variables that would be used.
        Integer choice;
        myMain mymain = new myMain();
        PersonalContact theNewPersonalContact;
        BusinessContact theNewBusinessContact;

        // Going to create some personal contacts that are going to be used later on in
        // the program.
        PersonalContact personalContact1 = new PersonalContact("Karianne", "friend from Senior High School",
                "0542721566");
        PersonalContact personalContact2 = new PersonalContact("Jayden", "Program mate", "0273912233");

        // Add these contacts to the personal Array
        personalArray.add(personalContact1);
        personalArray.add(personalContact2);

        // Going to create some business contacts that are going to be used later on in
        // the program.
        BusinessContact businessContact1 = new BusinessContact("MyMotherCare", "Baby Accessories", "0556789909",
                "MyMotherCare@gmail.com", "MyMotherCare");
        BusinessContact businessContact2 = new BusinessContact("Illyana Stitches", "Dress Making company", "0245676897",
                "IllyanaStiches@gmail.com", "Illyana Stitches");

        // Add these contacts to the business Array.
        businessArray.add(businessContact1);
        businessArray.add(businessContact2);

        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Welcome to miniphonebook.\nSelect any option to continue\n1. Create a new contact\n2. Search for a contact in your phonebook.\n3. Remove contact from phonebook.\n4. Add to favourites\n5. Make modification to a contact\n6. View all the contacts\n7.Exit "));

            switch (choice) {
                case 1: {

                    // The first case is used to create an object of either businessclass or the
                    // personalclass. This case also allows you to create
                    // contacts the number of times you would like to.
                    Integer typeOfContact;

                    while (true) {
                        typeOfContact = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to create a personal contact\nInput 2 to create a business contact"));

                        if (typeOfContact == 1) {
                            // Specify the number of contacts you would like to add to create a loop that
                            // would allow you to create the number of contacts you would like.
                            Integer times = Integer.parseInt(
                                    JOptionPane.showInputDialog("Input the number of contacts you would like to add."));
                            for (int i = 0; i < times; i++) {
                                JOptionPane.showMessageDialog(null, "Create a new personal contact");
                                theNewPersonalContact = mymain.toCreatePersonal();
                                personalArray.add(theNewPersonalContact);
                            }
                            break;
                        } else if (typeOfContact == 2) {
                            // Specify the number of contacts you would like to create.
                            Integer times = Integer.parseInt(JOptionPane
                                    .showInputDialog("Input the number of business contacts you would like to create"));
                            for (int i = 0; i < times; i++) {
                                JOptionPane.showMessageDialog(null, "Create a new business contact");
                                theNewBusinessContact = mymain.toCreateBusinessContact();
                                businessArray.add(theNewBusinessContact);
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Input");
                        }
                    }

                    break;
                }
                case 2: {
                    // The second case is used to search for a contact.
                    Integer num;
                    while (true) {
                        num = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to search for a personal contact\nInput 2 to search for a business contact"));
                        if ((num != 1) && num != 2) {
                            JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                        } else {
                            break;
                        }
                    }
                    // This is the switch statement for the search by name or the search by contact.
                    switch (num) {
                        case 1: { // Search for a personal contact
                            Integer numSearch;
                            while (true) {
                                numSearch = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Input 1 to search by name\nInput 2 to search by phoneNumber"));
                                if ((numSearch != 1) && numSearch != 2) {
                                    JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                                } else {
                                    break;
                                }
                            }

                            if (numSearch == 1) {
                                boolean results = true;
                                String nameOFcontact = JOptionPane
                                        .showInputDialog("Input the name of the contact to search for");
                                for (PersonalContact theName : personalArray) {
                                    if (theName.getname().equalsIgnoreCase(nameOFcontact)) {
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null,
                                                "The name: " + theName.getname() + "\nThe contact: "
                                                        + theName.getcontact() + "\nThe relationship: "
                                                        + theName.getrelationship());
                                    } else {
                                        continue;
                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }
                            } else if (numSearch == 2) {
                                boolean results = true;
                                String contactdigits = JOptionPane.showInputDialog(null,
                                        "Input the phoneNumber you would like to search for");
                                for (PersonalContact theContact : personalArray) {
                                    if (theContact.getcontact().equals(contactdigits)) {
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null,
                                                "The name: " + theContact.getname() + "\nThe relationship: "
                                                        + theContact.getrelationship() + "\nThe contact: "
                                                        + theContact.getcontact());
                                    } else {
                                        continue;
                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }
                            }

                            break;
                        }

                        case 2: {
                            // This is the case for searching for a business contact.
                            Integer numSearch;
                            while (true) {
                                numSearch = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Input 1 to search by name\nInput 2 to search by phoneNumber"));
                                if ((numSearch != 1) && numSearch != 2) {
                                    JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                                } else {
                                    break;
                                }
                            }
                            if (numSearch == 1) {
                                // Here, we are searching by name.
                                boolean results = true;
                                String nameOfContact = JOptionPane
                                        .showInputDialog("Input the name of the contact you would want to search for");
                                for (BusinessContact businessContact : businessArray) {
                                    if (businessContact.getname().equalsIgnoreCase(nameOfContact)) {
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null, "The name: " + businessContact.getname());
                                        JOptionPane.showMessageDialog(null,
                                                "The relationship: " + businessContact.getrelationship());
                                        JOptionPane.showMessageDialog(null,
                                                "The contact: " + businessContact.getcontact());
                                        JOptionPane.showMessageDialog(null,
                                                "The email : " + businessContact.getemail());
                                        JOptionPane.showMessageDialog(null,
                                                "The name of the company: " + businessContact.getcompany());
                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }

                            } else if (numSearch == 2) {
                                // Here, we search for a business contact with a phone number.
                                boolean results = true;
                                String thecontact = JOptionPane
                                        .showInputDialog("Input the contact you would like to search for.");
                                for (BusinessContact businessContact : businessArray) {
                                    if (businessContact.getcontact().equals(thecontact)) {
                                        results = false;
                                        JOptionPane.showMessageDialog(null, "Found!");
                                        JOptionPane.showMessageDialog(null, "Here are the details of the contact");
                                        JOptionPane.showMessageDialog(null, "The name: " + businessContact.getname());
                                        JOptionPane.showMessageDialog(null,
                                                "The relationship: " + businessContact.getrelationship());
                                        JOptionPane.showMessageDialog(null,
                                                "The contact: " + businessContact.getcontact());
                                        JOptionPane.showMessageDialog(null,
                                                "The email : " + businessContact.getemail());
                                        JOptionPane.showMessageDialog(null,
                                                "The name of the company: " + businessContact.getcompany());

                                    }
                                }
                                if (results == true) {
                                    JOptionPane.showMessageDialog(null, "This contact does not exist.");
                                }
                            }

                            break;
                        }
                    } // The end of the switch for searching for a business or a personal contact.

                    break;// This is the break for case 2
                }
                case 3: {
                    // This case is used to remove a contact from the phonebook.
                    Integer remove;
                    while (true) {
                        remove = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to remove a personal contact\nInput 2 to remove a business contact"));
                        if (remove == 1) {
                            // This is used to remove a personal contact.
                            boolean results = true;
                            String thecontact = JOptionPane
                                    .showInputDialog("Input the name of the contact you would like to remove.");
                            for (PersonalContact personalContact : personalArray) {
                                if (personalContact.getname().equalsIgnoreCase(thecontact)) {
                                    results = false;
                                    personalArray.remove(personalContact);
                                    JOptionPane.showMessageDialog(null, "Successfully removed!");
                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist");
                            }
                            break;
                        } else if (remove == 2) {
                            // This is used to remove a business contact
                            boolean results = true;
                            String theContact = JOptionPane
                                    .showInputDialog("Input the name of the business contact you would like to remove");
                            for (BusinessContact businessContact : businessArray) {
                                if (businessContact.getname().equalsIgnoreCase(theContact)) {
                                    results = false;
                                    businessArray.remove(businessContact);
                                    JOptionPane.showMessageDialog(null, "Successfully removed!");

                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist.");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid input");
                        }
                    }
                    break;
                }

                case 4: {
                    // This is used to add a contact to favourites.
                    Integer num;
                    while (true) {
                        num = Integer.parseInt(JOptionPane.showInputDialog(
                                "Input 1 to add a personal contact to favourites\nInput 2 to add a business contact to favourites"));
                        if (num == 1) {
                            boolean results = true;
                            String nameOFcontact = JOptionPane
                                    .showInputDialog(
                                            "Input the name of the contact you would like to add to favourites.");
                            for (PersonalContact personalContact : personalArray) {
                                if (personalContact.getname().equalsIgnoreCase(nameOFcontact)) {
                                    results = false;
                                    favourites.add(personalContact);
                                    JOptionPane.showMessageDialog(null, "Added to favourites");
                                } else {
                                    continue;
                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist.");
                            }
                            break;
                        } else if (num == 2) {
                            boolean results = true;
                            String nameOFcontact = JOptionPane
                                    .showInputDialog(
                                            "Input the name of the contact you would like to add to favourites.");
                            for (BusinessContact businessContact : businessArray) {
                                if (businessContact.getname().equalsIgnoreCase(nameOFcontact)) {
                                    results = false;
                                    favourites.add(businessContact);
                                    JOptionPane.showMessageDialog(null, "Added to favourites");
                                } else {
                                    continue;
                                }
                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist.");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid input, please try again!");
                        }
                    }
                    break;
                }
                case 5: {
                    // This case is used to make modifications to the some of the details of the
                    // contacts.
                    Integer option;
                    while (true) {
                        option = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Input one to make modifications to a personal contact.\nInput two to make modifications to a business contact"));

                        if (option == 1) {
                            // This is used to make modifications to a personal contact.
                            boolean results = true;
                            Integer modify;
                            String theContact = JOptionPane
                                    .showInputDialog("Input the name of the contact you would like to modify");
                            for (PersonalContact personalContact : personalArray) {
                                if (personalContact.getname().equalsIgnoreCase(theContact)) {
                                    results = false;
                                    while (true) {
                                        modify = Integer.parseInt(JOptionPane.showInputDialog(
                                                "Input 1 to modify the name\nInput 2 to modify the relationship\nInput 3 to modify the contact\nInput 4 to exit"));
                                        switch (modify) {
                                            case 1: {
                                                String nameofcontact = JOptionPane
                                                        .showInputDialog("Input the updated name for the contact");
                                                personalContact.setname(nameofcontact);
                                                break;
                                            }
                                            case 2: {
                                                String relationship = JOptionPane.showInputDialog(
                                                        "Input the updated relationship for this contact.");
                                                personalContact.setrelationship(relationship);
                                                break;
                                            }
                                            case 3: {
                                                while (true) {
                                                    try {
                                                        String newphone = JOptionPane.showInputDialog(
                                                                "Input the updated contact for this contact");
                                                        personalContact.setPhoneNumber(newphone);
                                                        break;
                                                    } catch (IllegalArgumentException e) {
                                                        JOptionPane.showMessageDialog(null, "Invalid contact");
                                                    }
                                                }
                                                break;
                                            }
                                            case 4: {
                                                break;
                                            }
                                            default:
                                                JOptionPane.showMessageDialog(null, "Invalid input");
                                                break;
                                        }
                                        if (modify == 4) {
                                            break;
                                        }
                                    }

                                } else {
                                    continue;
                                }

                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist");
                            }
                            break;
                        } else if (option == 2) {
                            // This is used to make modifications to a business contact.
                            boolean results = true;
                            Integer modify;
                            String theContact = JOptionPane
                                    .showInputDialog("Input the name of the contact you would like to modify");
                            for (BusinessContact businessContact : businessArray) {
                                if (businessContact.getname().equalsIgnoreCase(theContact)) {
                                    results = false;
                                    while (true) {
                                        modify = Integer.parseInt(JOptionPane.showInputDialog(
                                                "Input 1 to modify the name\nInput 2 to modify the relationship\nInput 3 to modify the contact\nInput 4 to modify the email\nInput 5 to modify the company name\nInput 6 to exit"));
                                        switch (modify) {
                                            case 1: {
                                                String nameofcontact = JOptionPane
                                                        .showInputDialog("Input the updated name for the contact");
                                                businessContact.setname(nameofcontact);
                                                break;
                                            }
                                            case 2: {
                                                String relationship = JOptionPane.showInputDialog(
                                                        "Input the updated relationship for this contact.");
                                                businessContact.setrelationship(relationship);
                                                break;
                                            }
                                            case 3: {
                                                while (true) {
                                                    try {
                                                        String newphone = JOptionPane.showInputDialog(
                                                                "Input the updated contact for this contact");
                                                        businessContact.setPhoneNumber(newphone);
                                                        break;
                                                    } catch (IllegalArgumentException e) {
                                                        JOptionPane.showMessageDialog(null, "Invalid contact");
                                                    }
                                                }
                                                break;
                                            }
                                            case 4: {
                                                while (true) {
                                                    try {
                                                        String newemail = JOptionPane.showInputDialog(
                                                                "Input the updated email for this contact");
                                                        businessContact.setEmail(newemail);
                                                        break;
                                                    } catch (IllegalArgumentException e) {
                                                        JOptionPane.showMessageDialog(null, "Invalid email address");
                                                    }
                                                }
                                                break;
                                            }
                                            case 5: {
                                                String nameofCompany = JOptionPane
                                                        .showInputDialog("Input the updated name of the company");
                                                businessContact.setCompany(nameofCompany);
                                                break;
                                            }
                                            case 6: {
                                                break;
                                            }
                                            default:
                                                JOptionPane.showMessageDialog(null, "Invalid input");
                                                break;
                                        }
                                        if (modify == 6) {
                                            break;
                                        }
                                    }

                                } else {
                                    continue;
                                }

                            }
                            if (results == true) {
                                JOptionPane.showMessageDialog(null, "This contact does not exist");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Input, please try again.");
                        }
                    }
                    break;
                }

                case 6: {
                    // This case is used to view all the contacts.
                    // This is used to view all the personal contacts
                    for (int i = 0; i < personalArray.size(); i++) {
                        JOptionPane.showMessageDialog(null, personalArray.get(i).getname());
                    }
                    for (int i = 0; i < personalArray.size(); i++) {
                        JOptionPane.showMessageDialog(null, businessArray.get(i).getname());
                    }
                    break;
                }

                case 7: {
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Input please try again!");
                    break;
            }

        } while (choice != 7);
    }

    // I want to create a function that creates an object of personal class
    public PersonalContact toCreatePersonal() {
        JOptionPane.showMessageDialog(null, "Input the required values to create the contact");
        String name = JOptionPane.showInputDialog("Input the name of the contact");
        String relationship = JOptionPane.showInputDialog("Input your relationship with the contact");

        String phoneNumber;
        while (true) {
            phoneNumber = JOptionPane.showInputDialog("Input the mobile contact of the individual");
            if (phoneNumber.matches("^0(24|25|27|53|52|54|55|57|59)[0-9]{7}$")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, please try again");
            }
        }
        PersonalContact newPersonalContact = new PersonalContact(name, relationship, phoneNumber);
        return newPersonalContact;

    }

    // We are creating a function that creates a business object and returns the
    // object.
    public BusinessContact toCreateBusinessContact() {
        JOptionPane.showMessageDialog(null, "Input the required values to create the contact");
        String name = JOptionPane.showInputDialog("Input the name of the contact");
        String relationship = JOptionPane.showInputDialog("Input your relationship with the contact");
        String phoneNumber;
        while (true) {
            phoneNumber = JOptionPane.showInputDialog("Input the mobile contact of the individual");
            if (phoneNumber.matches("^0(24|25|27|53|52|54|55|57|59)[0-9]{7}$")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input, please try again");
            }
        }
        String company = JOptionPane.showInputDialog("Input the name of the institution or organization");
        String email;
        while (true) {
            email = JOptionPane.showInputDialog("Input the email of the institution");
            if (email.matches("^.*@gmail.com$")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid email, please try again");
            }
        }
        BusinessContact newBusinessContact = new BusinessContact(name, relationship, phoneNumber, email, company);
        return newBusinessContact;
    }
}
>>>>>>> 4a62b56 (This is the first look of the content of the files)
