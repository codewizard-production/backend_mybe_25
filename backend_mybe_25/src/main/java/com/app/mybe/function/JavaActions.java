package com.app.mybe.function;

import com.app.mybe.model.PerformanceAppraisal;
import com.app.mybe.model.Organization;
import com.app.mybe.model.Training;
import com.app.mybe.model.EmployeePersonalInfo;
import com.app.mybe.model.EmlpoyeeProfile;




import com.app.mybe.enums.EmploymentType;
import com.app.mybe.enums.OrgDept;
import com.app.mybe.enums.TrainingLevel;
import com.app.mybe.enums.OrgBranch;
import com.app.mybe.converter.OrgBranchConverter;
import com.app.mybe.converter.TrainingLevelConverter;
import com.app.mybe.converter.EmploymentTypeConverter;
import com.app.mybe.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  