package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component 
@Entity
@Table (name = "bodegas")

public class Bodega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_bodegas")
	private int idBodegas;
	@Column (name ="nombre")
	private String Nombre;
	@Column (name ="ubicacion")
	private String Ubicacion;
	@Column (name ="capacidad")
	private int Capacidad;
	@Column (name ="idSucursales")
	private int idSucurales;
	
	public Bodega() {}

	public Bodega(int idBodegas, String nombre, String ubicacion, int capacidad, int idSucurales) {
		super();
		this.idBodegas = idBodegas;
		Nombre = nombre;
		Ubicacion = ubicacion;
		Capacidad = capacidad;
		this.idSucurales = idSucurales;
	}

	public int getIdBodegas() {
		return idBodegas;
	}

	public void setIdBodegas(int idBodegas) {
		this.idBodegas = idBodegas;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	public int getIdSucurales() {
		return idSucurales;
	}

	public void setIdSucurales(int idSucurales) {
		this.idSucurales = idSucurales;
	}

	@Override
	public String toString() {
		return "Bodega [idBodegas=" + idBodegas + ", Nombre=" + Nombre + ", Ubicacion=" + Ubicacion + ", Capacidad="
				+ Capacidad + ", idSucurales=" + idSucurales + "]";
	}
	
	

}
