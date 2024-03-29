/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nva.services;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 *
 * @author Nguyen Ky
 */
public class InvoiceServicesTest {
    
    

    
    HoaDonServices hd_sv = new HoaDonServices();
    PhieuMuaHangServices pmh_sv = new PhieuMuaHangServices();
    /**
     * Test of thongKeTongTienTheoThoiGianTuyChinh method, of class HoaDonServices.
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data_invoices.csv", numLinesToSkip = 1)
    public void testThongKeTongThuTheoThoiGianTuyChinh(String thoiGianBatDau, String thoiGianKetThuc, int expectOutput) {
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
    @ParameterizedTest
    @CsvFileSource(resources = "/data_invoices2.csv", numLinesToSkip = 1)
    public void testThongKeTongThuTheoThang(String thang, String nam, int expResult) {
        File file = new File(getClass().getResource("/data_invoices2.csv").getFile());
        assertTrue(file.exists(), "CSV file does not exist");
        System.out.println("thongKeTheoThang");
        HoaDonServices instance = new HoaDonServices();
        int result = instance.thongKeTheoThang(thang, nam);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of thongKeTheoNam method, of class HoaDonServices.
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/data_invoices3.csv", numLinesToSkip = 1)
    public void testThongKeTongThuTheoNam(String nam, int expResult) {
        File file = new File(getClass().getResource("/data_invoices3.csv").getFile());
        assertTrue(file.exists(), "CSV file does not exist");
        System.out.println("thongKeTheoNam");
        HoaDonServices instance = new HoaDonServices();
        int result = instance.thongKeTheoNam(nam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "/data_invoices3.csv", numLinesToSkip = 1)
    public void testThongKeTheoNam(String nam, int expectOutput1,int expectOutput2) {
        File file = new File(getClass().getResource("/data_invoices3.csv").getFile());
        assertTrue(file.exists(), "CSV file does not exist");
        
        int result1 = hd_sv.thongKeTheoNam(nam);
        int result2 = pmh_sv.thongKeTheoNam(nam);
        assertEquals(expectOutput1, result1);
        assertEquals(expectOutput2, result2);

        // TODO review the generated test code and remove the default call to fail.
//        fail("Thời gian bắt đầu phải nhỏ hơn thời gian kết thúc!");
    }
    
}
