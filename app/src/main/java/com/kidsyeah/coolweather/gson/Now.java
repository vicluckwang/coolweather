package com.kidsyeah.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "now": {
 *         "cond_code": "501",
 *         "cond_txt": "雾",
 *         "fl": "8",
 *         "hum": "94",
 *         "pcpn": "0",
 *         "pres": "1018",
 *         "tmp": "9",
 *         "vis": "2",
 *         "wind_deg": "48",
 *         "wind_dir": "东北风",
 *         "wind_sc": "微风",
 *         "wind_spd": "7"
 *         }
 */

public class Now {

    public String cond_code;
    public String cond_txt;
    public String fl;
    public String hum;
    public String pcpn;
    public String pres;
    public String tmp;
    public String vis;
    public String wind_deg;
    public String wind_dir;
    public String wind_sc;
    public String wind_spd;

}
