package com.example.myapplication_assignment_2;

public class ItemList
{

    String resImage;
    String heading;

    public String getResImage() {
        return resImage;
    }

    public void setResImage(String resImage) {
        this.resImage = resImage;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "resImage='" + resImage + '\'' +
                ", heading='" + heading + '\'' +
                '}';
    }
}
