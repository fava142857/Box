package com.mx.intellego.zurich.emc.test;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class CrearMetadatoArchivoTest {
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		System.out.println(archivo.crearMetadatoBox("94475623764", "/MX", "saludo1", "rdd97U77TK0SeUpD0xZIwhwbBlPpbtXi"));
	}
}
