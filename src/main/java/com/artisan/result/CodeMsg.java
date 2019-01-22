package com.artisan.result;

import lombok.Getter;

public class CodeMsg {

	@Getter
	private int code;
	@Getter
	private String msg;

	// 通用异常
	public static CodeMsg SUCCESS = new CodeMsg(0, "success");
	public static CodeMsg SERVER_ERROR = new CodeMsg(-1, "服务端异常");

	private CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

//	public int getCode() {
//		return code;
//	}
//	public String getMsg() {
//		return msg;
//	}
}
