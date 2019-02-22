package com.example.android.popularmovies2.service;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Movies {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer Results;
    @SerializedName("total_pages")
    @Expose
    private Integer Pages;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    @Expose(serialize = false,deserialize = false)
    private static final String BASE_URL_FOR_IMAGE="http://image.tmdb.org/t/p/w185";

    @Expose(serialize = false,deserialize = false)
    private static final String TAG="Movies";

    @Expose(serialize = false,deserialize = false)
    private ArrayList<String> images = null;

    public Movies() {
        images = new ArrayList<>();
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return Results;
    }

    public void setTotalResults(Integer Results) {
        this.Results = Results;
    }

    public Integer getTotalPages() {
        return Pages;
    }

    public void setTotalPages(Integer Pages) {
        this.Pages = Pages;
    }

    public List<Result> getResults() {
        return results;
    }




    public void setResults(List<Result> results) {
        this.results = results;
    }

}

