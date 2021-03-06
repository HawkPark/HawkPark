package com.example.android.hawkpark02.utils;

import java.util.LinkedHashMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by jeffs on 4/19/2017.
 */

public class GeofenceConstants {
    private static final LatLng carparcDiem = new LatLng(40.865314, - 74.197107);
    private static final LatLng lot24 = new LatLng(40.866385, -74.196641);
    private static final LatLng lot60 = new LatLng(40.872985, -74.198942);

    public static final LinkedHashMap<String, LatLng> MSU_PARKING =
            new LinkedHashMap<String, LatLng>();
    static {
        MSU_PARKING.put("CarParc Diem", carparcDiem);
        MSU_PARKING.put("Lot 24", lot24);
        MSU_PARKING.put("Lot 60", lot60);
    }
    public static final LinkedHashMap<String, Integer> LOT_RADIUS =
            new LinkedHashMap<String, Integer>();
    static {
        LOT_RADIUS.put("CarParc Diem", 60);
        LOT_RADIUS.put("Lot 24", 60);
        LOT_RADIUS.put("Lot 60", 150);
    }
}
