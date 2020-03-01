package task;

import task.IAttachment;

public class Picture implements IAttachment {
public String Name;
public String PictureType;

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    public String getPictureType() {
        return PictureType;
    }

    public void setPictureType(String pictureType) {
        PictureType = pictureType;
    }
}
