package br.com.acbueno.learning.desing.patterns.behavioral.iterator.channel;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelsList.add(channel);

    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelsList.remove(channel);

    }

    @Override
    public ChannelInterator iterator(ChannelTypeEnum type) {
        return new ChannelInteratorImpl(type, this.channelsList);
    }



}
