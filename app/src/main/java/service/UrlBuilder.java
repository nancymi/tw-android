package service;

/**
 * Created by nancymi on 12/20/15.
 */
public class UrlBuilder {

    private static final String PM25_URL = "http://www.pm25.in/api/querys/aqi_details.json";

    private static final String PM25_TOKEN = "4esfG6UEhGzNkbszfjAp";

    private String area;

    private StringBuilder pm25Url;

    private UrlBuilder serviceUrlBuilder;

    public UrlBuilder() {
        serviceUrlBuilder = new UrlBuilder();
    }

    public UrlBuilder area(String area) {
        this.area = area;
        return this;
    }

    public String build() {
        pm25Url = new StringBuilder("");
        pm25Url.append(PM25_URL)
                .append("&")
                .append(PM25_TOKEN)
                .append("&")
                .append(this.area);

        return pm25Url.toString();
    }
}
