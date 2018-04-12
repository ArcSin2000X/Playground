package com.lkincremental.perf;

import java.util.Date;

public class DataSample extends AbstractDataSample {
    private Date GMTTimestamp;
    private int timeRelativeToStart;
    private int volume;

    public DataSample(Date gmtTimestamp, int timeRelativeToStart, int volume) {
        this.GMTTimestamp = gmtTimestamp;
        this.timeRelativeToStart = timeRelativeToStart;
        this.volume = volume;
    }

    public int getTimeRelativeToStart() {
        return timeRelativeToStart;
    }

    public void setTimeRelativeToStart(int timeRelativeToStart) {
        this.timeRelativeToStart = timeRelativeToStart;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Date getGMTTimestamp() {
        return GMTTimestamp;
    }

    public void setGMTTimestamp(Date GMTTimestamp) {
        this.GMTTimestamp = GMTTimestamp;
    }
}
