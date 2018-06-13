import java.io.FileReader; 
import java.io.IOException;
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import weka.core.Instances;
import weka.core.Attribute.java;
class BusinessRule {

  public ruleChecker (Instance inst))
    throws Exception {

int EmployeeStatus = inst.attribute(0).value() ; 
int AsigneeIn/Out = inst.attribute(1).value() ; 
int IsManager?(Y/N) = inst.attribute(2).value() ; 
int HRBand = inst.attribute(3).value() ; 
int HRIWBand = inst.attribute(4).value() ; 
int DateinBand = inst.attribute(5).value() ; 
int YearsinBand = inst.attribute(6).value() ; 
int ServiceRefDate = inst.attribute(7).value() ; 
int HireDate = inst.attribute(8).value() ; 
int YearsinService = inst.attribute(9).value() ; 
int Employeehirecodelabel(Thire) = inst.attribute(10).value() ; 
int Segment = inst.attribute(11).value() ; 
int JobFamilyCode = inst.attribute(12).value() ; 
int JobFamilyDesc = inst.attribute(13).value() ; 
int JRSSSkills = inst.attribute(14).value() ; 
int ManagerNotesID = inst.attribute(15).value() ; 
int BTLFlag = inst.attribute(16).value() ; 
int PositionTitle = inst.attribute(17).value() ; 
int ReferenceSalaryMonthlyLocal = inst.attribute(18).value() ; 
int ARUSD = inst.attribute(19).value() ; 
int ARLocalCurr = inst.attribute(20).value() ; 
int PMR = inst.attribute(21).value() ; 
int CorridorCode = inst.attribute(22).value() ; 
int RangeMin = inst.attribute(23).value() ; 
int RangeMid = inst.attribute(24).value() ; 
int RangeMax = inst.attribute(25).value() ; 
int PBC2013 = inst.attribute(26).value() ; 
int PBC2014 = inst.attribute(27).value() ; 
int SalaryEffectiveDate02 = inst.attribute(28).value() ; 
int SalaryIncreaseAmount02 = inst.attribute(29).value() ; 
int SalaryIncrease%02 = inst.attribute(30).value() ; 
int Salaryincreasereason02 = inst.attribute(31).value() ; 
int SalaryEffectiveDate03 = inst.attribute(32).value() ; 
int SalaryIncreaseAmount03 = inst.attribute(33).value() ; 
int SalaryIncrease%03 = inst.attribute(34).value() ; 
int Salaryincreasereason03 = inst.attribute(35).value() ; 
int GIDestinationCountryCNUM = inst.attribute(36).value() ; 
int GIStartdate = inst.attribute(37).value() ; 
int GIplannedenddate = inst.attribute(38).value() ; 
int FromFile = inst.attribute(39).value() ; 
int CleanedCNUMs = inst.attribute(40).value() ; 
int SVF_Group = inst.attribute(41).value() ; 
int SVF_Role = inst.attribute(42).value() ; 
int SVF_Speciallty = inst.attribute(43).value() ; 
int SVF_Role_Specialty = inst.attribute(44).value() ; 
int Business_Demand = inst.attribute(45).value() ; 
int Imt = inst.attribute(46).value() ; 
int MarketValueBusinessUnitOpn = inst.attribute(47).value() ; 
int Population = inst.attribute(48).value() ; 
int MonthendDate = inst.attribute(49).value() ; 
int P2LScore = inst.attribute(50).value() ; 
int P2LCategory = inst.attribute(51).value() ; 
int DSA2015 = inst.attribute(52).value() ; 
int DSA2016 = inst.attribute(53).value() ; 
int DeepSkillsAdderCoverage(GBS) = inst.attribute(54).value() ; 
int CashRetentionStartDate = inst.attribute(55).value() ; 
int CashRetentionEndDate = inst.attribute(56).value() ; 
int Payment(LocalCurrency) = inst.attribute(57).value() ; 
int PaymentDate1 = inst.attribute(58).value() ; 
int Payment1(LocalCurrency) = inst.attribute(59).value() ; 
int CashRetentionStatus = inst.attribute(60).value() ; 
int Label = inst.attribute(61).value() ; 

 
 if ( YearsinBand <= 0.4 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand <= 0.4 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand <= 0.4 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand <= 0.4 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Dec-14 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Oct-14 and Employeehirecodelabel(Thire) = ExternalHire and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Apr-15 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Nov-14 and PBC2014 = 2 and YearsinService <= 1.3  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jul-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jul-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jul-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jul-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jul-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jul-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Aug-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Feb-15 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  )
 { 
   print ( YearsinBand > 0.4 and CorridorCode <= 14 and YearsinService > 1.9 and SalaryEffectiveDate02 = Jun-14 and HRBand <= 6.5  );
 } 
 if ( YearsinBand > 0.4 and CorridorCode > 14 and SalaryEffectiveDate02 = Dec-14 )
 { 
   print ( YearsinBand > 0.4 and CorridorCode > 14 and SalaryEffectiveDate02 = Dec-14 );
 } 
 if ( YearsinBand > 0.4 and CorridorCode > 14 and SalaryEffectiveDate02 = Dec-14 )
 { 
   print ( YearsinBand > 0.4 and CorridorCode > 14 and SalaryEffectiveDate02 = Dec-14 );
 } 
}