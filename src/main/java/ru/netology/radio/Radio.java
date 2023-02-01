package ru.netology.radio;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
        return;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
        return;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation += 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation -= 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


}
