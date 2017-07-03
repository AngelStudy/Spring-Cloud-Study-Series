package com.jeestudy.hct.conditional;

/**
 * 
 * @Title:WindowsCmdService.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:09:04
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class WindowsCmdService implements CmdService {

	@Override
	public String getShowCmd() {
		return "ls";
	}

}
