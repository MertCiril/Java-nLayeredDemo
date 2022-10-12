package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements IProductService{
	
	private IProductDao productDao;

	public ProductManager(IProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		this.productDao.add(product);
				
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
