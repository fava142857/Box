package com.mx.intellego.zurich.emc.test;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class CrearMetadatoArchivoTest {
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		System.out.println(archivo.crearMetadatoBox("94376680085", "/spain", "Espania", "DHrTRAe19lH2UsM9lZoF1nW6RRdqDYj4"));
	}
}
