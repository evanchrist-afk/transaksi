package ui.ft.ccit.faculty.transaksi.transaksi;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DetailTransaksiId implements Serializable {

    private String kodeTransaksi;
    private Long idBarang;

    public DetailTransaksiId() {}

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetailTransaksiId)) return false;
        DetailTransaksiId that = (DetailTransaksiId) o;
        return Objects.equals(kodeTransaksi, that.kodeTransaksi)
            && Objects.equals(idBarang, that.idBarang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kodeTransaksi, idBarang);
    }
}
