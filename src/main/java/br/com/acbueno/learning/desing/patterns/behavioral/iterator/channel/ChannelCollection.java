package br.com.acbueno.learning.desing.patterns.behavioral.iterator.channel;

public interface ChannelCollection {

    public void addChannel(Channel channel);

    public void removeChannel(Channel channel);

    public ChannelInterator iterator(ChannelTypeEnum type);

}
