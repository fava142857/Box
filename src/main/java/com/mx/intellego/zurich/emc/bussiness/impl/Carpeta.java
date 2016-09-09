package com.mx.intellego.zurich.emc.bussiness.impl;

import com.box.sdk.BoxAPIConnection;
import com.box.sdk.BoxFile;
import com.box.sdk.BoxFolder;
import com.box.sdk.Metadata;
import com.mx.intellego.zurich.emc.bussiness.CarpetaBS;


public class Carpeta implements CarpetaBS{
	
	
	public boolean crearCaperta(String ubicacion,String token,String nombreCarperta){
		//TODO: Crear carperta
		boolean resultado=false;
		try {
			BoxAPIConnection api = new BoxAPIConnection(token);
			BoxFolder parentFolder = new BoxFolder(api, ubicacion);
			BoxFolder.Info childFolderInfo = parentFolder.createFolder(nombreCarperta);
			resultado = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	
	public boolean crearMetadatosCarpeta(String idCarpeta, String map, String valor, String token){
		// TODO Metodo para asignarle un metadato a una carpeta
		boolean resultado=false;
		try {
			// TODO M�todo para crear un metadato a un archivo en box.
			BoxAPIConnection api = new BoxAPIConnection(token);
			//Ruta del archivo
			BoxFolder rootFolder = BoxFolder.getRootFolder(api);
			BoxFile file = new BoxFile(api, idCarpeta);
			file.createMetadata(new Metadata().add("/foo", valor));
			resultado =  true;
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
		}
		return resultado;
	}
	
	
}
