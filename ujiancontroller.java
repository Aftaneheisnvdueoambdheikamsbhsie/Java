import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UjianController {
    @GetMapping("/ujian")
    public Ujian getUjianData() {
        Ujian ujian = new Ujian();
        ujian.setNama("Andi");
        ujian.setNIM("5302414023");
        ujian.setNilai(90);
        return ujian;
    }
}
