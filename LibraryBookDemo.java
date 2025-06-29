class LibraryBook{
    String t,au,id;
    LibraryBook(String t,String au,String id){this.t=t;this.au=au;this.id=id;}
    void show(){System.out.println(t+" "+au+" "+id);}
}
public class LibraryBookDemo{
    public static void main(String[]a){
        new LibraryBook("Clean Code","Martin","B1").show();
    }
}
