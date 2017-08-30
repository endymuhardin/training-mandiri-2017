package belajar.springmvc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HaloController {
	
	@GetMapping("/halo")
	public ModelMap halo() {
		System.out.println("Menjalankan method halo");
		ModelMap mm = new ModelMap();
		mm.addAttribute("waktu", new Date());
		return mm;
	}
}
