package id.co.bankmandiri.internetbanking.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import id.co.bankmandiri.internetbanking.entity.Nasabah;

public interface NasabahDao extends PagingAndSortingRepository<Nasabah, String>{
	
}
