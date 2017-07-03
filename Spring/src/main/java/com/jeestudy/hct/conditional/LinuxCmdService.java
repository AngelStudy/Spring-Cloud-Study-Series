package com.jeestudy.hct.conditional;

/**
 * 
 * @Title:LinuxCmdService.java
 * @Auth:Angel
 * @Date:2017年7月3日下午3:08:49
 * @WebSite:www.jeestudy.com
 * @Email:chengtai_he@163.com
 * @Description:
 */
public class LinuxCmdService implements CmdService {

	@Override
	public String getShowCmd() {
		return "dir";
	}

}
