package task;

import task.IAttachment;

public class SoundFile implements IAttachment {
    public String Name ;

    public long PlayTime ;

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    public long getPlayTime() {
        return PlayTime;
    }

    public void setPlayTime(long playTime) {
        PlayTime = playTime;
    }
}
