package functionDefinition;

import java.util.Scanner;

import Linklist.LinkList;
import person.Person;

public class SearchContact {

    public void seach(LinkList person) {
        ViewContact view = new ViewContact();
        Scanner tell = new Scanner(System.in);
        LinkList<Person> matchedContact = new LinkList();
        System.out.println("You could search for a contact from their first names:");
        String element = tell.nextLine();
        int match = 0;
        for (int i = 0; i < person.getSize(); i++) {
            Person person1 = (Person) person.dataAtIndex(i);
            if (element.equals(person1.getFrsitName())) {
                match++;
                matchedContact.add(person1);
            }
        }
        if (match > 0) {
            System.out.println(match + " match found!");
        } else {
            System.out.println("NO RESULTS FOUND!");
        }
        view.printContact(matchedContact, match);

    }

}

