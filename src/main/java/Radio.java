public class Radio {
    private int currentVolume;
    private int currentStation;
    private int stationsCount;

    ///////////////////////////

    public Radio() {
        this.stationsCount = 10;
    }
    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    ///////////////////////////

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0)
        {
            return;
        }
        if (currentVolume > 100){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
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


       public void increaseVolume() { //  Устанавливает громкость на 1 больше
        currentVolume = 6;
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() { //  Устанавливает громкость на 1 меньше
        currentVolume = 10;
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void setMaxVolume() { //Устанавливает максимальную громкость
        currentVolume = 100;
    }

    public int setMinVolume() { //Устанавливает минимальную громкость
        int currentMinVolume = 0;
        return currentMinVolume;
    }


    public void setToMaxStation() {  // Устанавливает максимальную станцию

        currentStation = 9;
    }

    public void next() { //  Устанавливает станцию на 1 больше

        if (currentStation < stationsCount - 1) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = 0;
        }
    }

    public void reduceStation() { //  Устанавливает станцию на 1 меньше

        if (currentStation == 0) {
            currentStation = stationsCount - 1;
            return;
        } else {
            currentStation = 0;
        }
        currentStation = currentStation - 1;
    }
}