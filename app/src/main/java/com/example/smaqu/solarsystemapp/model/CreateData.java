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


    private static final int[] planetImage = {
            R.drawable.mercury_detail_image,
            R.drawable.venus_detail_image,
            R.drawable.earth_detail_image,
            R.drawable.mars_detail_image,
            R.drawable.jupiter_detail_image,
            R.drawable.saturn_detail_image,
            R.drawable.uranus_detail_image,

    };

    private static final String[] planetWikipedia = {
            "https://en.wikipedia.org/wiki/Mercury_(planet)",
            "https://en.wikipedia.org/wiki/Venus",
            "https://en.wikipedia.org/wiki/Earth",
            "https://en.wikipedia.org/wiki/Mars",
            "https://en.wikipedia.org/wiki/Jupiter",
            "https://en.wikipedia.org/wiki/Saturn",
            "https://en.wikipedia.org/wiki/Uranus",
    };


    public static List<ListItem> getListData(){
        List<ListItem>  data = new ArrayList<>();
        for(int i=0;i<planets.length;i++){
            ListItem item = new ListItem();
            item.setPlanetName(planets[i]);
            item.setPlanetImageIco(planetIcons[i]);
            item.setBigDetailImage(planetImage[i]);
            item.setDetailText(planetDescription[i]);
            item.setPlanetWiki(planetWikipedia[i]);
            data.add(item);
        }
        return data;
    }
}
