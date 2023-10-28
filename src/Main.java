public class Main {
    public static void main(String[] args) {

        Game.print();

        Unit unit1 = new Unit("Sasha");
        Unit unit2 = new Unit("Anton");

//        System.out.println(unit1);
//        System.out.println(unit2);
//        unit1.attak(unit2);
//        System.out.println(unit1);
//        System.out.println(unit2);
//        unit2.attak(unit1);
//        System.out.println(unit1);
//        System.out.println(unit2);

//        unit1.print();
//        unit1.print("Print ");

        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");

        System.out.println(wizard1);
        System.out.println(wizard2);

        wizard1.attak(wizard2);

        System.out.println(wizard1);
        System.out.println(wizard2);
        Game.print();
    }
}