package ru.netology.domain;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;

    private int maxStation;

    public Radio (){
        maxStation = 9;
    }

    public Radio(int stationsCount){
        maxStation = stationsCount -1;
    }


    public void nextStation() {
        if (currentNumberStation  < maxStation ) {
            currentNumberStation ++;
        } else {
            currentNumberStation  = 0;
        }
    }

    public void prevStation() {
        if (currentNumberStation  > 0) {
            currentNumberStation --;
        } else {
            currentNumberStation  = maxStation ;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > maxStation ) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}