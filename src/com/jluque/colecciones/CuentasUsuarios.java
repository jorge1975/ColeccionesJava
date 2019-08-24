package com.jluque.colecciones;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Jorge Luque","00001",250000);
		Cliente cl2 = new Cliente("Maria Luna","00002",10000);
		Cliente cl3 = new Cliente("Gerardo Luque","00003",90000);
		Cliente cl4 = new Cliente("Alex Lopez","00004",1000);
		Cliente cl5 = new Cliente("Alex Lopez","00004",1000);
		
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getC_cuenta() + " " + cliente.getSaldo());
		}
	}

}
