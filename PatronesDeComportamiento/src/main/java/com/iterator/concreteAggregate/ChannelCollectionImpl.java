package com.iterator.concreteAggregate;

import java.util.ArrayList;
import java.util.List;

import com.iterator.aggregate.ChannelCollection;
import com.iterator.concreteIterator.ChannelIteratorImpl;
import com.iterator.extras.Channel;
import com.iterator.extras.ChannelTypeEnum;
import com.iterator.iterator.ChannelIterator;

//Concrete Aggregator
public class ChannelCollectionImpl implements ChannelCollection
{
	private List<Channel> channelsList;
	 
    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }
 
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }
 
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }
 
    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }
 
    
	
}
