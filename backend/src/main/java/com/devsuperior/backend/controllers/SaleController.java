package com.devsuperior.backend.controllers;

import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.services.SaleService;
import com.devsuperior.backend.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService SmsService;

    @GetMapping
    public Page<Sale> findSale(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                               @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                               Pageable pageable) {
        return service.findSale(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id) {
        SmsService.sendSms(id);
    }
}
