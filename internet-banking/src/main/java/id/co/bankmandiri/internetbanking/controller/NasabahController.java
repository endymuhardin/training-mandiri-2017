package id.co.bankmandiri.internetbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import id.co.bankmandiri.internetbanking.dao.NasabahDao;

@Controller
@RequestMapping("/nasabah")
public class NasabahController {
	
	@Autowired
	private NasabahDao nasabahDao;
	
	@GetMapping("/list")
	public ModelMap daftarNasabah(Pageable page){
		return new ModelMap().addAttribute("dataNasabah", nasabahDao.findAll(page));
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
