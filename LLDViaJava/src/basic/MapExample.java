package basic;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Book{
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    Book(int id, String name, String author, String publisher, int quantity){
        this.id=id;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
public class MapExample {

    public static void main(String[] args) {
        Map<Integer,Book> map = new HashMap<>();
        Book b1 = new Book(1,"Let us C","Yashwant Kanetker","BPB",8);
        Book b2 = new Book(2,"networking","Forouzan","Mc Graw",4);
        Book b3 = new Book(3,"Os","Galvin","will",6);
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        /*for(Map.Entry<Integer, Book> entries:map.entrySet()){
            int key = entries.getKey();
            Book b = entries.getValue();
            System.out.println(key +"details");
            System.out.println(b.id  +b.name +b.author +b.publisher +b.quantity);
        }*/
        Set<Map.Entry<Integer, Book>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Book>> itr = entries.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Book> entry = itr.next();
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println(b.id  +b.name +b.author +b.publisher +b.quantity);
        }
    }
}
