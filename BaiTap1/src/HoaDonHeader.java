import java.text.SimpleDateFormat;
import java.util.Date;


public class HoaDonHeader {
    String MaHoaDon;
    Date NgayBan;
    String TenKH;

    public HoaDonHeader(String MaHoaDon, Date NgayBan, String TenKH) {
        this.MaHoaDon = MaHoaDon;
        this.NgayBan = NgayBan;
        this.TenKH = TenKH;
    }

    @Override
    public String toString() {
        return "Thông tin chung của hóa đơn:  " + "Mã hóa đơn: " + MaHoaDon + 
                ", Ngày bán: " + new SimpleDateFormat("dd/mm/yyyy").format(NgayBan)  + 
                ", Tên khách hàng: " + TenKH ;
    }

    

    

}
