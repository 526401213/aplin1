package cn.aplin1.common;



public interface ResponseResultMessage {

	/**
	 * 修改成功
	 */
	public static final String UPDATE_SUCCESS = "修改成功";
	/**
	 * 添加成功
	 */
	public static final String INSERT_SUCCESS = "添加成功";
	/**
	 * 删除成功
	 */
	public static final String DELETE_SUCCESS = "删除成功";
	/**
	 * 查询成功
	 */
	public static final String QUERY_SUCCESS="查询成功";
	/**
	 * 邮箱错误
	 */
	public static final String EMAIL_ERR="邮箱错误";
	/**
	 * 参数错误
	 */
	public static final String PARAM_ERR="参数错误";
	/**
	 * 未知错误
	 */
	public static final String UNKNOWN_ERR="未知错误";
	/**
	 * 执行成功没有返回数据
	 */
	public static final String ISNULL="执行成功没有返回数据";
	/**
	 * 图片非法或尺寸太大
	 */
	public static final String IMG_ERR="图片非法或图片过大最大1M";
}
