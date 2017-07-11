package com.example.smaqu.solarsystemapp.model;

import com.example.smaqu.solarsystemapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SmaQu on 2017-07-11.
 */

public class CreateData {
    private static final String[] planets = {
            "Merkury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
    };

    private static final String[] planetDescription = {
            "description",
            "description",
            "description",
            "description",
            "description",
            "description",
            "description",
    };

    private static final int[] planetIcons = {
            R.mipmap.mercury_ico_launcher,
            R.mipmap.wenus_ico_launcher,
            R.mipmap.earth_ico_launcher,
            R.mipmap.mars_ico_launcher,
            R.mipmap.jupiter_ico_launcher,
            R.mipmap.saturn_ico_launcher,
            R.mipmap.uranus_ico_launcher,
    };

    //TODO change image
    private static final int[] planetImage = {
            R.mipmap.mercury_ico_launcher,
            R.mipmap.wenus_ico_launcher,
            R.mipmap.earth_ico_launcher,
            R.mipmap.mars_ico_launcher,
            R.mipmap.jupiter_ico_launcher,
            R.mipmap.saturn_ico_launcher,
            R.mipmap.uranus_ico_launcher,
    };


    public static List<ListItem> getListData(){
        List<ListItem>  data = new ArrayList<>();
        for(int i=0;i<planets.length;i++){
            ListItem item = new ListItem();
            item.setPlanetName(planets[i]);
            item.setPlanetImageIco(planetIcons[i]);
            item.setBigDetailImage(planetImage[i]);
            item.setDetailText(planetDescription[i]);
            data.add(item);
        }
        return data;
    }
}
