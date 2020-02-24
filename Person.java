package person;

import Linklist.LinkList;

public class Person {
    private String frsitName;
    private String lastName;
    private LinkList<Long> contactNo;
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public LinkList getContactNo() {
        return contactNo;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFrsitName() {
        return frsitName;
    }

    public void setFrsitName(String frsitName) {
        this.frsitName = frsitName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNo(LinkList<Long> contactNo) {
        this.contactNo = contactNo;
    }
}