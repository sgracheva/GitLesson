package by.homework.lessons.task_10;

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

    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;

        if (familyBird.equals(bird.getFamilyBird()) && maxflight == bird.getMaxflight()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = familyBird.hashCode() + maxflight;
        return result;
    }

}
