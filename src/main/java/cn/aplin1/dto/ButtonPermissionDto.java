package cn.aplin1.dto;

public class ButtonPermissionDto {

	private String permissionName;//
	private Long  permissionId;//
	private Integer parentId;
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public Long getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "ButtonPermissionDto [permissionName=" + permissionName + ", permissionId=" + permissionId
				+ ", parentId=" + parentId + "]";
	}
	
}
