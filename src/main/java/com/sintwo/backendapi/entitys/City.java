package com.sintwo.backendapi.entitys;

public class City {
    int id;
    String cityname;
    String citycode;

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCityname()
	{
		return this.cityname;
	}

	public void setCityname(String cityname)
	{
		this.cityname = cityname;
	}

	public String getCitycode()
	{
		return this.citycode;
	}

	public void setCitycode(String citycode)
	{
		this.citycode = citycode;
	}

}