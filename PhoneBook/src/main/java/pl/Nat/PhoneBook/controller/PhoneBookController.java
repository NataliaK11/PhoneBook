package pl.Nat.PhoneBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.Nat.PhoneBook.model.Contact;
import pl.Nat.PhoneBook.model.PhoneBookService;
import org.springframework.ui.Model;

@Controller
public class PhoneBookController {

@Autowired
    PhoneBookService phoneBookService;
@GetMapping("/phonebook")
    public String starter() {
    return "phoneBook_Form";
}

@GetMapping("/phonebook/add")
    public String addContact(Model model){
    model.addAttribute("contact",new Contact());
        return "add_contact";
    }

@PostMapping("/phonebook/add")
    public String addContact(@ModelAttribute("contact") Contact contact,
                             Model model){

    model.addAttribute("addContact",phoneBookService.addContact(contact));
return "phoneBook_Form";
}

@GetMapping("/phonebook/show")
    public String showContacts(Model model){
    model.addAttribute("show",PhoneBookService.printContacts());
    return "show_contacts";
}



}


