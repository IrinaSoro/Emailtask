package task;

import java.util.ArrayList;
import java.util.List;
public interface IAttachmentFilter {

    ArrayList<IAttachment> FilterOutAttachments(IChannel channel, ArrayList<IAttachment> attachments);
}
