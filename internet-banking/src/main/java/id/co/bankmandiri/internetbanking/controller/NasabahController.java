package id.co.bankmandiri.internetbanking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import id.co.bankmandiri.internetbanking.dao.NasabahDao;
import id.co.bankmandiri.internetbanking.entity.Nasabah;

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
	public ModelMap tampilkanForm(@RequestParam(required=false, value="id") Nasabah n) {
		if(n == null) {
			n = new Nasabah();
		}
		return new ModelMap("nasabah", n);
	}
	
	@PostMapping("/form")
	public String prosesForm(@ModelAttribute @Valid Nasabah n, BindingResult errors, SessionStatus status) {
		if(errors.hasErrors()) {
			return "nasabah/form";
		}
		nasabahDao.save(n);
		status.setComplete();
		return "redirect:list";
	}
}
