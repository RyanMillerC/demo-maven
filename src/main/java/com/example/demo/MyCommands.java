package com.example.demo;

import java.util.ArrayList;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class MyCommands {

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod("Subtract two integers.")
    public int subtract(int a, int b) {
        return a - b;
    }

    @ShellMethod("List all people.")
    public ArrayList<Person> list() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ryan", 45));
        people.add(new Person("Logan", 64));
        people.add(new Person("Maxwell", 85));
        return people;
    }
}
