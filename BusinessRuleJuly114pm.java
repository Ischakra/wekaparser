package weka.train; 
 
import java.io.FileReader; 
import java.io.IOException;
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import weka.core.Instances;
import weka.core.Instance;
 
 
public class BusinessRule {

  public ruleChecker (Instance inst)
    throws Exception {

double EmployeeStatus = inst.value(0) ; 
double AsigneeIn/Out = inst.value(1) ; 
double IsManager?(Y/N) = inst.value(2) ; 
double HRBand = inst.value(3) ; 
double HRIWBand = inst.value(4) ; 
double DateinBand = inst.value(5) ; 
double YearsinBand = inst.value(6) ; 
double ServiceRefDate = inst.value(7) ; 
double HireDate = inst.value(8) ; 
double YearsinService = inst.value(9) ; 
double Employeehirecodelabel(Thire) = inst.value(10) ; 
double Segment = inst.value(11) ; 
double JobFamilyCode = inst.value(12) ; 
double JobFamilyDesc = inst.value(13) ; 
double JRSSSkills = inst.value(14) ; 
double ManagerNotesID = inst.value(15) ; 
double BTLFlag = inst.value(16) ; 
double PositionTitle = inst.value(17) ; 
double ReferenceSalaryMonthlyLocal = inst.value(18) ; 
double ARUSD = inst.value(19) ; 
double ARLocalCurr = inst.value(20) ; 
double PMR = inst.value(21) ; 
double CorridorCode = inst.value(22) ; 
double RangeMin = inst.value(23) ; 
double RangeMid = inst.value(24) ; 
double RangeMax = inst.value(25) ; 
double PBC2013 = inst.value(26) ; 
double PBC2014 = inst.value(27) ; 
double SalaryEffectiveDate02 = inst.value(28) ; 
double SalaryIncreaseAmount02 = inst.value(29) ; 
double SalaryIncrease%02 = inst.value(30) ; 
double Salaryincreasereason02 = inst.value(31) ; 
double SalaryEffectiveDate03 = inst.value(32) ; 
double SalaryIncreaseAmount03 = inst.value(33) ; 
double SalaryIncrease%03 = inst.value(34) ; 
double Salaryincreasereason03 = inst.value(35) ; 
double GIDestinationCountryCNUM = inst.value(36) ; 
double GIStartdate = inst.value(37) ; 
double GIplannedenddate = inst.value(38) ; 
double FromFile = inst.value(39) ; 
double CleanedCNUMs = inst.value(40) ; 
double SVF_Group = inst.value(41) ; 
double SVF_Role = inst.value(42) ; 
double SVF_Speciallty = inst.value(43) ; 
double SVF_Role_Specialty = inst.value(44) ; 
double Business_Demand = inst.value(45) ; 
double Imt = inst.value(46) ; 
double MarketValueBusinessUnitOpn = inst.value(47) ; 
double Population = inst.value(48) ; 
double MonthendDate = inst.value(49) ; 
double P2LScore = inst.value(50) ; 
double P2LCategory = inst.value(51) ; 
double DSA2015 = inst.value(52) ; 
double DSA2016 = inst.value(53) ; 
double DeepSkillsAdderCoverage(GBS) = inst.value(54) ; 
double CashRetentionStartDate = inst.value(55) ; 
double CashRetentionEndDate = inst.value(56) ; 
double Payment(LocalCurrency) = inst.value(57) ; 
double PaymentDate1 = inst.value(58) ; 
double Payment1(LocalCurrency) = inst.value(59) ; 
double CashRetentionStatus = inst.value(60) ; 
double Label = inst.value(61) ; 

 
 if ( YearsinBand <= 0.4 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand <= 0.4 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand <= 0.4 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand <= 0.4 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Dec-14 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Oct-14 && Employeehirecodelabel(Thire) = ExternalHire && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Apr-15 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Nov-14 && PBC2014 = 2 && YearsinService <= 1.3  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jul-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jul-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jul-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jul-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jul-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jul-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Aug-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Feb-15 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode <= 14 && YearsinService > 1.9 && SalaryEffectiveDate02 = Jun-14 && HRBand <= 6.5  )  ;
 } 
else if( YearsinBand > 0.4 && CorridorCode > 14 && SalaryEffectiveDate02 = Dec-14 )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode > 14 && SalaryEffectiveDate02 = Dec-14 )  ;
 } 
 else ( YearsinBand > 0.4 && CorridorCode > 14 && SalaryEffectiveDate02 = Dec-14 )
 { 
    System.out.println ( YearsinBand > 0.4 && CorridorCode > 14 && SalaryEffectiveDate02 = Dec-14 )  ;
 } 
}}