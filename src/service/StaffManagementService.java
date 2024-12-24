package service;

import java.sql.Time;
import java.time.LocalTime;

import data_access_object.StaffDAO;
import model.Staff;

public class StaffManagementService {
	

	

	/**
	 * Xóa nhân viên đã có trong HashMap và list hiện tại của chương trình
	 * 
	 * Hàm sẽ xóa nhân viên khỏi map và list
	 * 
	 * @param staff cần xóa
	 * @return {@code true} nếu thành công {@code false} nếu thất bại
	 * @throws Không ném ngoại lệ
	 */
	public static boolean deleteStaff(Staff staff) {
		StaffDAO.map.remove(staff.getStaffID());
		return StaffDAO.list.remove(staff);
	}
}