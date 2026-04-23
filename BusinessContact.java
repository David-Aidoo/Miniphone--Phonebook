<<<<<<< HEAD
package ContactProject;

public class BusinessContact extends Contact {
   private String email;
   private String company;

   BusinessContact(String name, String relationship, String phoneNumber, String email, String company) {
      super(name, relationship, phoneNumber);
      this.setEmail(email);
      this.setCompany(company);
   }

   // i have to set getters and setters for this class as well.
   // Getters.
   public String getemail() {
      return this.email;
   }

   public String getcompany() {
      return this.company;
   }

   // Setters
   public void setEmail(String email) {
      if (!(email.matches("^.*@gmail.com$"))) {
         throw new IllegalArgumentException("Invalid email");
      }
      this.email = email;
   }

   public void setCompany(String company) {
      this.company = company;
   }
}
=======
package ContactProject;

public class BusinessContact extends Contact {
   private String email;
   private String company;

   BusinessContact(String name, String relationship, String phoneNumber, String email, String company) {
      super(name, relationship, phoneNumber);
      this.setEmail(email);
      this.setCompany(company);
   }

   // i have to set getters and setters for this class as well.
   // Getters.
   public String getemail() {
      return this.email;
   }

   public String getcompany() {
      return this.company;
   }

   // Setters
   public void setEmail(String email) {
      if (!(email.matches("^.*@gmail.com$"))) {
         throw new IllegalArgumentException("Invalid email");
      }
      this.email = email;
   }

   public void setCompany(String company) {
      this.company = company;
   }
}
>>>>>>> 4a62b56 (This is the first look of the content of the files)
