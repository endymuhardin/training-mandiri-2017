package id.co.bankmandiri.internetbanking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import id.co.bankmandiri.internetbanking.dao.NasabahDao;
import id.co.bankmandiri.internetbanking.entity.Nasabah;

@Controller
@RequestMapping("/api/rest/nasabah")
public class NasabahApiController {
	
	@Autowired private NasabahDao nasabahDao;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Nasabah cariNasabahById(@PathVariable("id") Nasabah n) {
		return n;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void updateNasabahById(@PathVariable("id") String id, @RequestBody @Valid Nasabah n) {
		n.setId(id);
		nasabahDao.save(n);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteNasabahById(@PathVariable("id") String id) {
		nasabahDao.delete(id);
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public void createNasabah(@RequestBody @Valid Nasabah n) {
		nasabahDao.save(n);
	}
	
	@GetMapping("/")
	@ResponseBody
	public Iterable<Nasabah> cariSemua(){
		return nasabahDao.findAll();
	}
}
