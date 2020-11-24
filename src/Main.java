public class Main {
    public static void main(String[] args) {
        Box c1 = new Box("Box");
        Box c2 = new Box("Box1");
        Box c3 = new Box("Box2");
        Phone l1 = new Phone("Tel 1",200);
        Phone l2 = new Phone("Tel 2",800);
        Phone l3 = new Phone("Tel 3",250);
        Headphones casca1 = new Headphones("Casti 1",80);
        Charger incarc1 = new Charger("Incarcator1",45);
        c1.add(l1);
        c1.add(l2);
        c1.add(l3);
        c2.add(c1);
        c2.add(c3);
        c3.add(casca1);
        c2.add(incarc1);

        l1.setSistem("Windows Phone");
        l2.setSistem("Android");
        l3.setSistem("iOS");


        System.out.println("Afisam cutia 1");
        c1.print();
        System.out.println("Afisam cutia 2");
        c2.print();


    }
}

/*Afisam cutia 1
Cutia: Box
@Windows Phone: @Android: @iOS: Afisam cutia 2
Cutia: Box1
Cutia: Box
@Windows Phone: @Android: @iOS: Cutia: Box2
Produsul are numele: Casti 1 si pretul: 80
Produsul are numele: Incarcator1 si pretul: 45

/////Print/////
*/