package com.zhangshen147.android.GuoLinWeather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 张申 on 2017/11/16 0016.
 */
public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
