package task;

import java.util.ArrayList;
import java.util.List;

public class EmailChannel implements IChannel {
    @Override
    public void ReceiveMessage(Message message, ArrayList<IAttachment> attachments) {
        System.out.println("Email receive message \n");
        System.out.println(message +"\n");
        if (attachments != null && attachments.size() > 0)
        {
            for (IAttachment attachment : attachments){
                System.out.println(attachment.toString());
            }
        }
    }
}
