package com.innvo.repository;

import com.innvo.domain.Pathwaycountermeasurembr;

import org.springframework.data.jpa.repository.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Spring Data JPA repository for the Pathwaycountermeasurembr entity.
 */
@SuppressWarnings("unused")
public interface PathwaycountermeasurembrRepository extends JpaRepository<Pathwaycountermeasurembr,Long> {
	
	List<Pathwaycountermeasurembr> findByPathwayIdAndScenarioId(long pathwayId,long scenarioId);

	List<Pathwaycountermeasurembr> findByPathwayIdAndScenarioIdAndParentInstance(long pathwayId,long scenarioId,String instance);

	
	Pathwaycountermeasurembr findByScenarioIdAndCountermeasureIdAndPathwayId(long scenarioId,long countermeasurId,long pathwayId);

	
	@Transactional
	void deleteByScenarioIdAndCountermeasureIdAndPathwayId(long scenarioId,long countermeasurId,long pathwayId);
}
