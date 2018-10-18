package com.kidsyeah.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 *             "basic": {
 *                 "cid": "CN101010100",
 *                 "location": "北京",
 *                 "parent_city": "北京",
 *                 "admin_area": "北京",
 *                 "cnty": "中国",
 *                 "lat": "39.90498734",
 *                 "lon": "116.40528870",
 *                 "tz": "8.0"
 *             }
 */

public class Basic {

    public String cid;

    public String location;

    public String parent_city;

    public String admin_area;

    public String cnty;

    public String lat;

    public String lon;

    public String tz;

}
