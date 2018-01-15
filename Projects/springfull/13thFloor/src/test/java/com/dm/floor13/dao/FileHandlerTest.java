/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.floor13.dao;

import com.dm.floor13.exceptions.MissingFileException;
import com.dm.floor13.exceptions.FileSkipException;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Danimaetrix
 */
public class FileHandlerTest {


    public FileHandlerTest() {
    }


//    @Test
//    public void testWriteAllOrdersToFile() throws Exception {
//        String dir = rootDir+"/test_files";
//
//        FileHandler files = new FileHandler();
//        List<Order> orders = new ArrayList<>();
//
//        orders = files.readAllOrders(dir, orderNumberLength);
//
//        files.writeAllOrders(orders, rootDir + "/test_files/output/output_data.csv");
//
//        List<Order> ordersFromOutput = files.readAllOrders(rootDir + "/test_files/output",orderNumberLength);
//
//        assertEquals(orders.get(0).hashCode(), ordersFromOutput.get(0).hashCode());
//        assertTrue(orders.get(0).equals(ordersFromOutput.get(0)));
//
//    }
//

}
