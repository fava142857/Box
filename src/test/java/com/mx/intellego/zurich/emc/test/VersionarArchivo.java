package com.mx.intellego.zurich.emc.test;

import java.io.File;
import java.io.FileNotFoundException;

import com.mx.intellego.zurich.emc.bussiness.impl.Archivo;

public class VersionarArchivo {
	public static void main(String[] args) throws FileNotFoundException {
		File pdfInput   = new File("C:/Hola.pdf");
		Archivo archivo = new Archivo();
		System.out.println(archivo.versionarBox(pdfInput, "94283868483", "BhlBUPPxRb2Wvxcjn1Mp7NUeEhEtPjYP"));
	}
}
