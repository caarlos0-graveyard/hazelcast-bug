package hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IList;

public class App {
	public static void main(String[] args) {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getGroupConfig().setName( "dev" ).setPassword( "dev-pass" );
		clientConfig.getNetworkConfig().addAddress( System.getenv( "HZ_IP" ) + ":5701" );
		HazelcastInstance client = HazelcastClient.newHazelcastClient( clientConfig );
		IList<Object> list = client.getList( "test" );
		list.add( "Go!" );
		System.out.println( "List Size:" + list.size() );
	}
}
