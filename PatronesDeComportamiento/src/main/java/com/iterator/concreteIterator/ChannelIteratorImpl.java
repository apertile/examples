package com.iterator.concreteIterator;

import java.util.List;

import com.iterator.extras.Channel;
import com.iterator.extras.ChannelTypeEnum;
import com.iterator.iterator.ChannelIterator;

//Concrete Iterator 
public class ChannelIteratorImpl implements ChannelIterator
{
	
		 
        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;
 
        public ChannelIteratorImpl(ChannelTypeEnum ty,
                List<Channel> channelsList) {
            this.type = ty;
            this.channels = channelsList;
        }
 
        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }
 
        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
 
    }
	
