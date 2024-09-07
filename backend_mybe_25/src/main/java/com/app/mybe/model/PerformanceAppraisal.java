package com.app.mybe.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
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
import com.app.mybe.converter.DurationConverter;
import com.app.mybe.converter.UUIDToByteConverter;
import com.app.mybe.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "PerformanceAppraisal")
@Table(name = "\"PerformanceAppraisal\"", schema =  "\"mybe\"")
@Data
                        
public class PerformanceAppraisal {
	public PerformanceAppraisal () {   
  }
	  
  @Column(name = "\"Quarter\"", nullable = true )
  private String quarter;
  
	  
  @Column(name = "\"Date\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date date;  
  
	  
  @Column(name = "\"EmployeeNotes\"", nullable = true )
  private String employeeNotes;
  
	  
  @Column(name = "\"ManagerComments\"", nullable = true )
  private String managerComments;
  
	  
  @Column(name = "\"HikePercentage\"", nullable = true )
  private String hikePercentage;
  
	  
  @Column(name = "\"AppraisalRating\"", nullable = true )
  private String appraisalRating;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"AppraisalID\"", nullable = true )
  private Integer appraisalID;
	  
  @Column(name = "\"Promotion\"", nullable = true )
  private Boolean promotion;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PerformanceAppraisal [" 
  + "Quarter= " + quarter  + ", " 
  + "Date= " + date  + ", " 
  + "EmployeeNotes= " + employeeNotes  + ", " 
  + "ManagerComments= " + managerComments  + ", " 
  + "HikePercentage= " + hikePercentage  + ", " 
  + "AppraisalRating= " + appraisalRating  + ", " 
  + "AppraisalID= " + appraisalID  + ", " 
  + "Promotion= " + promotion 
 + "]";
	}
	
}