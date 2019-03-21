package animals;

public class dog {
    public String name;
    public String size;
    public int age;
    public String breed;

    public dog(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark (String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap yap yap";
        }
        else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof";
        }
        else {
            bark = "woof woof!";
        }
        return bark;
    }
    public String play(String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("poodle")) {
            playing = "Oh Dear, I don't think so, one could not possibly engage in such activities";
        }
        else if (breed.equalsIgnoreCase("Labrador")) {
            playing = "Yeah, Yeah, Throw the stick! Yeah, DO IT";
        }
        else if (breed.equalsIgnoreCase("Border Collie")) {
            playing = "Lets go chase us some sheep!";
        }
        return playing;
    }
    public String beHuman (String name, int age, String breed) {
        return "Hello human, I'm" + name + " and I am a " + age + " year old "
                + breed + ", What breed are you";
    }

}

