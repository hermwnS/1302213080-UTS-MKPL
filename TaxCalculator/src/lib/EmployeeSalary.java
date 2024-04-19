package lib;

import java.time.LocalDate;

public class EmployeeSalary extends Employee {
    private boolean isForeigner;
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

    public EmployeeSalary(boolean isForeigner, int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.isForeigner = isForeigner;
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }
    
    public void setMonthlySalary(int grade) {	
	if (grade == 1) {
            monthlySalary = 3000000;
            if (isForeigner) {
		monthlySalary = (int) (3000000 * 1.5);
            }
	}else if (grade == 2) {
            monthlySalary = 5000000;
            if (isForeigner) {
		monthlySalary = (int) (3000000 * 1.5);
            }
	}else if (grade == 3) {
            monthlySalary = 7000000;
            if (isForeigner) {
		monthlySalary = (int) (3000000 * 1.5);
            }
	}
    }
    
    public void setAnnualDeductible(int deductible) {	
	this.annualDeductible = deductible;
    }
	
    public void setAdditionalIncome(int income) {	
	this.otherMonthlyIncome = income;
    }
    
    public int getAnnualIncomeTax() {
		
	//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
	LocalDate date = LocalDate.now();
		
	if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
	}else {
            monthWorkingInYear = 12;
	}
		
            return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
