package lib;

public class Employee {

	private String employeeId;
	private String fullName;
	private String address;
	private Gender gender; //true = Laki-laki, false = Perempuan
        
        public enum Gender {
            Laki_laki, Perempuan;
        }
	
	public Employee(String employeeId, String fullName, String address, Gender gender) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.address = address;
		this.gender = gender;
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
}
