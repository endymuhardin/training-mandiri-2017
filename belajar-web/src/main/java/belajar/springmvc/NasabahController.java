package belajar.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import belajar.spring.jdbc.NasabahDao;

@Controller
public class NasabahController {
	@Autowired private NasabahDao nasabahDao;
	
	@GetMapping("/nasabah/list")
	public ModelMap tampilkanDataNasabah() {
		ModelMap mm = new ModelMap();
		mm.addAttribute("dataNasabah", nasabahDao.cariSemuaNasabah());
		return mm;
	}
	
	@GetMapping("/nasabah/form")
	public void tampilkanForm() {
		
	}
}
