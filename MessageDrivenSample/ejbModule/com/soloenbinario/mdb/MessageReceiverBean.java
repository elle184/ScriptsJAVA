package com.soloenbinario.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Message-Driven Bean implementation class for: MessageReceiverBean
 */
@MessageDriven(
	name="MessageReceiverMDB",
	activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "/queue/MessageReceiver")
	}
)
public class MessageReceiverBean implements MessageListener {

    /**
     * Default constructor. 
     */
    public MessageReceiverBean() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        try {
        	
        } catch (JMSException e) {
        	
        }
    }

}
