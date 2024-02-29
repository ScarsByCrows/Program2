package com.mycompany.ejercicio1;

import people.Character;

public class Ejercicio1 {

    public static void main(String[] args) {
        Character Homer = new Character("Homer", 40, 'M', "Ay esta grasa no se quita");
        Homer.saySomething();
        
        Character Bart = new Character("Bartolomeo", 10, 'M', "Ay caramba");
        Bart.saySomething();
        
        Character Caine = new Character("Caine", 400, 'M', "Ayuda Pomni, me estoy haciendo peruano");
        Caine.saySomething();
    }
}
