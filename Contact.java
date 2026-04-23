<<<<<<< HEAD
package ContactProject;

public abstract class Contact {
    private String name;
    private String relationship;
    private String phoneNumber;

    Contact(String name, String relationship, String phoneNumber) {
        this.setName(name);
        this.setRelationship(relationship);
        this.setPhoneNumber(phoneNumber);
    }

    // These are the getter methods that are used to obtain the private variables
    public String getname() {
        return this.name;
    }

    public String getContact() {
        return this.phoneNumber;
    }

    public String getRelationship() {
        return this.relationship;
    }

    // So we are moving on to the setter methods which are used to change or
    // initialize the variables
    public void setName(String name) {
        this.name = name;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    // Creating a variable that is going to be used setcontact method.

    // Create a function that is able to set the value of the contact and also
    // indicate if there is a problem with the syntax.

    public void setPhoneNumber(String phoneNumber) {
        if (!(phoneNumber.matches("^0(24|25|27|53|52|54|55|57|59)[0-9]{7}$"))) {
            throw new IllegalArgumentException(
                    "Invalid phone number format. Please enter a valid Ghanaian phone number.");
        }
        this.phoneNumber = phoneNumber;
    }

}
=======
package ContactProject;

public abstract class Contact {
    private String name;
    private String relationship;
    private String phoneNumber;

    Contact(String name, String relationship, String phoneNumber) {
        this.setName(name);
        this.setRelationship(relationship);
        this.setPhoneNumber(phoneNumber);
    }

    // These are the getter methods that are used to obtain the private variables
    public String getname() {
        return this.name;
    }

    public String getContact() {
        return this.phoneNumber;
    }

    public String getRelationship() {
        return this.relationship;
    }

    // So we are moving on to the setter methods which are used to change or
    // initialize the variables
    public void setName(String name) {
        this.name = name;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    // Creating a variable that is going to be used setcontact method.

    // Create a function that is able to set the value of the contact and also
    // indicate if there is a problem with the syntax.

    public void setPhoneNumber(String phoneNumber) {
        if (!(phoneNumber.matches("^0(24|25|27|53|52|54|55|57|59)[0-9]{7}$"))) {
            throw new IllegalArgumentException(
                    "Invalid phone number format. Please enter a valid Ghanaian phone number.");
        }
        this.phoneNumber = phoneNumber;
    }

}
>>>>>>> 4a62b56 (This is the first look of the content of the files)
