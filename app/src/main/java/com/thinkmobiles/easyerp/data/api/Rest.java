package com.thinkmobiles.easyerp.data.api;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thinkmobiles.easyerp.data.model.ResponseError;
import com.thinkmobiles.easyerp.data.services.LeadService;
import com.thinkmobiles.easyerp.data.services.LoginService;
import com.thinkmobiles.easyerp.presentation.utils.AppSharedPreferences_;
import com.thinkmobiles.easyerp.presentation.utils.Constants;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lynx on 1/13/2017.
 */

public class Rest {

    private static Rest restInstance;
    private Retrofit retrofit;
    private OkHttpClient client;
    private Gson malformedGson;
    private AppSharedPreferences_ sharedPreferences;

    private LoginService loginService;
    private LeadService leadService;

    private Converter<ResponseBody, ResponseError> converter;

    private Rest() {

    }

    public static Rest getInstance() {
        if(restInstance == null) restInstance = new Rest();
        return restInstance;
    }

    public LoginService getLoginService() {
        return loginService == null ? createService(LoginService.class) : loginService;
    }

    public LeadService getLeadService() {
        return leadService == null ? createService(LeadService.class) : leadService;
    }

    public ResponseError parseError(ResponseBody responseBody) {
        try {
            return converter.convert(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private <T> T createService(Class<T> service) {
        malformedGson = new GsonBuilder()
                .setLenient()
                .create();

        client = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .addInterceptor(new AddCookieInterceptor(sharedPreferences))
                .addInterceptor(new ReceiveCookieInterceptor(sharedPreferences))
                .build();
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(malformedGson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .baseUrl(Constants.BASE_URL)
                .build();
        converter = retrofit.responseBodyConverter(ResponseError.class, new Annotation[0]);
        return retrofit.create(service);
    }

    public void setPrefManager(AppSharedPreferences_ sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

}
