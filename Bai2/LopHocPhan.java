import java.util.ArrayList;

public class LopHocPhan {
	String maLHP,tenLHP,tenGV,thongTinLopHoc;
	ArrayList <SinhVien> dsSV = new ArrayList <SinhVien>();
	public int getSoLuong() {
		return 0;
	}
	public String toString() {
		return " Ma lop hoc phan : "+maLHP+", Ten lop hoc phan : "+tenLHP+", Ten Giang Vien : "+ tenGV + ", Thong tin lop hoc : "+thongTinLopHoc;
	}
	public LopHocPhan(String maLHP,String tenLHP,String tenGV,String thongTinLopHoc,ArrayList <SinhVien> dsSV ) {
		this.maLHP = maLHP;
		this.tenLHP = tenLHP;
		this.tenGV = tenGV;
		this.thongTinLopHoc = thongTinLopHoc;
		this.dsSV = dsSV;
	}
	public String getMaLHP() {
		return maLHP;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public ArrayList <SinhVien> dsSV (){
		return dsSV;
	}
	public String getTenGV() {
		return tenGV;
	}
	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}
	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	public void setDsSV(ArrayList <SinhVien> dsSV) {
		this.dsSV = dsSV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc = thongTinLopHoc;
	}
}
