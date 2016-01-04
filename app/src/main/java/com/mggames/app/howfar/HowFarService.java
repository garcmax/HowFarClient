package com.mggames.app.howfar;

import com.mggames.app.domain.ErrorBody;
import com.mggames.app.domain.HowFarUser;

import java.util.List;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Niwa on 14/10/2015.
 */
public interface HowFarService {

    /**
     *
     * @return all users
     */
    @GET("/api/users")
    Call<List<HowFarUser>> listUsers();

    /**
     * Login
     */
    @POST("/api/login")
    Call<ErrorBody> login(@Body HowFarUser user);

    /**
     * Register
     */
    @POST("/api/register")
    Call<ErrorBody> register(@Body HowFarUser user);
}
