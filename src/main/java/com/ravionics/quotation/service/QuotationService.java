package com.ravionics.quotation.service;

import java.util.List;

import com.ravionics.quotation.entity.Quotation;

public interface QuotationService {

	public String createQuotation(Quotation quot) throws Exception;

	public Quotation updateQuotation(Quotation quot);

	public Quotation getQuotation(int quotId);

	public void deleteQuotation(int quotId);

	public List<Quotation> getAllQuotations();
}
