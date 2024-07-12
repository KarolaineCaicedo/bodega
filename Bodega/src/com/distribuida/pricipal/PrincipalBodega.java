package com.distribuida.pricipal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.BodegaDAO;

import com.distribuida.entities.Bodega;




public class PrincipalBodega  {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BodegaDAO bodegaDao = context.getBean("bodegaDAOImpl" , BodegaDAO.class);
		
		// add
		Bodega bodega= new Bodega (0,"lulú","Costa Rica", 15);
		//***** existe la DI (Inyección de Dependencias)
		bodega.setIdSucurales(3);
		//bodega.setSucursal(sucursalDAO.findOne(3)); 
		//bodegaDao.add(bodega);
		// up
		Bodega bodega2= new Bodega(5,"Carcasa","xd", 12);
		//bodega2.setIdSucurales(2);
		//bodegaDao.up(bodega2);
		// del
		//bodegaDao.del(5);
		// findOne
		System.out.println("******************* DEL *******************"+bodegaDao.findOne(1));
		// findAll
		bodegaDao.findAll().forEach(item -> {System.out.println(item.toString());});
		//List<Bodega> Bodegas= BodegaDao.findAll();
		//Bodegas.forEach(item -> {
			//System.out.println(item.toString());		
		context.close();
	}

}
