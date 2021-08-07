package ru.netology.domain;

public class Radio {
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurNumStation(int curNumStation) {
        if (curNumStation < minNumberStation) {  //При выборе станции меньше минимальной, значение установится на минимальную станцию
            curNumStation = minNumberStation;
        }
        if (curNumStation > maxNumberStation) {  //При выборе станции больше максимальной, значение установится на максимальную станцию
            curNumStation = maxNumberStation;
        }
        this.curNumStation = curNumStation;
    }

    public void increase1p() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decrease1p() {
        setCurrentVolume(currentVolume - 1);
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

    public void increaseVolumeOverMax() {
        if (currentVolume >= maxVolume) {
            return;
            //System.out.print("Maximum Volume");
        }
    }
//            currentVolume = currentVolume + 1;
//        } else if (currentVolume == maxVolume) {
//            System.out.print("Maximum Volume");
//        }

    public void decreaseVolume(int i) {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume == minVolume) {
            System.out.print("Mute");
        }
    }

    public void increaseStation() {
        if (curNumStation < maxNumberStation) {     //При нажатии кнопки "Следующая станция" если станция меньше максимальной то переключится на +1
            curNumStation = curNumStation + 1;
        } else if (curNumStation == maxNumberStation) {     //При нажатии кнопки "Следующая станция" если станция и так выбрана 9 то переключится на 1
            curNumStation = minNumberStation;
        }
    }

    public void decreaseStation() {
        if (curNumStation > minNumberStation) {     //При нажатии кнопки "Предыдущая станция" если станция больше минимальной то переключится на -1
            curNumStation = curNumStation - 1;
        } else if (curNumStation == minNumberStation) {     //При нажатии кнопки "Предыдущая станция" если станция и так выбрана 1 то переключится на 9
            curNumStation = maxNumberStation;
        }
    }
}
