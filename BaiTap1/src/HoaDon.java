import java.util.ArrayList;


public class HoaDon {
    HoaDonHeader TTChung;
    ArrayList<CTHD> TTChiTiet;


    protected HoaDon(HoaDonBuilder builder) {
        this.TTChung = builder.TTChung;
        this.TTChiTiet = builder.TTChiTiet;
    }

    @Override
    public String toString() {

        String s = TTChung.toString();
        for (CTHD ct : TTChiTiet) {
            s += "\n" + ct.toString();
        }
        return s;
        //return "Thông tin hóa đơn: [Thông Tin chung : " + TTChung + ", Thông tin chi tiết=" + TTChiTiet + "]";
    }

    public static class HoaDonBuilder
    {
        HoaDonHeader TTChung;
        ArrayList<CTHD> TTChiTiet;

        public HoaDonBuilder()
        {
            this.TTChiTiet = new ArrayList<>();
        }

        public HoaDonBuilder setTTC(HoaDonHeader TTChung)
        {
            this.TTChung = TTChung;
            return this;
        }

        public HoaDonBuilder addTTCT(CTHD TTCT)
        {
            this.TTChiTiet.add(TTCT);
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        } 

        
    }


    
    

}