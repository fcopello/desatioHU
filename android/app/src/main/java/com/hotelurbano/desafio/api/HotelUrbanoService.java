package com.hotelurbano.desafio.api;

import com.hotelurbano.desafio.model.Hotel;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by fabiocopello on 4/7/16.
 */
public interface HotelUrbanoService {

    @GET("/hotel/search")
    public void getHotels(@Query("query") String query,
                          Callback<List<Hotel>> hotels);

    @GET("/hotel/check")
    public void getDisp(@Query("id") String id,
                        @Query("city") String city,
                        @Query("startDate") String startDate,
                        @Query("endDate") String endDate,
                        Callback<List<Hotel>> hotels);

}
