public class Program {
    public static void main(String[] args) {
        Book a=new Book("C++ для начинающих", 200);
        Book b=new Book("Война и мир",500);
        a.setName("Java для начинающих");
        a.setSize(150);
        System.out.println("Название= "+a.getName()+" Количество страниц= "+a.getSize());
        System.out.println(b.toString());
    }
}
