package com.mv.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private Long id;

    private String name;

    private Integer dutyId;

    private String duty;

    private Integer departmentId;

    private String department;

    private Integer higherDepartmentId;

    private String higherDepartment;

    private Long leaderId;

    private String leader;

    private Integer inOffice;

    private Integer officeStatus;

    private Integer infomationType;

    private String emergencyContact;

    private String relationship;

    private String contactNumber;

    private Integer laborType;

    private String employingUnit;

    private String employeeNumber;

    private String rankCode;

    private String icNumber;

    private String locatioinCity;

    private Integer companyLive;

    private Integer employeeAreaId;

    private String employeeArea;

    private Date inductionDate;

    private Date positiveDate;

    private Date actualPositiveDate;

    private Integer employmentType;

    private Date internshipDate;

    private Integer nationality;

    private String email;

    private String trialPeriod;

    private Date trialDate;

    private Date trainingDate;

    private Date arrivalDate;

    private Integer age;

    private Integer workingYears;

    private String mainBody;

    private String picUrl;

    private Integer maritalStatus;

    private Integer education;

    private Integer politicsStatus;

    private Integer physicalCondition;

    private String companyMobile;

    private String privateMobile;

    private String shortPhone;

    private String qq;

    private String webchat;

    private String phone;

    private String nativePlace;

    private Date birthday;

    private Integer sex;

    private String national;

    private Integer nativeType;

    private Integer identityType;

    private String identityNumber;

    private Date identityIssuingDate;

    private Date identityMaturityDate;

    private String identityAddress;

    private String currentAddress;

    private BigDecimal jobYeas;

    private Integer englishLevel;

    private String professionalLanguage;

    private String qualificationCertificate;

    private Integer criminalRecord;

    private Integer personnelType;

    private Integer developDirection;

    private String skills;

    private String applyJob;

    private Long personalInterviewerId;

    private String personalInterviewer;

    private Long jobInterviewerId;

    private String jobInterviewer;

    private String interviewerOpinion;

    private Integer introduce;

    private Long introducerId;

    private String introducer;

    private String relation;

    private Integer introduceDeptId;

    private String introduceDept;

    private Integer introduceDutyId;

    private String introduceDuty;

    private Integer departureType;

    private Date applyDate;

    private String reason;

    private Date departureDate;

    private Integer liability;

    private String interviewRecord;

    private Integer ext1;

    private Integer ext2;

    private String ext3;

    private String ext4;

    private String traceId;

    private Integer enabledFlag;

    private String createdBy;

    private Date creationDate;

    private String updatedBy;

    private Date updationDate;

    private Integer departureStatus;

    private String orgCode;

    private Integer messageFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getHigherDepartmentId() {
        return higherDepartmentId;
    }

    public void setHigherDepartmentId(Integer higherDepartmentId) {
        this.higherDepartmentId = higherDepartmentId;
    }

    public String getHigherDepartment() {
        return higherDepartment;
    }

    public void setHigherDepartment(String higherDepartment) {
        this.higherDepartment = higherDepartment == null ? null : higherDepartment.trim();
    }

    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public Integer getInOffice() {
        return inOffice;
    }

    public void setInOffice(Integer inOffice) {
        this.inOffice = inOffice;
    }

    public Integer getOfficeStatus() {
        return officeStatus;
    }

    public void setOfficeStatus(Integer officeStatus) {
        this.officeStatus = officeStatus;
    }

    public Integer getInfomationType() {
        return infomationType;
    }

    public void setInfomationType(Integer infomationType) {
        this.infomationType = infomationType;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Integer getLaborType() {
        return laborType;
    }

    public void setLaborType(Integer laborType) {
        this.laborType = laborType;
    }

    public String getEmployingUnit() {
        return employingUnit;
    }

    public void setEmployingUnit(String employingUnit) {
        this.employingUnit = employingUnit == null ? null : employingUnit.trim();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode == null ? null : rankCode.trim();
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber == null ? null : icNumber.trim();
    }

    public String getLocatioinCity() {
        return locatioinCity;
    }

    public void setLocatioinCity(String locatioinCity) {
        this.locatioinCity = locatioinCity == null ? null : locatioinCity.trim();
    }

    public Integer getCompanyLive() {
        return companyLive;
    }

    public void setCompanyLive(Integer companyLive) {
        this.companyLive = companyLive;
    }

    public Integer getEmployeeAreaId() {
        return employeeAreaId;
    }

    public void setEmployeeAreaId(Integer employeeAreaId) {
        this.employeeAreaId = employeeAreaId;
    }

    public String getEmployeeArea() {
        return employeeArea;
    }

    public void setEmployeeArea(String employeeArea) {
        this.employeeArea = employeeArea == null ? null : employeeArea.trim();
    }

    public Date getInductionDate() {
        return inductionDate;
    }

    public void setInductionDate(Date inductionDate) {
        this.inductionDate = inductionDate;
    }

    public Date getPositiveDate() {
        return positiveDate;
    }

    public void setPositiveDate(Date positiveDate) {
        this.positiveDate = positiveDate;
    }

    public Date getActualPositiveDate() {
        return actualPositiveDate;
    }

    public void setActualPositiveDate(Date actualPositiveDate) {
        this.actualPositiveDate = actualPositiveDate;
    }

    public Integer getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(Integer employmentType) {
        this.employmentType = employmentType;
    }

    public Date getInternshipDate() {
        return internshipDate;
    }

    public void setInternshipDate(Date internshipDate) {
        this.internshipDate = internshipDate;
    }

    public Integer getNationality() {
        return nationality;
    }

    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTrialPeriod() {
        return trialPeriod;
    }

    public void setTrialPeriod(String trialPeriod) {
        this.trialPeriod = trialPeriod == null ? null : trialPeriod.trim();
    }

    public Date getTrialDate() {
        return trialDate;
    }

    public void setTrialDate(Date trialDate) {
        this.trialDate = trialDate;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    public String getMainBody() {
        return mainBody;
    }

    public void setMainBody(String mainBody) {
        this.mainBody = mainBody == null ? null : mainBody.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(Integer politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public Integer getPhysicalCondition() {
        return physicalCondition;
    }

    public void setPhysicalCondition(Integer physicalCondition) {
        this.physicalCondition = physicalCondition;
    }

    public String getCompanyMobile() {
        return companyMobile;
    }

    public void setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile == null ? null : companyMobile.trim();
    }

    public String getPrivateMobile() {
        return privateMobile;
    }

    public void setPrivateMobile(String privateMobile) {
        this.privateMobile = privateMobile == null ? null : privateMobile.trim();
    }

    public String getShortPhone() {
        return shortPhone;
    }

    public void setShortPhone(String shortPhone) {
        this.shortPhone = shortPhone == null ? null : shortPhone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat == null ? null : webchat.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    public Integer getNativeType() {
        return nativeType;
    }

    public void setNativeType(Integer nativeType) {
        this.nativeType = nativeType;
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    public Date getIdentityIssuingDate() {
        return identityIssuingDate;
    }

    public void setIdentityIssuingDate(Date identityIssuingDate) {
        this.identityIssuingDate = identityIssuingDate;
    }

    public Date getIdentityMaturityDate() {
        return identityMaturityDate;
    }

    public void setIdentityMaturityDate(Date identityMaturityDate) {
        this.identityMaturityDate = identityMaturityDate;
    }

    public String getIdentityAddress() {
        return identityAddress;
    }

    public void setIdentityAddress(String identityAddress) {
        this.identityAddress = identityAddress == null ? null : identityAddress.trim();
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
    }

    public BigDecimal getJobYeas() {
        return jobYeas;
    }

    public void setJobYeas(BigDecimal jobYeas) {
        this.jobYeas = jobYeas;
    }

    public Integer getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(Integer englishLevel) {
        this.englishLevel = englishLevel;
    }

    public String getProfessionalLanguage() {
        return professionalLanguage;
    }

    public void setProfessionalLanguage(String professionalLanguage) {
        this.professionalLanguage = professionalLanguage == null ? null : professionalLanguage.trim();
    }

    public String getQualificationCertificate() {
        return qualificationCertificate;
    }

    public void setQualificationCertificate(String qualificationCertificate) {
        this.qualificationCertificate = qualificationCertificate == null ? null : qualificationCertificate.trim();
    }

    public Integer getCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(Integer criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public Integer getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(Integer personnelType) {
        this.personnelType = personnelType;
    }

    public Integer getDevelopDirection() {
        return developDirection;
    }

    public void setDevelopDirection(Integer developDirection) {
        this.developDirection = developDirection;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills == null ? null : skills.trim();
    }

    public String getApplyJob() {
        return applyJob;
    }

    public void setApplyJob(String applyJob) {
        this.applyJob = applyJob == null ? null : applyJob.trim();
    }

    public Long getPersonalInterviewerId() {
        return personalInterviewerId;
    }

    public void setPersonalInterviewerId(Long personalInterviewerId) {
        this.personalInterviewerId = personalInterviewerId;
    }

    public String getPersonalInterviewer() {
        return personalInterviewer;
    }

    public void setPersonalInterviewer(String personalInterviewer) {
        this.personalInterviewer = personalInterviewer == null ? null : personalInterviewer.trim();
    }

    public Long getJobInterviewerId() {
        return jobInterviewerId;
    }

    public void setJobInterviewerId(Long jobInterviewerId) {
        this.jobInterviewerId = jobInterviewerId;
    }

    public String getJobInterviewer() {
        return jobInterviewer;
    }

    public void setJobInterviewer(String jobInterviewer) {
        this.jobInterviewer = jobInterviewer == null ? null : jobInterviewer.trim();
    }

    public String getInterviewerOpinion() {
        return interviewerOpinion;
    }

    public void setInterviewerOpinion(String interviewerOpinion) {
        this.interviewerOpinion = interviewerOpinion == null ? null : interviewerOpinion.trim();
    }

    public Integer getIntroduce() {
        return introduce;
    }

    public void setIntroduce(Integer introduce) {
        this.introduce = introduce;
    }

    public Long getIntroducerId() {
        return introducerId;
    }

    public void setIntroducerId(Long introducerId) {
        this.introducerId = introducerId;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public Integer getIntroduceDeptId() {
        return introduceDeptId;
    }

    public void setIntroduceDeptId(Integer introduceDeptId) {
        this.introduceDeptId = introduceDeptId;
    }

    public String getIntroduceDept() {
        return introduceDept;
    }

    public void setIntroduceDept(String introduceDept) {
        this.introduceDept = introduceDept == null ? null : introduceDept.trim();
    }

    public Integer getIntroduceDutyId() {
        return introduceDutyId;
    }

    public void setIntroduceDutyId(Integer introduceDutyId) {
        this.introduceDutyId = introduceDutyId;
    }

    public String getIntroduceDuty() {
        return introduceDuty;
    }

    public void setIntroduceDuty(String introduceDuty) {
        this.introduceDuty = introduceDuty == null ? null : introduceDuty.trim();
    }

    public Integer getDepartureType() {
        return departureType;
    }

    public void setDepartureType(Integer departureType) {
        this.departureType = departureType;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getLiability() {
        return liability;
    }

    public void setLiability(Integer liability) {
        this.liability = liability;
    }

    public String getInterviewRecord() {
        return interviewRecord;
    }

    public void setInterviewRecord(String interviewRecord) {
        this.interviewRecord = interviewRecord == null ? null : interviewRecord.trim();
    }

    public Integer getExt1() {
        return ext1;
    }

    public void setExt1(Integer ext1) {
        this.ext1 = ext1;
    }

    public Integer getExt2() {
        return ext2;
    }

    public void setExt2(Integer ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId == null ? null : traceId.trim();
    }

    public Integer getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(Integer enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }

    public Integer getDepartureStatus() {
        return departureStatus;
    }

    public void setDepartureStatus(Integer departureStatus) {
        this.departureStatus = departureStatus;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Integer getMessageFlag() {
        return messageFlag;
    }

    public void setMessageFlag(Integer messageFlag) {
        this.messageFlag = messageFlag;
    }
}