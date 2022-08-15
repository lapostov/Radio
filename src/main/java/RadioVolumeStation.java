public class RadioVolumeStation {
    public int currentVolume; // Может устанавливать громкость

    public void setToMaxVolume() {  // Устанавливает максимальную громкость
        currentVolume = 10;
    }

    public void increaseVolume() { //  Устанавливает громкость на 1 больше
        currentVolume = 6;
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() { //  Устанавливает громкость на 1 меньше
        currentVolume = 10;
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public int setAddAtMax() {
        int[] volumes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxVolume = 0;
        for (int volume : volumes) {
            if (volume >= volumes[maxVolume]) {
                maxVolume = volume;
            }
        }
        return maxVolume;
    }

    public int setAddAtMin() {
        int[] volumes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int minVolume = 0;
        for (int volume : volumes) {
            if (volume <= volumes[minVolume]) {
                volume = minVolume;
            }
        }
        return minVolume;
    }


///--------------------------------------------------------------------/////


    public int currentStation; // Может устанавливать радиостанцию

    public void setToMaxStation() {  // Устанавливает максимальную станцию

        currentStation = 9;
    }

    public void increaseStation() { //  Устанавливает станцию на 1 больше

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void reduceStation() { //  Устанавливает станцию на 1 меньше

        if (currentStation == 0) {
            currentStation = 9;
        }

        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }

    }

    public int getCurrentStation() {
        currentStation = 9;
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

}