package com.mx.intellego.zurich.emc.bussiness;

public interface CarpetaBS {
	public boolean crearCaperta(String ubicacion,String token,String nombreCarperta);
	public boolean crearMetadatosCarpeta(String idCarpeta, String map, String valor, String token);
}
