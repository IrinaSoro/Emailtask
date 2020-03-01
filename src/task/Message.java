package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class Message {

        public String UserName ;

        public LocalDateTime SendTime ;

        public String Text ;

        public ArrayList<IChannel> Channels ;

        public String getUserName() {
                return UserName;
        }

        public void setUserName(String userName) {
                UserName = userName;
        }

        public LocalDateTime getSendTime() {
                return SendTime;
        }

        public void setSendTime(LocalDateTime sendTime) {
                SendTime = sendTime;
        }

        public String getText() {
                return Text;
        }

        public void setText(String text) {
                Text = text;
        }

        public List<IChannel> getChannels() {
                return Channels;
        }

        public void setChannels(ArrayList<IChannel> channels) {
                Channels = channels;
        }

        public ArrayList<IAttachment> getAttachments() {
                return Attachments;
        }

        public void setAttachments(ArrayList<IAttachment> attachments) {
                Attachments = attachments;
        }

        public ArrayList<IAttachment> Attachments ;

}
