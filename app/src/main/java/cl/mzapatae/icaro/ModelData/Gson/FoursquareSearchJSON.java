package cl.mzapatae.icaro.ModelData.Gson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by mzapata on 15-05-2015.
 */
public class FoursquareSearchJSON {
    @SerializedName("response")
    private FoursquareResponse response = new FoursquareResponse();

    public FoursquareResponse getResponse() {
        return response;
    }

    public void setResponse(FoursquareResponse response) {
        this.response = response;
    }

    public class FoursquareResponse {
        @SerializedName("venues")
        private List<Venues> venues = new ArrayList<>();

        public List<Venues> getVenues() {
            return venues;
        }

        public void setVenues(List<Venues> venues) {
            this.venues = venues;
        }

        public class Venues {
            @SerializedName("name")
            private String venueName;
            @SerializedName("contact")
            private Contact contact;
            @SerializedName("location")
            private Location location;

            public String getVenueName() {
                return venueName;
            }

            public void setVenueName(String venueName) {
                this.venueName = venueName;
            }

            public Contact getContact() {
                return contact;
            }

            public void setContact(Contact contact) {
                this.contact = contact;
            }

            public Location getLocation() {
                return location;
            }

            public void setLocation(Location location) {
                this.location = location;
            }

            public class Location {
                @SerializedName("address")
                private String address;
                @SerializedName("crossStreet")
                private String crossStreet;
                @SerializedName("lat")
                private Double latitude;
                @SerializedName("lng")
                private Double longitude;
                @SerializedName("distance")
                private Integer distance;
                @SerializedName("city")
                private String city;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getCrossStreet() {
                    return crossStreet;
                }

                public void setCrossStreet(String crossStreet) {
                    this.crossStreet = crossStreet;
                }

                public Double getLatitude() {
                    return latitude;
                }

                public void setLatitude(Double latitude) {
                    this.latitude = latitude;
                }

                public Double getLongitude() {
                    return longitude;
                }

                public void setLongitude(Double longitude) {
                    this.longitude = longitude;
                }

                public Integer getDistance() {
                    return distance;
                }

                public void setDistance(int distance) {
                    this.distance = distance;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }
            }

            public class Contact {
                @SerializedName("formattedPhone")
                private String phone;

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }
            }
        }
    }
}
