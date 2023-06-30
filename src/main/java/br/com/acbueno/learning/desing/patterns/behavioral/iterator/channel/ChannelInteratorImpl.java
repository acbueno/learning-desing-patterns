package br.com.acbueno.learning.desing.patterns.behavioral.iterator.channel;

import java.util.List;

public class ChannelInteratorImpl implements ChannelInterator {

    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelInteratorImpl(ChannelTypeEnum type, List<Channel> channelList) {
        this.type = type;
        this.channels = channelList;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel channel = channels.get(position);
            if (channel.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channel = channels.get(position);
        position++;

        return channel;
    }

}
