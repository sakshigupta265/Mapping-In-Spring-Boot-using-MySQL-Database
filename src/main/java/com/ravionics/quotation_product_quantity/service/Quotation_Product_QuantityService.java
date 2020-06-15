package com.ravionics.quotation_product_quantity.service;

import java.util.List;
import com.ravionics.quotation_product_quantity.entity.Quotation_Product_Quantity;

public interface Quotation_Product_QuantityService {

	public String createQuotation_Product_Quantity(Quotation_Product_Quantity quot) throws Exception;

	public Quotation_Product_Quantity getQuotation_Product_Quantity(int quotId);

	public List<Quotation_Product_Quantity> getAllQuotation_Product_Quantity();

	public Quotation_Product_Quantity updateQuotation_Product_Quantity(Quotation_Product_Quantity quot);

	public void deleteQuotation_Product_Quantity(int quotId);

}
