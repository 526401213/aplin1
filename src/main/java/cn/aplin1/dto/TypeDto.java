package cn.aplin1.dto;

public class TypeDto {
	private String typePermissionName;
	private Long typePermissionId;
	public String getTypePermissionName() {
		return typePermissionName;
	}
	public void setTypePermissionName(String typePermissionName) {
		this.typePermissionName = typePermissionName;
	}
	public Long getTypePermissionId() {
		return typePermissionId;
	}
	public void setTypePermissionId(Long typePermissionId) {
		this.typePermissionId = typePermissionId;
	}
	@Override
	public String toString() {
		return "TypeDto [typePermissionName=" + typePermissionName + ", typePermissionId=" + typePermissionId + "]";
	}
	
}
