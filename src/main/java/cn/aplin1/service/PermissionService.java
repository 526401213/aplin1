package cn.aplin1.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.aplin1.common.CommonPage;
import cn.aplin1.dao.PermissionMapper;
import cn.aplin1.domain.Permission;
import cn.aplin1.domain.PermissionExample;
import cn.aplin1.dto.ButtonPermissionDto;
import cn.aplin1.dto.MentPermissionDto;
import cn.aplin1.dto.PermissionDataDto;
import cn.aplin1.dto.PermissionDto;
import cn.aplin1.dto.TypeDto;

@Service
public class PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
	
	public void add(Permission permission) {
		permissionMapper.insertSelective(permission);
	}
	
	
	public PageInfo<Permission> getListByPage(String name,CommonPage commonPage) {
		PageHelper.startPage(commonPage.getPageIndex(), commonPage.getPageSize());
		PermissionExample example=new PermissionExample();
		if(StringUtils.isNotBlank(name)) {
			example.createCriteria().andNameLike(name);
		}
		
		List<Permission> list = permissionMapper.selectByExample(example);
		String s="";
		for (Permission permission : list) {
			if(permission.getType()==0) {
				s="菜单";
			}
			if(permission.getType()==1) {
				s="按钮";
			}
			if(permission.getType()==2) {
				s="目录";
			}
			permission.setTypeStr(s);
		}
		
		return new PageInfo<>(list);
	}


	public void deleteById(Long id) {
		int deleteByPrimaryKey = permissionMapper.deleteByPrimaryKey(id);
		System.out.println(deleteByPrimaryKey);
	}
	
	public List<Permission> getAll(){
		PermissionExample example=new PermissionExample();
		List<Permission> selectByExample = permissionMapper.selectByExample(example);
		return selectByExample;
	}


	/**
	 * 权限数据
	 * @return
	 */
	public List<PermissionDataDto> getPermissionData() {
		List<PermissionDataDto> dtos=new ArrayList<>();
		
		List<Permission> byParent = getByParentId(0);
	
		for (Permission permission : byParent) {
			PermissionDataDto dataDto=new PermissionDataDto();
			dataDto.setType2PermissionId(permission.getId());
			dataDto.setType2PermissionName(permission.getName());
			List<TypeDto> type0=new ArrayList<>();//菜单
			List<TypeDto> type1=new ArrayList<>();//按钮
			
			
			List<Permission> types0 = getByParentId(Integer.parseInt(String.valueOf(permission.getId())));
			if(types0.size()==0) {
				dtos.add(dataDto);
				continue;
			}
			for (Permission permission0 : types0) {
				TypeDto typeDto0=new TypeDto();
				typeDto0.setTypePermissionId(permission0.getId());
				typeDto0.setTypePermissionName(permission0.getName());
				typeDto0.setParentId(permission0.getParentId());
				type0.add(typeDto0);
				
				dataDto.setType0(type0);
				
				List<Permission> types1 = getByParentId(Integer.parseInt(String.valueOf(permission0.getId())));
				if(types1.size()==0) {
					
					dtos.add(dataDto);
					
					continue;
				}
				for (Permission permission1 : types1) {
					TypeDto typeDto1=new TypeDto();
					typeDto1.setTypePermissionName(permission1.getName());
					typeDto1.setTypePermissionId(permission1.getId());
					typeDto1.setParentId(permission1.getParentId());
					type1.add(typeDto1);
					dataDto.setType1(type1);
					
				}
			}
			dtos.add(dataDto);
		}
		
		System.out.println(dtos);
		return dtos;
	}
	
	public List<Permission> getByParentId(Integer parentId){
		PermissionExample example=new PermissionExample();
		example.createCriteria().andParentIdEqualTo(parentId);
		return permissionMapper.selectByExample(example);
	}


	public List<PermissionDto> getPermissionData2() {
		List<PermissionDto> result=new ArrayList<>();
		List<Permission> mulu = getByParentId(0);
		for (Permission permission : mulu) {
			PermissionDto r=new PermissionDto();
			r.setParentId(permission.getParentId());
			r.setPermissionId(permission.getId());
			r.setPermissionName(permission.getName());
			List<Permission> caidans = getByParentId(Integer.parseInt(String.valueOf(permission.getId())));
			List<MentPermissionDto> caidanDtos=new ArrayList<>();
			if(caidans== null) {
				break;
			}
			MentPermissionDto caidan=null;
			for (Permission mentPermissionDto : caidans) {
				 caidan=new MentPermissionDto();
				 caidan.setParentId(mentPermissionDto.getParentId());
				 caidan.setPermissionId(mentPermissionDto.getId());
				 caidan.setPermissionName(mentPermissionDto.getName());
				 
				 //按钮
				 List<Permission> buttons = getByParentId(Integer.parseInt(String.valueOf(mentPermissionDto.getId())));
				 if(buttons == null) {
					 break;
				 }
				 List<ButtonPermissionDto> buttonsDto=new ArrayList<>();
				 for (Permission permission2 : buttons) {
					 ButtonPermissionDto buttonDto=new ButtonPermissionDto();
					 buttonDto.setParentId(permission2.getParentId());
					 buttonDto.setPermissionId(permission2.getId());
					 buttonDto.setPermissionName(permission2.getName());
					 buttonsDto.add(buttonDto);
				 }
				 caidan.setButtons(buttonsDto);
				 caidanDtos.add(caidan);
			}
			r.setMenus(caidanDtos);//菜单
			
			result.add(r);
			
		}
		System.out.println(result);
		return result;
	}
	
}
