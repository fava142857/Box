package com.mx.intellego.zurich.emc.test;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class PublicarLinkArchivoTest {
	
	public static void main(String[] args) {
		String link = "";
		Archivo archivo = new Archivo();
		link = archivo.linkVisualizarArchivoBox("94450619050", "tmOOyxAojemGPd46TqlRxbKlxwLLXnL2");
		System.out.println(link);
	}
}
