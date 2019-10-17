/**
 * 
 */
package com.telefonica.product.manager;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.product.constant.ProductConstant;
import com.telefonica.product.mapper.IProductMapperDAO;
import com.telefonica.product.model.ProductModel;

/**
 * @author asish
 *
 */
@Component
public class ProductManager {
	
	private static Log log = LogFactory.getLog(ProductManager.class);
	IProductMapperDAO productMapperDAO;
	
	@Autowired
	public ProductManager(IProductMapperDAO productMapperDAO) {
		this.productMapperDAO = productMapperDAO;
	}

	public String createProductTable() {
		log.info(ProductConstant.START+"::"+ProductConstant.PRODUCTMANAGER+"::"+ProductConstant.CREATETABLE);
		productMapperDAO.createProductTable();
		return null;
		
	}

	public List<ProductModel> getProductData(String productType) {
		log.info(ProductConstant.START+"::"+ProductConstant.PRODUCTMANAGER+"::"+ProductConstant.GETDATA);
		return productMapperDAO.getData(productType);
		
	}

	public Boolean addProduct(ProductModel product) {
		log.info(ProductConstant.START+"::"+ProductConstant.PRODUCTMANAGER+"::"+ProductConstant.ADDDATA);
		return productMapperDAO.insertData(product);
	}

	public Boolean removeProduct(Long id) {
		log.info(ProductConstant.START+"::"+ProductConstant.PRODUCTMANAGER+"::"+ProductConstant.REMOVEPRODUCT);
		return productMapperDAO.removeProduct(id);
	}

	public List<ProductModel> getAllProductData() {
		log.info(ProductConstant.START+"::"+ProductConstant.PRODUCTMANAGER+"::"+ProductConstant.GETALLDATA);
		return productMapperDAO.getAllProductData();
	}

	
	
}
