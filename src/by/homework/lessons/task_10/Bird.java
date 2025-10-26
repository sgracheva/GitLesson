package by.homework.lessons.task_10;

import java.util.Objects;

public class Bird extends Animal {
    private String familyBird;
    private int maxflight;


    public Bird(String color, int maxlife, String food, String family, int maxflight) {
        super(color, maxlife, food);
        this.familyBird = family;
        this.maxflight = maxflight;
    }

    public String getFamilyBird() {
        return familyBird;
    }

    public void setFamilyBird(String familyBird) {
        this.familyBird = familyBird;
    }

    public int getMaxflight() {
        return maxflight;
    }

    public void setMaxflight(int maxflight) {
        this.maxflight = maxflight;
    }

//    public boolean equals(Object obj) {
//        if (!(obj instanceof Bird)) {
//            return false;
//        }
//        Bird bird = (Bird) obj;
//
//        if (familyBird.equals(bird.getFamilyBird()) && maxflight == bird.getMaxflight()) {
//            return true;
//        }
//        return false;
//    }


    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Bird bird = (Bird) obj;

        if (this.maxlife != bird.maxlife)
            return false;
        if (this.maxflight != bird.maxflight)
            return false;
        if (!Objects.equals (familyBird, bird.familyBird))
            return false;
        return color != null && color.equals(bird.color);
    }

    public int hashCode() {
        int result = familyBird.hashCode() + maxflight;
        return result;
    }

}
