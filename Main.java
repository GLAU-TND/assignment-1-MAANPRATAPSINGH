package main;
import functionDefinition.*;
import person.Person;
import Linklist.LinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkList<Person> listContact = new LinkList<Person>();
        boolean turnoff = false;
        Scanner tell = new Scanner(System.in);
        int a = 0;
        System.out.println("Welcome to Abhi Contact list \uD83D\uDE01:");
        while (!turnoff) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int ch = tell.nextInt();
            switch (ch) {
                case 1:
                    AddContact add = new AddContact();
                    listContact.add(add.addContact());
                    break;
                case 2:
                    ViewContact view = new ViewContact();
                    view.viewList(listContact);
                    break;

                case 3:
                    SearchContact search = new SearchContact();
                    search.seach(listContact);
                    break;
                case 4:
                    DeleteContact delete = new DeleteContact();
                    delete.removeContactFormLIst(listContact);
                    break;
                case 5:
                    turnoff = true;
                    break;
                default:
                    System.out.println("invalid choice please re-enter");
                    break;
            }
        }
    }
}

