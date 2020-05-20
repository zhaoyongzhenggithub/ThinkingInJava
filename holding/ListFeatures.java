package holding;

import java.util.List;
import java.util.Random;

public class ListFeatures {
	@SuppressWarnings("checked")
	public static void main(String[] args) {
		Random random=new Random(47);
		List<Pet> pets=Pets.arrayList(7);
		System.out.println("1:"+pets);
		Hamster h=new Hamster();
		pets.add(h);
		System.out.println("2:"+pets);
		System.out.println("3:"+pets.contains(h));
		pets.remove(h);
		Pet p=pets.get(2);
		System.out.println("4:"+p+" "+pets.indexOf(p));
		
		
	}
}
