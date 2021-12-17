package Homework8;

class Movies {
    private String name;
    private String actor;

    public Movies(String name) {
        this.name = name;
    }

    public Movies(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public String oneLiner() {
        return "No one Liner provides";
    }

    public String Actor() {
        return actor;
    }
    @Override
    public String toString() {
        return " : " + name + "\nA One-Liner : " + oneLiner() + "\nActor : " + Actor() + "\n";
    }
}

class Jaws extends Movies {

    public Jaws() {
        super("Jaws", "Robert Shaw");
    }
    @Override
    public String oneLiner() {
        return "We need a bigger boat";
    }
    @Override
    public String Actor() {
        return "Robert Shaw";
    }
}


class StarWars extends Movies {
    public StarWars() {
        super("Star Wars");
    }
    @Override
    public String oneLiner() {
        return "Resistance is futile";
    }
    @Override
    public String Actor() {
        return "Harrison Ford";
    }
}

class AngryMen extends Movies {
    public AngryMen() {
        super("12 Angry Men");
    }
    @Override
    public String oneLiner() {
        return "Open and Shut Case ";
    }
    @Override
    public String Actor() {
        return "Henry Fonda";
    }
}

class IndependenceDay extends Movies {

    public IndependenceDay() {
        super("Independence Day");
    }
    @Override
    public String oneLiner() {
        return "No oops!";
    }
    @Override
    public String Actor() {
        return "Will Smith";
    }
}

class BourneIdentity extends Movies {

    public BourneIdentity() {
        super("Bourne Identity");
    }

    @Override
    public String oneLiner() {
        return "A man with many passports";
    }
    @Override
    public String Actor() {
        return "Matt Damon";
    }

}

class MovieList {
    public static void main(String[] args) {
        Movies[] m = { new Jaws(),
                new StarWars(),
                new AngryMen(),
                new IndependenceDay(),
                new BourneIdentity()
        };

        // print your list of movies based on the random numbers (array) generated
        int numberOfRuns = 2; // run 2 sets of random movies for 5 movies each.
        int count = 1;
        while (count <= numberOfRuns) {

            System.out.println(" ---- run number: " + count);
            int[] x = new int[m.length];
            x = getArray(x); // get an array of random numbers to map to the movies list.

            for (int i = 0; i < x.length; i++) {
                int j = x[i];
                System.out.print("Random number generated was: " + j + "\nMovie #" + (i + 1));
                System.out.println(m[j]); // here is where you display
                // toString the movie content; Polymorphism in ACTION.
            }
            count++;
        }
    }
    // you cannot have repeats within the random number array
    // note the getArray( ) of random numbers needs to be static...!

    public static int[] getArray(int[] y) {
        int[] result = new int[y.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * y.length);

            // check for repeater with the random array
            for (int k = 0; k < i; k++) {
                if (result[k] == result[i])
                    i--;
            }
        }
        return result; // return an array[5] of random integers.
    }
}

