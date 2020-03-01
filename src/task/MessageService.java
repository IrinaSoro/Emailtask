package task;

import java.util.ArrayList;

public class MessageService {

    private  IAttachmentFilter _attachmentFilter;

    public MessageService()
    {
        _attachmentFilter = new AttachmentFilter();
    }

    public void SendMessage(Message message)
    {
        ArrayList<IAttachment> attachments;

        for (IChannel channel : message.Channels)
        {
            attachments =_attachmentFilter.FilterOutAttachments(channel, message.Attachments);

            channel.ReceiveMessage(message,attachments);
        }

       System.out.println("Sending a message finished success");
    }
}


