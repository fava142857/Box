package com.mx.intellego.zurich.emc.test;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class DescargarArchivoTest {
	
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		System.out.println(archivo.linkDescargarArchivoBox("94283868483", "DHrTRAe19lH2UsM9lZoF1nW6RRdqDYj4"));
	}
}
