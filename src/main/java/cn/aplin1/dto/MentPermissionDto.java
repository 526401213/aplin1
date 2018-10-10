package cn.aplin1.dto;

import java.util.List;

public class MentPermissionDto {

	private String permissionName;//
	private Long  permissionId;//
	private Integer parentId;
	
	private List<ButtonPermissionDto> buttons;
	
	
	
	public List<ButtonPermissionDto> getButtons() {
		return buttons;
	}
	public void setButtons(List<ButtonPermissionDto> buttons) {
		this.buttons = buttons;
	}
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
		return "MentPermissionDto [permissionName=" + permissionName + ", permissionId=" + permissionId + ", parentId="
				+ parentId + ", buttons=" + buttons + "]";
	}
	
}
