package cn.aplin1.common;



import java.io.Serializable;

import org.springframework.ui.ModelMap;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) 
public class ResponseResult  implements Serializable{
	private static final long serialVersionUID = 1L;

	public ResponseResult(ResponseEnum code, String message){
		this.code = code.getCode();
		this.message = message;
	}
	public ResponseResult(Object result) {
		this.result = result;
	}
	public ResponseResult(Object result, CommonPage page) {
		this.result = result;
		this.page = page;
	}

	public ResponseResult(ResponseEnum code, String message, Object result) {
		this.code = code.getCode();
		this.message = message;
		this.result = result;
	}
	public ResponseResult(ResponseEnum code, String message, Object result, CommonPage page) {
		this.code = code.getCode();
		this.message = message;
		this.page = page;
		this.result = result;
	}
	public ResponseResult(String message, Object result) {
		this.message = message;
		this.result = result;
	}
	public ResponseResult(String message, Object result, CommonPage page) {
		this.message = message;
		this.page = page;
		this.result = result;
	}
	
	//----------------------属性------------------
	private Integer code = 0;
	private String message = null;
	private Object result = null;
	private CommonPage page = null;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public CommonPage getPage() {
		return page;
	}
	public void setPage(CommonPage page) {
		this.page = page;
	} 
	public String toFtl(ModelMap model, String url){
		
		return url;
	}
	public String toFtlForError(ModelMap model){
		
		return "error";
	}
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
	
}
