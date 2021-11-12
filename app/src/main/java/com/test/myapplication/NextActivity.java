package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class NextActivity extends AppCompatActivity {

    TextView email,phone,name;
    //API calls
    private Retrofit retrofit;
    private OkHttpClient.Builder httpClient;
    private Api api;
    private Call<String> call;
    final String url = "http://5d80a75f99f8a20014cf9661.mockapi.io/api/login";

    //Asynctask
    private GetUserDetails getUserDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        phone = (TextView) findViewById(R.id.phone);


        api = ApiClient.getApiClient().create(Api.class);

        getUserDetails = new GetUserDetails(NextActivity.this);

            getUserDetails.execute();


    }

    private static class GetUserDetails  extends AsyncTask<Void,Void,Void> {

        NextActivity homePage;

        public GetUserDetails(NextActivity context) {
            WeakReference<NextActivity> weakReference = new WeakReference<>(context);
            homePage = weakReference.get();
        }

        @Override
        protected Void doInBackground(Void... voids) {
//            Call<List<CurrentUser>> call_cur = api.getCurrentUserDetail();
            homePage.call = homePage.api.getAllUserDetail();
            homePage.call.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    if (response.body() != null) {

                    }
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    Log.d("TAG","onFailure  " + t.getMessage() );
                }
            });

            //*****************************************************************************************************
            return null;
        }
    }

}