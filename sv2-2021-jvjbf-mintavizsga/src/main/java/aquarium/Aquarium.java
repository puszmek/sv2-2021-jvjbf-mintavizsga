package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static final int CAPACITY = 20;
    private List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        if (fishList.size() * 5 < 20) {
            fishList.add(fish);
        } else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed() {
        for (Fish actual : fishList) {
            actual.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> overWeightFish = new ArrayList<>();
        for (Fish actual : fishList) {
            if (actual.getWeight() > maxWeight) {
                overWeightFish.add(actual);
            }
        }
        fishList.removeAll(overWeightFish);
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish actual : fishList) {
            result.add(actual.getStatus());
        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int count = 0;
        for (Fish actual : fishList) {
            if (actual.hasMemoryLoss() == true) {
                count++;
            }
        }
        return count;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish actual : fishList) {
            if (actual.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish result = fishList.get(0);
        for (int i = 1; i < fishList.size(); i++) {
            if (fishList.get(i).getWeight() < result.getWeight()) {
                result = fishList.get(i);
            }
        }
        return result;
    }
}
