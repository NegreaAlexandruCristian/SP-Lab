import java.util.ArrayList;

public class SubChapter {

    private String name;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public SubChapter(){

    }

    public SubChapter(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Element> getElement(){
        return elements;

    }

    public void createElement(Element element){
        this.elements.add(element);

    }

    public void print(){

        System.out.println("The SubChapter name is : " + this.name);
        System.out.println("The contents of the subchapter are : ");
        for(Element element : elements){

            element.print();
        }
    }
}
