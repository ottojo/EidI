public class Main {

    public static void main(String[] args) {

        //Rohzutaten
        Rohzutat potatos = new Rohzutat("potatos", 150);
        Rohzutat carrots = new Rohzutat("carrots", 80);
        Rohzutat zuccini = new Rohzutat("zuccini", 180);
        Rohzutat beef = new Rohzutat("beef", 6000);
        Rohzutat cream = new Rohzutat("cream", 550);
        Rohzutat honey = new Rohzutat("honey", 2800);
        Rohzutat yoghurt = new Rohzutat("yoghurt", 1400);

        //Rezepte
        Rezept potatoSoup = new Rezept("potato soup", new Zutat[]{
                new Zutat(cream, null, 200),
                new Zutat(potatos, "diced", 300)});

        Rezept roastBeef = new Rezept("roast beef", new Zutat[]{
                new Zutat(beef, null, 250)});

        Rezept grilledVeggies = new Rezept("grilled veggies", new Zutat[]{
                new Zutat(carrots, "striped", 100),
                new Zutat(zuccini, "chopped", 100)});

        Rezept fries = new Rezept("fries", new Zutat[]{
                new Zutat(potatos, "striped", 200)});

        Rezept greekDessert = new Rezept("greek dessert", new Zutat[]{
                new Zutat(honey, null, 50),
                new Zutat(yoghurt, null, 100)});

        Menu A = new Menu("A", potatoSoup, roastBeef, new Rezept[]{grilledVeggies, fries}, greekDessert);

        System.out.println(A);
    }
}
