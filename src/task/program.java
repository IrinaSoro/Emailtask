package task;
import java.time.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class program {
    public static void main(String [] args) {
        MessageService messageService = new MessageService();

        Message message = new Message();
        message.UserName = "Alex";
        message.SendTime = LocalDateTime.now();
        message.Text = "hello";
        message.Attachments = new ArrayList<IAttachment>();
        Document document = new Document();
        document.DocumentType = "word document";
        document.Name = "document.doc";
        SoundFile soundFile = new SoundFile();
        soundFile.Name = "additional instruction";
        soundFile.PlayTime = 120;
        Picture picture = new Picture();
        picture.Name="Image";
        picture.PictureType= "Type.jpg";

        message.Channels = new ArrayList<IChannel>() {{
            add(new FacebookChannel());
            add(new EmailChannel());
        }};

        Message secondMessage = new Message();
        secondMessage.UserName = "Dima";
        secondMessage.SendTime = LocalDateTime.now();
        secondMessage.Text = "hellao";
        secondMessage.Attachments = new ArrayList<IAttachment>();
        Document document1 = new Document();
        document1.DocumentType = "word documenta";
        document1.Name = "document.docx";
        SoundFile soundFile1 = new SoundFile();
        soundFile1.Name = "additional instructiona";
        soundFile1.PlayTime = 120;
        Picture picture1 = new Picture();
        picture1.Name= "Picture1";
        picture1.PictureType="Type.png";

        message.Channels = new ArrayList<IChannel>() {{
          add(new EmailChannel());
          add(new SmsChannel());
          add(new FacebookChannel());
        }};

        messageService.SendMessage(message);
        messageService.SendMessage(secondMessage);

        System.out.println();
    }
}


