package com.mggames.app.howfar;

import com.mggames.app.models.HowFarUser;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Niwa on 14/10/2015.
 */
public interface HowFarService {

    /**
     *
     * @return all users
     */
    @GET("/api/user")
    Call<List<HowFarUser>> listUsers();
}
