package cn.aplin1.dto;

import java.util.List;

public class PermissionDto {

	private String permissionName;//type是菜单的名字2
	private Long  permissionId;//type是菜单的id2
	private Integer parentId;
	
	private List<MentPermissionDto> menus;


	
	public List<MentPermissionDto> getMenus() {
		return menus;
	}

	public void setMenus(List<MentPermissionDto> menus) {
		this.menus = menus;
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
		return "PermissionDto [permissionName=" + permissionName + ", permissionId=" + permissionId + ", parentId="
				+ parentId + ", menus=" + menus + "]";
	}

	
	
}
