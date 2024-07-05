package com.distribuida.pricipal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.BodegaDAO;
import com.distribuida.dao.BodegaDAO;
import com.distribuida.entities.Bodega;
import com.distribuida.entities.Bodega;



public class PrincipalBodega  {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Bodega BodegaDao = (Bodega) context.getBean("BodegaDaoImpl" , BodegaDAO.class);
		Bodega Bodega= new Bodega (0,"lulú","Costa Rica", "1500", "20");
		((BodegaDAO) BodegaDao).add(Bodega);
		Bodega Bodega2= new Bodega(0,"Carcasa","xd", "1200", "22");
		((BodegaDAO) BodegaDao).up(Bodega2);
		//BodegaDao.del(1);
		System.out.println("******************* DEL *******************"+((BodegaDAO) BodegaDao).findOne(1));
		((BodegaDAO) BodegaDao).findAll().forEach(item -> {System.out.println(item.toString());});
		//List<Bodega> Bodegas= BodegaDao.findAll();
		//Bodegas.forEach(item -> {
			//System.out.println(item.toString());

 
		
		context.close();
	}

}
