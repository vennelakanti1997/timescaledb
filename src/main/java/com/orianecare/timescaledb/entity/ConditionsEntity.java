/**
 * 
 */
package com.orianecare.timescaledb.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author vennelakanti
 *
 */
@Getter
@Setter
@ToString
@Table(name = "CONDITIONS")
@Entity
public class ConditionsEntity {

	@Id
	@CreationTimestamp
	@Column(name = "time", updatable = false)
	private Date timeOfMeasurement;
	
	@Column(name="location")
	private String location;
	
	@Column(name="humidity")
	private Float humidity;
	
	@Column(name = "temperature")
	private Float temperature;
}
