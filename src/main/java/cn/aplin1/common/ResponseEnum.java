package cn.aplin1.common;





public enum ResponseEnum implements BaseEnum<Integer>{
	/**
	 * 返回成功
	 */
	RESULT_SUCCESS(ResponseResultConstants.RESULT_SUCCESS),
	/**
	 * 返回失败
	 */
	RESULT_FAIL(ResponseResultConstants.RESULT_FAIL),
	/**
	 * 参数错误
	 */
	RESULT_PARAM_ERR(ResponseResultConstants.RESULT_ERROR);
	
	
	private final int code;
    private ResponseEnum(int code) {
        this.code = code;
    }
	public Integer getCode() {
		return code;
	}

	
}
