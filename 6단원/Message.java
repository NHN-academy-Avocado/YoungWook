public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public void swapSenderReceiver() {
        String temp = sender;
        sender = receiver;
        receiver = temp;
    }


    public void compressText(int option) {
        switch (option) {
            case 1:

                text = text.trim().replaceAll("\\s+", " ");
                break;
            case 2:

                text = text.replaceAll("[aeiouAEIOU]", "");
                break;
            case 3:

                text = text.trim().replaceAll("\\s+", " ").replaceAll("[aeiouAEIOU]", "");
                break;
            default:

                System.out.println("Invalid compression option.");
        }
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\nText: " + text;
    }
}
