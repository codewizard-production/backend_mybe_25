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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.mybe.repository.TrainingRepository;
import com.app.mybe.repository.PerformanceAppraisalRepository;
import com.app.mybe.repository.OrganizationRepository;
import com.app.mybe.repository.EmployeePersonalInfoRepository;
import com.app.mybe.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
