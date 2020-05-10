import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        HoaDon hoaDon1 = new HoaDon.HoaDonBuilder()
                        .setTTC(new HoaDonHeader("HD01",new SimpleDateFormat("dd/mm/yyyy").parse("5/10/2020"),"Phạm Văn Niên"))
                        .addTTCT(new CTHD("Đồng hồ Rolex",1,100000000, 10))
                        .addTTCT(new CTHD("Giày Gucci",1,1000000000, 10))
                        .addTTCT(new CTHD("Bao tay cá sấu",1,200000000, 10))
                        .build();
        System.out.println(hoaDon1.toString() + "\n");

        HoaDon hoaDon2 = new HoaDon.HoaDonBuilder()
                        .setTTC(new HoaDonHeader("HD02",new SimpleDateFormat("dd/mm/yyyy").parse("6/10/2020"),"Châu Bá Thông"))
                        .addTTCT(new CTHD("Áo Superme",10,100000000, 10))
                        .addTTCT(new CTHD("Giày Gucci",1,1000000000, 10))
                        .addTTCT(new CTHD("Quần jean",20,200000000, 10))
                        .build();
        System.out.println(hoaDon2.toString()+ "\n");

    }
}
