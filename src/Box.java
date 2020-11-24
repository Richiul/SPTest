
import java.util.ArrayList;

public class Box implements Element{

    protected String sectionTitle;
    protected ArrayList<Element> content = new ArrayList<>();

    public Box(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public int add(Element elm){
        content.add(elm);
        return content.indexOf(elm);
    }


    public Element getElement(int index){
        return content.get(index);
    }

    public void print(){
        System.out.println("Cutia: "+this.sectionTitle);
        for(Element i : content){
            i.print();
        }

    }
}
