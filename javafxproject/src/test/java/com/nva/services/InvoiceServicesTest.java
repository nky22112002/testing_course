/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nva.services;

import java.io.File;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 *
 * @author Nguyen Ky
 */
public class InvoiceServicesTest {
    
    

    
    HoaDonServices hd_sv = new HoaDonServices();
    /**
     * Test of thongKeTongTienTheoThoiGianTuyChinh method, of class HoaDonServices.
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data_invoices.csv", numLinesToSkip = 1)
    public void testThongKeTongTienTheoThoiGianTuyChinh(String thoiGianBatDau, String thoiGianKetThuc, int expectOutput) {
        File file = new File(getClass().getResource("/data_invoices.csv").getFile());
        assertTrue(file.exists(), "CSV file does not exist");
        
        int result = hd_sv.thongKeTongTienTheoThoiGianTuyChinh(thoiGianBatDau, thoiGianKetThuc);
        assertEquals(expectOutput, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("Thời gian bắt đầu phải nhỏ hơn thời gian kết thúc!");
    }

    /**
     * Test of thongKeTheoThang method, of class HoaDonServices.
     */
    @Test
    public void testThongKeTheoThang() {
        System.out.println("thongKeTheoThang");
        String thang = "";
        String nam = "";
        HoaDonServices instance = new HoaDonServices();
        int expResult = 0;
        int result = instance.thongKeTheoThang(thang, nam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thongKeTheoNam method, of class HoaDonServices.
     */
    @Test
    public void testThongKeTheoNam() {
        System.out.println("thongKeTheoNam");
        String nam = "";
        HoaDonServices instance = new HoaDonServices();
        int expResult = 0;
        int result = instance.thongKeTheoNam(nam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
