package ru.netology.domain;

public class Radio {
    private int currentVolume;
   private int currentChannel;

   // переключаем канал на следующий
    public int switchChannelNext() {
        if (currentChannel < 9) {
            currentChannel++;
        }
        if (currentChannel == 9) {
            currentChannel = 0;
        }
        return currentChannel;
    }
    //переключаем канал на предыдущий
    public int switchChannelPrev() {
        if (currentChannel == 0) {
            currentChannel = 9;
        } else
        if (currentChannel > 0 && currentChannel <= 9) {
            currentChannel = currentChannel - 1;
        }
                return currentChannel;
    }

    //делаем звук громче
    public int increaseVolume () {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }
    //делаем звук тише
    public int decreaseVolume () {
        if (currentVolume == 0) {
        currentVolume = 0;
        }
        if (currentVolume <= 10 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }
}
