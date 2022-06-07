package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.ABCProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile ��z�lecek
		ProductService productService = new ProductManager(new ABCProductDao(), new jLoggerManagerAdapter());
		
		Product product = new Product(2,2,"Elma",12,50);
		productService.add(product);
	}

}