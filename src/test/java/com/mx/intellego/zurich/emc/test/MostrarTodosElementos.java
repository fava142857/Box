package com.mx.intellego.zurich.emc.test;

import com.box.sdk.BoxAPIConnection;
import com.box.sdk.BoxFolder;
import com.box.sdk.BoxItem;

public class MostrarTodosElementos {
	public static void main(String[] args) {
		BoxAPIConnection api = new BoxAPIConnection("tmOOyxAojemGPd46TqlRxbKlxwLLXnL2");
		//Ruta del archivo
		BoxFolder rootFolder = BoxFolder.getRootFolder(api);
		
		//Conocer los archivos que hay
		for (BoxItem.Info itemInfo : rootFolder) {
		    System.out.format("[%s] %s\n", itemInfo.getID(), itemInfo.getName());
		}
	}
}
