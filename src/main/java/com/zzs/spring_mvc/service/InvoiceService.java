package com.zzs.spring_mvc.service;

import com.zzs.spring_mvc.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);
}
