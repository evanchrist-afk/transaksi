package ui.ft.ccit.faculty.transaksi.transaksi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaksi")
public class TransaksiController {

    private final TransaksiService transaksiService;

    public TransaksiController(TransaksiService transaksiService) {
        this.transaksiService = transaksiService;
    }

    @GetMapping
    public List<Transaksi> getAll() {
        return transaksiService.findAll();
    }

    @GetMapping("/{id}")
    public Transaksi getById(@PathVariable String id) {
        return transaksiService.findById(id);
    }

    @PostMapping
    public Transaksi create(@RequestBody Transaksi transaksi) {
        return transaksiService.save(transaksi);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        transaksiService.delete(id);
    }
}
