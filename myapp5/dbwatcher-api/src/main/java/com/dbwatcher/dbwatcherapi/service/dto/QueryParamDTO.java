package com.dbwatcher.dbwatcherapi.service.dto;
import java.io.Serializable;

public class QueryParamDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String param1;
    private String param2;
    private String param3;
    private String param4;

	public QueryParamDTO(String param1, String param2, String param3, String param4) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
	}
	
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public String getParam3() {
		return param3;
	}
	public void setParam3(String param3) {
		this.param3 = param3;
	}
	public String getParam4() {
		return param4;
	}
	public void setParam4(String param4) {
		this.param4 = param4;
	}
    
	@Override
	public String toString() {
		return "QueryParamDTO [param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4=" + param4
				+ "]";
	}
}
