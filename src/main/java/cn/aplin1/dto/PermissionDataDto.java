package cn.aplin1.dto;

import java.util.List;

public class PermissionDataDto {

	private String type2PermissionName;//type是菜单的名字
	private Long  type2PermissionId;//type是菜单的id
	private Integer parentId;
	
	private List<TypeDto> type0;//type 是0
	private List<TypeDto> type1;//type是1按钮
	
	
	public Integer getParentId() {
		return parentId;
	}


	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}


	public List<TypeDto> getType1() {
		return type1;
	}


	public void setType1(List<TypeDto> type1) {
		this.type1 = type1;
	}

	public List<TypeDto> getType0() {
		return type0;
	}


	public void setType0(List<TypeDto> type0) {
		this.type0 = type0;
	}


	public String getType2PermissionName() {
		return type2PermissionName;
	}


	public void setType2PermissionName(String type2PermissionName) {
		this.type2PermissionName = type2PermissionName;
	}


	public Long getType2PermissionId() {
		return type2PermissionId;
	}


	public void setType2PermissionId(Long type2PermissionId) {
		this.type2PermissionId = type2PermissionId;
	}

	@Override
	public String toString() {
		return "PermissionDataDto [type2PermissionName=" + type2PermissionName + ", type2PermissionId="
				+ type2PermissionId + ", type1=" + type1 + ", type0=" + type0 + "]";
	}
	
}
