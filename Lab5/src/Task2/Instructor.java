package Task2;

import java.io.Serializable;

public class Instructor implements Serializable {
    public  String firstName;
    public  String lastName;
    public  int department;
    public  String email;

    public Instructor(){
        firstName = "noname";
        lastName = "nosname";
        department = 4;
        email = "noEmail";
    }

    public Instructor(String  firstName, String lastName, int department, String email)
    {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDepartment() {
        return department;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  "FirstName is " + firstName + " LastName is " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Instructor)
        {
            Instructor ins = (Instructor) obj;
            if(this.lastName == ins.lastName && this.firstName == ins.firstName && this.email == ins.email && this.department == ins.department)
            {
                return  true;
            }
        }
        return  false;
    }
}
