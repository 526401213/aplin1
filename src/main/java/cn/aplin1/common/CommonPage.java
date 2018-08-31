package cn.aplin1.common;
/**
 * 公共分页
 * @author MC_BaLaBaLa
 *
 */
public class CommonPage {

	private int pageIndex=1;//当前页
	private int pageSize=10;//每页记录数
	
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
}
