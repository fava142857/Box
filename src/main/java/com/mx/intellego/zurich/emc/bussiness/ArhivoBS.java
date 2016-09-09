package com.mx.intellego.zurich.emc.bussiness;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ArhivoBS {
	public boolean subirArhivoBox(File archivo,String nombreArchivo,String token) throws FileNotFoundException, IOException;
	public boolean crearMetadatoBox(String idObjecto,String map, String valor,String token);
	public boolean versionarBox(File archivo,String idObjecto, String token) throws FileNotFoundException;
	public String linkDescargarArchivoBox(String idArchivo,String token);
	public String linkVisualizarArchivoBox(String idArchivo, String token);
}
