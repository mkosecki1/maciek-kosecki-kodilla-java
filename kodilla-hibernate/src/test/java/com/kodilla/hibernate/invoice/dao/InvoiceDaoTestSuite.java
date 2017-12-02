package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("laptop");
        Product product2 = new Product("PC");
        Product product3 = new Product("keyboard");

        Item item1 = new Item(product1,new BigDecimal(3500.0),2,new BigDecimal(7000.0));
        Item item2 = new Item(product2,new BigDecimal(2500.0),3,new BigDecimal(7500.0));
        Item item3 = new Item(product3,new BigDecimal(220.0),10,new BigDecimal(2200.0));

        Invoice invoice = new Invoice("1/12/2017");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1,id);
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
