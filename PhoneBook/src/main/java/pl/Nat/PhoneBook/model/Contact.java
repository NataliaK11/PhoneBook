package pl.Nat.PhoneBook.model;

import lombok.Data;

@Data
public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;

    @Override
    public String toString() {
        return name + " " +
                surname + " " +
                phoneNumber ;
    }
}

