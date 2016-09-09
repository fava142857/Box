package com.mx.intellego.zurich.emc.test;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class PublicarLinkArchivoTest {
	
	public static void main(String[] args) {
		String link = "";
		Archivo archivo = new Archivo();
		link = archivo.linkVisualizarArchivoBox("94283868483", "Eca6WyjcEVuTj2xSZVWhjt08RuBF1pWS");
		System.out.println(link);
	}
}
