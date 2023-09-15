package ru.netology.domain;

public class Radio {
    private int baseNumStation;
    private int maxNumberStation;
    private int minNumberStation;
    private int curNumStation;
    private int maxVolume = 10;
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

    public void increaseVolume() {
        if (currentVolume < 10){
        currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0){
        currentVolume = currentVolume - 1;
        }
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

    public void decreaseStation() {
        if (curNumStation > 0) {
            curNumStation = curNumStation - 1;
        }
    }

    public void setCurNumStation(int curNumStation) {
        if (curNumStation < minNumberStation) {  //При выборе станции меньше минимальной, значение установится на максимальную станцию
            curNumStation = maxNumberStation;
        }
        if (curNumStation > maxNumberStation) {  //При выборе станции больше максимальной, значение установится на минимальную станцию
            curNumStation = minNumberStation;
        }
        this.curNumStation = curNumStation;
    }

    public Radio(int baseNumStation) {
        maxNumberStation = baseNumStation - 1;
        this.baseNumStation = baseNumStation;
    }

    public Radio() {
    }
}
