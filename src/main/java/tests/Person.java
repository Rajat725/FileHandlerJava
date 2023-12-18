package tests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Person {

    String firstName;
    String lastName;
    List<Addresses> address;
}
