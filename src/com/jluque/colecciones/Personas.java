package com.jluque.colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> personas=new LinkedList<String>();
		personas.add("Alex");
		personas.add("Bertha");
		personas.add("Carlos");
		personas.add("Esther");
		personas.add("Fernanda");
		personas.add("Gina");
		personas.add("Herlinda");
		
		for (String persona : personas) {
			System.out.println(persona);
		}
		
		System.out.println(personas.size());
		
		ListIterator<String> it=personas.listIterator();
		
		it.next();
		it.next();
		it.next();
		it.add("Delia");
		
		for (String persona : personas) {
			System.out.println(persona);
		}
		
		System.out.println(personas.size());
		
	}

}
