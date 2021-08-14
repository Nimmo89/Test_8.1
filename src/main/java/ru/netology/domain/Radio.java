package ru.netology.domain;

public class Radio {
    private int baseNumStation = 10;
    private int maxNumberStation;
    private int minNumberStation;
    private int curNumStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getCurNumStation() {
        return curNumStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increase1p() {
        setCurrentVolume(currentVolume + 1);
        return currentVolume;
    }

    public int decrease1p() {
        setCurrentVolume(currentVolume - 1);
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {     //При выборе громкости меньше минимальной
            return;
        }
        if (currentVolume > maxVolume) {     //При выборе громкости больше Максимальной
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseStation() {
        setCurNumStation(curNumStation + 1);
        return curNumStation;
    }

    public int decreaseStation() {
        setCurNumStation(curNumStation - 1);
        return curNumStation;
    }

    public void setCurNumStation(int curNumStation) {
        if (curNumStation < minNumberStation) {  //При выборе станции меньше минимальной, значение установится на минимальную станцию
            curNumStation = maxNumberStation;
        }
        if (curNumStation > maxNumberStation) {  //При выборе станции больше максимальной, значение установится на максимальную станцию
            curNumStation = minNumberStation;
        }
        this.curNumStation = curNumStation;
    }

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public Radio() {
    }
}
