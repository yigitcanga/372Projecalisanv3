package org.proje.jdbc.model;

public class KurumGiderleri {

    String  giderId,
            gider,
            tutar,
            kurumId;

    public KurumGiderleri(String giderId, String gider, String tutar, String kurumId) {
        this.giderId = giderId;
        this.gider = gider;
        this.tutar = tutar;
        this.kurumId = kurumId;
    }

    public KurumGiderleri() {
    }

    public String getGiderId() {
        return giderId;
    }

    public void setGiderId(String giderId) {
        this.giderId = giderId;
    }

    public String getGider() {
        return gider;
    }

    public void setGider(String gider) {
        this.gider = gider;
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        this.tutar = tutar;
    }

    public String getKurumId() {
        return kurumId;
    }

    public void setKurumId(String kurumId) {
        this.kurumId = kurumId;
    }

    @Override
    public String toString() {
        return "KurumGiderleri{" +
                "giderId='" + giderId + '\'' +
                ", gider='" + gider + '\'' +
                ", tutar='" + tutar + '\'' +
                ", kurumId='" + kurumId + '\'' +
                '}';
    }
}
