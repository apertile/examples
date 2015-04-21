package com.iterator.aggregate;

import com.iterator.extras.Channel;
import com.iterator.extras.ChannelTypeEnum;
import com.iterator.iterator.ChannelIterator;

//Aggregate interface
public interface ChannelCollection {
	public void addChannel(Channel c);
    
    public void removeChannel(Channel c);
     
    public ChannelIterator iterator(ChannelTypeEnum type);
}
