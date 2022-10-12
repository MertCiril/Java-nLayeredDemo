package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		/*ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		normal dizi de add işlemi yapılmaz bunun için arraylist kullanılır
		*/
		IProductService productService = new ProductManager(new HibernateProductDao());
		
		Product product = new Product(1,1,"Elma",12,50);
		productService.add(product);
		Product product2 = new Product(1,2,"Armut",12,50);
		productService.add(product2);
		
		

	}

}
