package people;

public class Character {
        String name;
        int age;
        char gender;
        String catchPhrase;

        public Character(String name, int age, char gender, String catchPhrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.catchPhrase = catchPhrase;
        }
        
        public void saySomething() {
            System.out.println(this.catchPhrase);
        }
}
