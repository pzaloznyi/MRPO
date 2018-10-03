package lab4;

import java.util.ArrayList;
import java.util.Date;

public class Park {
    private ArrayList<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    private class Attraction {
        private String attractionType;
        private Date startHour;
        private Date endHour;
        private double price;
        private int ageLimit;

        public void setAttractionType(String attractionType) {
            this.attractionType = attractionType;
        }

        public void setStartHour(Date startHour) {
            this.startHour = startHour;
        }

        public void setEndHour(Date endHour) {
            this.endHour = endHour;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setAgeLimit(int ageLimit) {
            this.ageLimit = ageLimit;
        }
    }
}


