package br.com.acbueno.learning.desing.patterns.behavioral.iterator.channel;

public class Client {

    public static void main(String[] args) {
        ChannelCollection channels = populateChannel();
        ChannelInterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);

        while (baseIterator.hasNext()) {
            Channel ch = baseIterator.next();
            System.out.println(ch.toString());
        }
        System.out.println("******");
        ChannelInterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);

        while (englishIterator.hasNext()) {
            Channel ch = englishIterator.next();
            System.out.println(ch.toString());
        }
    }

    private static ChannelCollection populateChannel() {
        ChannelCollection channelsCollection = new ChannelCollectionImpl();
        channelsCollection.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channelsCollection.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channelsCollection.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channelsCollection.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channelsCollection.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channelsCollection.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channelsCollection.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channelsCollection.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channelsCollection.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));

        return channelsCollection;
    }

}
