package com.mycompany.ejercicio1;

import people.Character;

public class Ejercicio1 {

    public static void main(String[] args) {
        Character homer = new Character("Homer", 40, 'M', "Ay esta grasa no se quita");
        homer.saySomething();
        
        Character bart = new Character("Bartolomeo", 10, 'M', "Ay caramba");
        bart.saySomething();
        
        Character caine = new Character("Caine", 400, 'M', "Ayuda Pomni, me estoy haciendo peruano");
        caine.saySomething();
        
        Character sonic = new Character();
        sonic.setName("Sonic");
        sonic.setPhrase("You're too slow");
        
    }
}
