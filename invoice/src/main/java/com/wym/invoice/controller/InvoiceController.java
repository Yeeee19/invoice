package com.wym.invoice.controller;

import com.wym.invoice.service.InvoiceService;
import com.wym.invoice.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InvoiceController extends BaseController{

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping("/qryWinningList*")
    public String qryWinningList(String invTerm){
        System.out.println(invTerm);
        return invoiceService.qryWinningListService(invTerm);
    }

}
