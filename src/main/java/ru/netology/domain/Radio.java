package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int maxNumberStation = 9;
    private int minNumberStation = 1;
    private int curNumStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean on;


    public void setCurNumStation(int newCurNumStation) {
        if (newCurNumStation < minNumberStation) {  //При выборе станции меньше минимальной, значение установится на минимальную станцию
            curNumStation = minNumberStation;
        }
        if (newCurNumStation > maxNumberStation) {  //При выборе станции больше максимальной, значение установится на максимальную станцию
            curNumStation = maxNumberStation;
        }
        this.curNumStation = newCurNumStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > minVolume) {     //При выборе громкости меньше минимальной
            return;
        }
        if (newCurrentVolume < maxVolume) {     //При выборе громкости больше Максимальной
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else if (currentVolume == maxVolume){
            System.out.print("Maximum Volume");
        }
    }

    public void decreaseVolume() {
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
