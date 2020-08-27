class Clock {

    int hours = 12;
    int minutes = 0;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    void next() {
        if (getMinutes() == 59) {
            setMinutes(0);
            if (getHours() == 12) {
                setHours(1);
            } else {
                setHours(getHours()+1);
            }
        } else {
            setMinutes(getMinutes()+1);
        }
    }


}