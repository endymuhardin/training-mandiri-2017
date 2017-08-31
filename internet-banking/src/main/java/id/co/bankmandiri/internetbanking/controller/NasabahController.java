package id.co.bankmandiri.internetbanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nasabah")
public class NasabahController {
	
	@GetMapping("/list")
	public ModelMap daftarNasabah(){
		return new ModelMap();
	}
	
	@GetMapping("/form")
	public ModelMap tampilkanForm() {
		return new ModelMap();
	}
	
	@PostMapping("/form")
	public String prosesForm() {
		return "redirect:list";
	}
}
