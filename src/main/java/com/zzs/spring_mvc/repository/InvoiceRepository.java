package com.zzs.spring_mvc.repository;

import com.zzs.spring_mvc.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
