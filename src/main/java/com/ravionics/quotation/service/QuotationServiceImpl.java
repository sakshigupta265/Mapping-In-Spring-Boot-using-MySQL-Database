package com.ravionics.quotation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravionics.quotation.entity.Quotation;
import com.ravionics.quotation.repository.QuotationRepository;

@Service
public class QuotationServiceImpl implements QuotationService {

	@Autowired
	private QuotationRepository quotationRepository;

	@Override
	public String createQuotation(Quotation quot) throws Exception {

		quotationRepository.save(quot);

		int quotId = quot.getQuotation_id();

		return "Quotation with quotation Id " + quotId + " Created!";
	}

	@Override
	public Quotation getQuotation(int quotId) {
		Optional<Quotation> optionalQuotation = quotationRepository.findById(quotId);
		if (optionalQuotation.isPresent()) {
			return optionalQuotation.get();
		}
		return null;
	}

	@Override
	public List<Quotation> getAllQuotations() {
		return quotationRepository.findAll();
	}

	@Override
	public Quotation updateQuotation(Quotation quot) {
		return quotationRepository.save(quot);
	}

	@Override
	public void deleteQuotation(int quotId) {
		quotationRepository.deleteById(quotId);
	}
}