package com.mx.intellego.zurich.emc.test;

import com.mx.intellego.zurich.emc.bussiness.impl.Carpeta;

public class MetadatosCarpetaTest {
	
	public static void main(String[] args) {
		Carpeta carpeta = new Carpeta();
		System.out.println(carpeta.crearMetadatosCarpeta("0", "/MX", "Mexico", "Eca6WyjcEVuTj2xSZVWhjt08RuBF1pWS"));
	}
}
