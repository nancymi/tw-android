package service;

import java.util.List;

import model.Area;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.Callback;
import retrofit.http.Query;

/**
 * Created by nancymi on 12/22/15.
 */
public interface AreaService {

    @GET("/api/querys/aqi_details.json?token=4esfG6UEhGzNkbszfjAp")
    Call<List<Area>> getPM25(@Query("city") String city);

}
