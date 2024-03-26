/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testservices;

import com.nva.pojo.KhachHang;
import com.nva.services.KhachHangServices;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 *
 * @author ASUS
 */
public class UnitTest_KhachHangServices {
    KhachHangServices kh_S = new KhachHangServices();

    @ParameterizedTest
    @CsvFileSource(resources = "/data1_khachhang.csv", numLinesToSkip = 1)
    public void testKiemTraDuLieuKhachHangHopLe(String soDienThoai, String ho, String ten, int expectOutput) {
        File file = new File(getClass().getResource("/data1_khachhang.csv").getFile());
        assertTrue(file.exists(), "CSV file does not exist");
        
        KhachHang kh = new KhachHang();
        kh.setMaKhachHang(soDienThoai);
        kh.setHoKhachHang(ho);
        kh.setTenKhachHang(ten);

        assertEquals(expectOutput, kh_S.kiemTraDuLieuHopLe(kh));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/data2_khachhang.csv", numLinesToSkip = 1)
    public void testKiemTraKhachHangTonTai(String soDienThoai, boolean expectOutput) {
        assertEquals(expectOutput, kh_S.kiemTraKhachHangTonTai(soDienThoai));
    }
    
}
