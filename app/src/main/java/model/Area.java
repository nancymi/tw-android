package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by nancymi on 12/20/15.
 * 数据结构：
 *   aqi: 200,
     area: "西安",
     co: 1.747,
     co_24h: 2.281,
     no2: 72,
     no2_24h: 79,
     o3: 16,
     o3_24h: 16,
     o3_8h: 11,
     o3_8h_24h: 11,
     pm10: 215,
     pm10_24h: 239,
     pm2_5: 150,
     pm2_5_24h: 157,
     position_name: "高压开关厂",
     primary_pollutant: "细颗粒物(PM2.5)",
     quality: "中度污染",
     so2: 65,
     so2_24h: 72,
     station_code: "1462A",
     time_point: "2015-12-22T13:00:00Z"
 */
public class Area implements Serializable {
    @SerializedName("position_name")
    private String positionName;

    @SerializedName("quality")
    private String quality;

    @SerializedName("area")
    private String area;

    @SerializedName("pm2_5")
    private String pm25;

    public String getPositionName() {
        return positionName;
    }

    public String getQuality() {
        return quality;
    }

    public String getPm25() {
        return pm25;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "position_name : " + positionName
                + "\nquality : " + quality + "\n";
    }
}
