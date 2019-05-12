package pl.Nat.PhoneBook.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PhoneBookService {
    static List<Contact> contacts=new ArrayList<>();

   public static List<Contact> printContacts(){
       return contacts;
   }


    public boolean addContact(Contact contact){
         return contacts.add(contact);
    }

    public void showContacts(){
        Iterator <Contact> iterator=contacts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
