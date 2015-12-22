package service;

import android.content.Context;
import android.util.Log;

import java.util.List;

import animation.DialogAction;
import db.PMDataPref;
import model.Area;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import utils.PMSingtonUtil;

/**
 * Created by nancymi on 12/22/15.
 */
public class RetrofitExecutor {

    private final Retrofit retrofit;
    private final AreaService areaService;

    private static final String DEFAULT_AREA = "xian";

    private static final String TAG = "RetrofitExecutor";

    public RetrofitExecutor(String url) {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.areaService = retrofit.create(AreaService.class);
    }

    public void execute(final TaskCallback callback) {

        //TODO 显示 dialog

        PMDataPref pmDataPref = PMSingtonUtil.getPmDataPref();

        String area = pmDataPref.getArea();

        if (area == "") {
            area = DEFAULT_AREA;
        }

        Call<List<Area>> all = areaService.getPM25(area);
        all.enqueue(new Callback<List<Area>>() {
            @Override
            public void onResponse(Response<List<Area>> response, Retrofit retrofit) {
                callback.onCompleted(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(TAG, "execute error : " + t.toString());
            }
        });
    }
}