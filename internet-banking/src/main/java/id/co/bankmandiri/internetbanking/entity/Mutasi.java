package id.co.bankmandiri.internetbanking.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Mutasi {
	
	@Id @GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
		)
	private String id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="id_rekening")
	private Rekening rekening;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date waktuTransaksi;
	
	@NotNull @NotEmpty
	private String keterangan;
	
	@NotNull @Min(0)
	private BigDecimal debet;
	
	@NotNull @Min(0)
	private BigDecimal kredit;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Rekening getRekening() {
		return rekening;
	}

	public void setRekening(Rekening rekening) {
		this.rekening = rekening;
	}

	public Date getWaktuTransaksi() {
		return waktuTransaksi;
	}

	public void setWaktuTransaksi(Date waktuTransaksi) {
		this.waktuTransaksi = waktuTransaksi;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public BigDecimal getDebet() {
		return debet;
	}

	public void setDebet(BigDecimal debet) {
		this.debet = debet;
	}

	public BigDecimal getKredit() {
		return kredit;
	}

	public void setKredit(BigDecimal kredit) {
		this.kredit = kredit;
	}
	
	
}
