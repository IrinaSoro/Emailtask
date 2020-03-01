package task;

import java.util.ArrayList;
import java.util.List;

public class SmsChannel implements IChannel {

    @Override
    public void ReceiveMessage(Message message, ArrayList<IAttachment> attachments) {
        System.out.println("Email receive message \n");
        System.out.println(message +"\n");
    }
}
