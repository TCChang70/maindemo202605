import java.util.*;
import java.util.function.Consumer;

public class ListDemo1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> cs=new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("v="+t);
			}			
		};
		List<Integer> data=List.of(1,2,3,4,5,6,7,8,9,10);
        //data.forEach(cs);
        data.forEach(x->{
        	x++;
        	System.out.println("val="+x);	
        });
	}

}

//class MyConsumer implements Consumer<Integer>{
//	@Override
//	public void accept(Integer t) {
//	   if(t%2==0)	
//		 System.out.println("value="+t);	
//	}	
//}