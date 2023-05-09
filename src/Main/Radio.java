package Main;

class Radio {

    private int currentStation;
    private int volume;
    private int[] stations = new int[10];

    public Radio() {
        currentStation = 1;
        volume = 5;
        for (int i = 0; i < stations.length; i++) {
            stations[i] = i + 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 1 && station <= 10) {
            currentStation = station;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int vol) {
        if (vol >= 1 && vol <= 10) {
            volume = vol;
        }
    }

    public void saveStation(int button) {
        if (button >= 1 && button <= 10) {
            stations[button-1] = currentStation;
        }
    }

    public void selectStation(int button) {
        if (button >= 1 && button <= 10) {
            currentStation = stations[button-1];
        }
    }

}