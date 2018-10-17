package javaJms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Hoang on 9/27/2018.
 */
public class ProducerMsging {
        //Địa chỉ máy cài ActiveMQ với cổng mặc định là 61616
        private static String url = "failover://tcp://192.168.1.218:61616";
        //Tên Topic
    private static String subject = "TESTQUEUE1";
        public static void main(String[] args) throws JMSException {
        // Getting JMS connection from the server and starting it
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory(url);
        Connection connection =     connectionFactory.createConnection();
        connection.start();
        // JMS messages are sent and received using a Session. We will
        // create here a non-transactional session object. If you want
        // to use transactions you should set the first parameter to ‘true’
        Session session = connection.createSession(false,
                Session.AUTO_ACKNOWLEDGE);
        // Destination represents here our queue ‘TESTQUEUE’ on the
        // JMS server. You don’t have to do anything special on the
        // server to create it, it will be created automatically.
        Destination destination = session.createQueue(subject);
        // MessageProducer is used for sending messages (as opposed
        // to MessageConsumer which is used for receiving them)

        MessageProducer producer = session.createProducer(destination);

        //Delay waiting consumer start

        try {

            // We will send a small text message saying ‘Hello’ in Japanese

            int msgTemp = 0;

            while(true){

                msgTemp++;

                String msg = "TextMessage-" + String.valueOf(msgTemp);

                TextMessage message = session.createTextMessage(msg);

                // Here we are sending the message!

                producer.send(message);

                System.out.println("‘" + msg + "‘ has been send.");

                //Delay 1s

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            System.out.println("Error when during sent message: " + e.getMessage());
        }
    }
}
