package ui.ft.ccit.faculty.transaksi.transaksi;

import jakarta.persistence.*;

@Entity
@Table(name = "detail_transaksi")
public class DetailTransaksi {

    @EmbeddedId
    private DetailTransaksiId id;

    @ManyToOne
    @MapsId("kodeTransaksi")
    @JoinColumn(name = "kode_transaksi")
    private Transaksi transaksi;

    @Column(name = "jumlah")
    private Integer jumlah;

    public DetailTransaksiId getId() {
        return id;
    }

    public void setId(DetailTransaksiId id) {
        this.id = id;
    }

    public Transaksi getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
