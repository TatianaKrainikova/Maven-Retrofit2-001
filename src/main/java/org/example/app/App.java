package org.example.app;

import okhttp3.OkHttpClient;
import org.example.app.api.UserApiResponse;
import org.example.app.api.UserApiService;
import org.example.app.api.UsersApiResponse;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App {

    public static void main(String[] args) {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        UserApiService service = retrofit.create(UserApiService.class);

        // REST /users
		Call<UsersApiResponse> call = service.getUsers();

		try {
		    Response<UsersApiResponse> response = call.execute();
		    UsersApiResponse apiResponse = response.body();
		    System.out.println(apiResponse);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

        // REST /users/4
//        Call<UserApiResponse> call = service.getUserById(4);
//
//        try {
//            Response<UserApiResponse> response = call.execute();
//            UserApiResponse apiResponse = response.body();
//            System.out.println(apiResponse);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }
}
