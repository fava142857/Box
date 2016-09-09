package com.mx.intellego.zurich.emc.test;

import java.io.File;
import java.io.IOException;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class SubirArchivoTest {
	
	public static void main(String[] args) throws IOException {
		File pdfInput   = new File("C:/Memoria.docx");
		Archivo archivo = new Archivo();
		System.out.println(archivo.subirArhivoBox(pdfInput,"Memoria.docx","Eca6WyjcEVuTj2xSZVWhjt08RuBF1pWS"));
	}
}
