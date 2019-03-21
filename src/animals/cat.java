package animals;

public class cat {
    public String name;
    public String size;
    public int age;
    public String breed;

    public cat(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String stroke (String size) {
        String purr = "";
        if (size.equalsIgnoreCase("small")) {
            purr = "meow meow meow";
        }
        else if (size.equalsIgnoreCase("medium")) {
            purr = "scratch scratch";
        }
        else {
            purr = "woof woof!";
        }
        return purr;
    }
    public String play(String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("tabby")) {
            playing = "Oh Dear, I don't think so, one could not possibly engage in such activities";
        }
        else if (breed.equalsIgnoreCase("ginger")) {
            playing = "Yeah, Yeah, Throw the toy! Yeah, DO IT";
        }
        else if (breed.equalsIgnoreCase("Border Collie")) {
            playing = "Lets go chase us some mice!";
        }
        return playing;
    }
    public String beHuman (String name, int age, String breed) {
        return "Hello human, I'm" + name + " and I am a " + age + " year old "
                + breed + ", What breed are you";
    }

}
