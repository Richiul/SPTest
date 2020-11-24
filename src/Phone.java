public class Phone extends  Product{


    String sistem;

    public Phone(String name,int pret) {
        super(name,pret);

    }

    public String getSistem() {
        return sistem;
    }

    public void setSistem(String sistem) {
        this.sistem = sistem;
    }


    public void print()
    {
        if(sistem != null)
            System.out.print("@" + sistem +": ");
    }
}
