/*
 * Alejandrina Gonzalez 
 * Pd. 2
 * Main.java
 * 
 * */

import java.util.*;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Red");
		for (String obj:colors){
			System.out.println(obj);
		}
		//System.out.println(colors+"\n");
//
		Data data1 = new Data("Ale","G", 18);
		Data data2 = new Data("Luis","F", 17);
		Data data3 = new Data("Fran","C", 18);
		
		ArrayList<Data> info = new ArrayList<Data>();
		info.add(data1);
		info.add(data2);
		info.add(data3);
		info.set(2, data1);
		info.add(3, data3);
		info.add(4, data1);
		info.add(5, data1);
		info.add(6, data1);
		info.remove(5);
		
		Iterator<Data> i = info.iterator();
		while (i.hasNext()){
			Data d = (Data)i.next();
			System.out.println(d.firstName+" "+d.lastName+" "+d.age);
		}
		
		
		int[] array = new int[5];
		for (int i1 = 0; i1 < array.length; i1++){
			array[i1] = i1 +1;
			//System.out.println(i1);
		}
		
		int[] a = new int[15];
		Random rand = new Random();
		int r = rand.nextInt(18);
		//System.out.println(r);
		
		for (int e = 0; e < a.length; e++){
			//a[e] = e;
			
			a[e] = rand.nextInt(18);
			System.out.println(e);
		}
		
		for (int e = a.length - 1; e >= 0; e--){
			a[e] = e;
			System.out.println(e);
		}
		
	}
}