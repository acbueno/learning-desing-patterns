package br.com.acbueno.learning.desing.patterns.behavioral.iterator.channel;

public class Channel {

    private double frequency;
    private ChannelTypeEnum type;

    public Channel(double freq, ChannelTypeEnum type) {
        this.frequency = freq;
        this.type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Channel [frequency=" + frequency + ", type=" + type + "]";
    }

}
