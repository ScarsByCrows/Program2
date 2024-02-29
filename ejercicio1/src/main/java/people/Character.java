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
        
        public Character(){
            
        }
        
        public void saySomething() {
            System.out.println(this.catchPhrase);
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

 
        
        
}
