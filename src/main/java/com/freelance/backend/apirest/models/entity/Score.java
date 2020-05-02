package com.freelance.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "scores")
public class Score implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_score")
	private Long id;
	
	
	private Integer medallaOro;
	private Integer medallaPlata;
	private Integer medallaBronce;
	private Integer puntuacion;
	

	@OneToOne(mappedBy = "score")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMedallaOro() {
		return medallaOro;
	}
	public void setMedallaOro(Integer medallaOro) {
		this.medallaOro = medallaOro;
	}
	public Integer getMedallaPlata() {
		return medallaPlata;
	}
	public void setMedallaPlata(Integer medallaPlata) {
		this.medallaPlata = medallaPlata;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Integer getMedallaBronce() {
		return medallaBronce;
	}
	public void setMedallaBronce(Integer medallaBronce) {
		this.medallaBronce = medallaBronce;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
