package task;

import java.util.ArrayList;
import java.util.List;

public interface IChannel {

    void ReceiveMessage(Message message , ArrayList<IAttachment> attachments );

}
