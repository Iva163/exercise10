package ru.netology.radio;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int amountStation = 10;

    private int maxStation = amountStation - 1;

    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.maxStation = amountStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
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
        if (currentStation >= maxStation) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation -= 1;
        }
        if (currentStation == 0) {
            currentStation = maxStation;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


}
