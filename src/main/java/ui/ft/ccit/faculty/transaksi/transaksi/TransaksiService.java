package ui.ft.ccit.faculty.transaksi.transaksi;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransaksiService {

    private final TransaksiRepository transaksiRepository;

    public TransaksiService(TransaksiRepository transaksiRepository) {
        this.transaksiRepository = transaksiRepository;
    }

    public List<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    public Transaksi findById(String id) {
        return transaksiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaksi tidak ditemukan"));
    }

    public Transaksi save(Transaksi transaksi) {
        return transaksiRepository.save(transaksi);
    }

    public void delete(String id) {
        transaksiRepository.deleteById(id);
    }
}
