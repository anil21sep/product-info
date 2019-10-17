/**
 * 
 */
package com.telefonica.product.mapper;

import java.util.List;

/**
 * @author asish
 *
 */
import org.apache.ibatis.annotations.*;

import com.telefonica.product.model.ProductModel;


@Mapper
public interface IProductMapperDAO {
	
	
	@Insert("create table if not exists product (Id bigint IDENTITY  (1,1) primary key not null, ProductType varchar(255),Price double,"
			+ "ProductName varchar(255))")
	public void createProductTable();
	
	@Insert("insert into product(productname,price,producttype) values(#{productName},#{price},#{productType})")
	public Boolean  insertData(ProductModel product);
	
	@Select("select * from product where producttype =#{productType}")
	public List<ProductModel> getData(String productType);

	@Delete("Delete from product where id=#{id}")
	public Boolean removeProduct(Long id);

	@Select("select * from product")
	public List<ProductModel> getAllProductData();

}
