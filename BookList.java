import java.util.*;
import java.util.function.*;
public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        UnaryOperator<Book> op=new  UnaryOperator<Book>() {
			@Override
			public Book apply(Book t) {
				// TODO Auto-generated method stub
				t.setPrice(t.getPrice()*2);
				return t;
			}
        	
        };
		List<Book> data=List.of(new Book("Java",500), new Book("C#",550),new Book("DB",600));
        data=new ArrayList<>(data);
        data.replaceAll(b-> {
           b.setName(b.getName().toUpperCase());	
           b.setPrice(b.getPrice()*2);
           return b;
        });
        data.forEach(b->System.out.println(b));
	}

}
