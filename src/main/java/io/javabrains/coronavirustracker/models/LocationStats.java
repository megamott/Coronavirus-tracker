package io.javabrains.coronavirustracker.models;

/**
 * @author Matvey Konoplyov
 */
public class LocationStats {

    private String country;
    private String province;
    private int NewCases;
    private int latestTotalCases;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getNewCases() {
        return NewCases;
    }

    public void setNewCases(int preLatestTotalCases) {
        this.NewCases = preLatestTotalCases;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", preLatestTotalCases=" + NewCases +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
