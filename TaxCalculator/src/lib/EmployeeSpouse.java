package lib;

import java.util.LinkedList;
import java.util.List;

public class EmployeeSpouse extends Employee {
    private String spouseName;
    private String spouseIdNumber;
    private String idNumber;
    
    private List<String> childNames;
    private List<String> childIdNumbers;

    public EmployeeSpouse(String spouseName, String spouseIdNumber, String idNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
        this.idNumber = idNumber;
        
        childNames = new LinkedList<String>();
	childIdNumbers = new LinkedList<String>();
    }
    
    public void setSpouse(String spouseName, String spouseIdNumber) {
	this.spouseName = spouseName;
        this.spouseIdNumber = idNumber;
    }
	
    public void addChild(String childName, String childIdNumber) {
	childNames.add(childName);
	childIdNumbers.add(childIdNumber);
    }
}
