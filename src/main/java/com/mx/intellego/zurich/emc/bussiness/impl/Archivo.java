package com.mx.intellego.zurich.emc.bussiness.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.box.sdk.BoxAPIConnection;
import com.box.sdk.BoxFile;
import com.box.sdk.BoxFileVersion;
import com.box.sdk.BoxFolder;
import com.box.sdk.BoxSharedLink;
import com.box.sdk.Metadata;
import com.mx.intellego.zurich.emc.bussiness.ArhivoBS;

public class Archivo implements ArhivoBS{
	File pdfInput = new File("C:/Hola.pdf");
	
	public boolean subirArhivoBox(File archivo,String nombreArchivo,String token) throws IOException{
		//Subir un archivo
		boolean resultado = false;
		try {
			BoxAPIConnection api = new BoxAPIConnection(token);
			//Ruta del archivo
			BoxFolder rootFolder = BoxFolder.getRootFolder(api);
			FileInputStream stream = new FileInputStream(archivo);
			rootFolder.uploadFile(stream,nombreArchivo );
			stream.close();
			resultado =true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

	
	public boolean crearMetadatoBox(String idArchivo, String map, String valor, String token) {
		// TODO M�todo para crear un metadato a un archivo en box.
		boolean resultado = false;
		try {
			BoxAPIConnection api = new BoxAPIConnection(token);
			//Ruta del archivo
			BoxFolder rootFolder = BoxFolder.getRootFolder(api);
			BoxFile file = new BoxFile(api, idArchivo);
			file.createMetadata(new Metadata().add(map, valor));
			resultado = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

	
	public boolean versionarBox(File archivo,String idArchivo, String token) throws FileNotFoundException {
		// Metodo para versionar un documento dado su id.
		boolean resultado = false;
		try {
			BoxAPIConnection api = new BoxAPIConnection(token);
			//Ruta del archivo
			BoxFolder rootFolder = BoxFolder.getRootFolder(api);
			BoxFile file = new BoxFile(api,idArchivo);
			FileInputStream stream = new FileInputStream(archivo);
			file.uploadVersion(stream);
			resultado = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public String linkVisualizarArchivoBox(String idArchivo, String token){
		//Metodo para publicar un link para un archivo
		String resultado = "";
		try {
			BoxAPIConnection api = new BoxAPIConnection(token);
			//Ruta del archivo
			BoxFolder rootFolder = BoxFolder.getRootFolder(api);
			BoxFile file = new BoxFile(api, idArchivo);
			BoxSharedLink.Permissions permissions = new BoxSharedLink.Permissions();
			permissions.setCanDownload(true);
			permissions.setCanPreview(true);
			Date unshareDate = new Date();
			BoxSharedLink sharedLink = file.createSharedLink(BoxSharedLink.Access.OPEN, null, permissions);
			resultado = sharedLink.getURL();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public String linkDescargarArchivoBox(String idArchivo,String token){
		String link = "";
		//TODO: Método para descargar un archivo
		try {
			BoxAPIConnection api = new BoxAPIConnection(token);
			//Ruta del archivo
			BoxFolder rootFolder = BoxFolder.getRootFolder(api);
			BoxFile file = new BoxFile(api, idArchivo);
			BoxFile.Info info = file.getInfo();

			FileOutputStream stream = new FileOutputStream(info.getName());
			file.download(stream);
			link = file.getDownloadURL().toString();
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return link;
	}
}
