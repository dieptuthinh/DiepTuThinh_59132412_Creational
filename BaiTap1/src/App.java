import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        HoaDon hoaDon = new HoaDon.HoaDonBuilder()
                        .setTTC(new HoaDonHeader("HD01",new SimpleDateFormat("dd/mm/yyyy").parse("5/10/2020"),"Phạm Văn Niên"))
                        .addTTCT(new CTHD("Đồng hồ Rolex",1,100000000, 10))
                        .addTTCT(new CTHD("Giày Gucci",1,1000000000, 10))
                        .addTTCT(new CTHD("Bao tay cá sấu",1,200000000, 10))
                        .build();
        System.out.println(hoaDon.toString());

    }
}
