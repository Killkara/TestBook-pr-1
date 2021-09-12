public class Book {
    private String name;
    private int size;
    public Book(String name,int size){
        this.name=name;
        this.size=size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Название= "+this.name+" Количество страниц= "+this.size;
    }
}
