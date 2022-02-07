/**
 * 
 */
package com.orianecare.timescaledb.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orianecare.timescaledb.entity.ConditionsEntity;

/**
 * @author vennelakanti
 *
 */
@Repository
public interface ConditionsRepo extends JpaRepository<ConditionsEntity, Date> {

}
