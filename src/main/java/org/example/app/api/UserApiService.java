package org.example.app.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserApiService {

    @GET("api/users")
    Call<UsersApiResponse> getUsers();

    @GET("api/users/{id}")
    Call<UserApiResponse> getUserById(@Path("id") int id);
}
