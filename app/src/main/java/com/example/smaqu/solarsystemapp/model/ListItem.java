package com.example.smaqu.solarsystemapp.model;

/**
 * Created by SmaQu on 2017-07-11.
 */

public class ListItem {

    private String planetName;
    private int planetImageIco;
    private String detailText;
    private int bigDetailImage;
    private String planetWiki;
    private long semiMajorAxis;
    private double mass;
    private double orbitalPeriod;
    private long avrDistanceToSun;

    public long getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(long semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public long getAvrDistanceToSun() {
        return avrDistanceToSun;
    }

    public void setAvrDistanceToSun(long avrDistanceToSun) {
        this.avrDistanceToSun = avrDistanceToSun;
    }

    public String getPlanetWiki() {
        return planetWiki;
    }

    public void setPlanetWiki(String planetWiki) {
        this.planetWiki = planetWiki;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetImageIco() {
        return planetImageIco;
    }

    public void setPlanetImageIco(int planetImageIco) {
        this.planetImageIco = planetImageIco;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }

    public int getBigDetailImage() {
        return bigDetailImage;
    }

    public void setBigDetailImage(int bigDetailImage) {
        this.bigDetailImage = bigDetailImage;
    }


}
