public class Beer {
    Float vol;
    Integer ibu;
    String type;

    //empty constructor
    public Beer(){
        System.out.println("DEFAULT CONSTRUCTOR");
        this.vol = 0.0f;
        this.ibu = 4;
        this.type = "noname";

    }

    public Beer(String type){
        // konstroktor musi byc wywołany w pierwszej linijce
        this();
        this.type = type;
    }


    //constructor
    public Beer(Float volume, Integer ibu, String type){
        this.vol = volume;
        this.ibu = ibu;
        this.type = type;
    }

    // oznaczamy ze nadpisujemy metodę
    @Override
    public String toString(){
        return "Delicious " + this.type + " vol." + this.vol + "%";
    }
}