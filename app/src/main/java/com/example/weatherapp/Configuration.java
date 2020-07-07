package com.example.weatherapp;

import android.util.Pair;

import java.util.HashMap;
import java.util.Map;

public abstract class Configuration {
    private static final String BASE_URL = "https://api.openweathermap.org";
    private static final String APP_ID = "dcc06c34cf7bba0ff30aabd3269d249b";
    private static final float zagrebLatitude = 45.815399f;
    private static final float zagrebLongitude = 15.966568f;
    private static Map<String, Pair<Float, Float>> coordinatesMap = new HashMap<>();

    private static void initializeCoordinatesMap() {
        coordinatesMap.put("Amsterdam", new Pair<>(52.379189f, 4.899431f));
        coordinatesMap.put("Andorra la Vella", new Pair<>(42.506317f, 1.521835f));
        coordinatesMap.put("Ankara", new Pair<>(39.925533f, 32.866287f));
        coordinatesMap.put("Athens", new Pair<>(37.983810f, 23.727539f));
        coordinatesMap.put("Berlin", new Pair<>(52.520008f, 13.404954f));
        coordinatesMap.put("Bern", new Pair<>(46.947456f, 7.451123f));
        coordinatesMap.put("Bratislava", new Pair<>(48.148598f, 17.107748f));
        coordinatesMap.put("City of Brussels", new Pair<>(50.849996f, 4.349998f));
        coordinatesMap.put("Bucharest", new Pair<>(44.439663f, 26.096306f));
        coordinatesMap.put("Budapest", new Pair<>(47.497913f, 19.040236f));
        coordinatesMap.put("Chisinau", new Pair<>(47.003670f, 28.907089f));
        coordinatesMap.put("Copenhagen", new Pair<>(55.676098f, 12.568337f));
        coordinatesMap.put("Dublin", new Pair<>(53.350140f, -6.266155f));
        coordinatesMap.put("Gibraltar", new Pair<>(36.144740f, -5.352570f));
        coordinatesMap.put("Helsinki", new Pair<>(60.192059f, 24.945831f));
        coordinatesMap.put("Kiev", new Pair<>(50.454660f, 30.523800f));
        coordinatesMap.put("Lisbon", new Pair<>(38.736946f, -9.142685f));
        coordinatesMap.put("Ljubljana", new Pair<>(46.056946f, 14.505751f));
        coordinatesMap.put("London", new Pair<>(51.509865f, -0.118092f));
        coordinatesMap.put("Luxembourg City", new Pair<>(49.611622f, 6.131935f));
        coordinatesMap.put("Madrid", new Pair<>(40.416775f, -3.703790f));
        coordinatesMap.put("Minsk", new Pair<>(53.893009f, 27.567444f));
        coordinatesMap.put("Monaco", new Pair<>(43.740070f, 7.426644f));
        coordinatesMap.put("Moscow", new Pair<>(55.751244f, 37.618423f));
        coordinatesMap.put("Nicosia", new Pair<>(35.185566f, 33.382275f));
        coordinatesMap.put("Nuuk", new Pair<>(64.166666f, -51.733330f));
        coordinatesMap.put("Oslo", new Pair<>(59.911491f, 10.757933f));
        coordinatesMap.put("Paris", new Pair<>(48.864716f, 2.349014f));
        coordinatesMap.put("Podgorica", new Pair<>(42.442574f, 19.268646f));
        coordinatesMap.put("Prague", new Pair<>(50.073658f, 14.418540f));
        coordinatesMap.put("Pristina", new Pair<>(42.667542f, 21.166191f));
        coordinatesMap.put("Reykjavik", new Pair<>(64.128288f, -21.827774f));
        coordinatesMap.put("Riga", new Pair<>(56.946285f, 24.105078f));
        coordinatesMap.put("Rome", new Pair<>(41.902782f, 12.496366f));
        coordinatesMap.put("City of San Marino", new Pair<>(43.942878f, 12.460093f));
        coordinatesMap.put("Sarajevo", new Pair<>(43.856430f, 18.413029f));
        coordinatesMap.put("Skopje", new Pair<>(41.996460f, 21.431410f));
        coordinatesMap.put("Sofia", new Pair<>(42.698334f, 23.319941f));
        coordinatesMap.put("Stockholm", new Pair<>(59.334591f, 18.063240f));
        coordinatesMap.put("Sukhumi", new Pair<>(43.006944f, 40.995556f));
        coordinatesMap.put("Tallinn", new Pair<>(59.436962f, 24.753574f));
        coordinatesMap.put("Tbilisi", new Pair<>(41.716667f, 44.783333f));
        coordinatesMap.put("Tirana", new Pair<>(41.327953f, 19.819025f));
        coordinatesMap.put("Vaduz", new Pair<>(47.14151f, 9.521540f));
        coordinatesMap.put("Valletta", new Pair<>(35.899720f, 14.514720f));
        coordinatesMap.put("Vienna", new Pair<>(48.210033f, 16.363449f));
        coordinatesMap.put("Vilnius", new Pair<>(54.687157f, 25.279652f));
        coordinatesMap.put("Warsaw", new Pair<>(52.237049f, 21.017532f));
        coordinatesMap.put("Zagreb", new Pair<>(45.815399f, 15.966568f));
    }

    public static Map<String, Pair<Float, Float>> getCoordinatesMap() {
        initializeCoordinatesMap();
        return coordinatesMap;
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getAppId() {
        return APP_ID;
    }

    public static float getZagrebLatitude() {
        return zagrebLatitude;
    }

    public static float getZagrebLongitude() {
        return zagrebLongitude;
    }
}
