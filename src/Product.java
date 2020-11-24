public class Product implements Element{
    private String name;
    int pret;
    public Product(String name,int pret) {
        this.name = name;
        this.pret = pret;
    }
    public void print()
    {
        System.out.println("Produsul are numele: " + this.name+" si pretul: "+this.pret);
    }

}