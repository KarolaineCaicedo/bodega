package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column (name ="Nombre")
	private String Nombre;
	@Column (name ="Ubicación")
	private String Ubicacion;
	@Column (name ="Capacidad")
	private int Capacidad;
	
	@Column (name ="idSucursales")
	private int idSucurales;
	
//	@JoinColumn(name= "idSucursales")
//	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//	private Sucursales sucursal;
	
	
	
	
	public Bodega() {}

	public Bodega(int idBodegas, String nombre, String ubicacion, int capacidad) {
		
		this.idBodegas = idBodegas;
		this.Nombre = nombre;
		this.Ubicacion = ubicacion;
		this.Capacidad = capacidad;
		//this.idSucurales = idSucurales;
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
		this.Nombre = nombre;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.Ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.Capacidad = capacidad;
	}

	public int getIdSucurales() {
		return idSucurales;
	}

	// Inyección de dependencias (dato temporal) luego se aplicará DI en el entitie "Sucursal"
	public void setIdSucurales(int idSucurales) {
		this.idSucurales = idSucurales;
	}
	
	

	@Override
	public String toString() {
		return "Bodega [idBodegas=" + idBodegas + ", Nombre=" + Nombre + ", Ubicacion=" + Ubicacion + ", Capacidad="
				+ Capacidad + ", idSucurales=" + idSucurales + "]";
	}
	
	

}
