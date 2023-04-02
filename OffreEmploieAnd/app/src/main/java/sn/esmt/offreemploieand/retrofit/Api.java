package sn.esmt.offreemploieand.retrofit;



import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import sn.esmt.offreemploieand.model.CvEntities;

public interface Api {

   @GET("/accueil/all")
   public Call<ArrayList<CvEntities>> all();
}
