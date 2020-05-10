
public class CTHD {
    String SanPham;
    int SoLuong;
    double DonGia;
    int ChietKhau;

    public CTHD(String SanPham, int SoLuong, double DonGia, int ChietKhau) {
        this.SanPham = SanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }

    @Override
    public String toString() {
        return "Thông tin Chi tiết hóa đơn : Sản phẩm: " + SanPham + 
                ", số lượng: " + SoLuong + 
                ", đơn giá: " + DonGia + 
                ", chiết khấu: " + ChietKhau;
    }
}
