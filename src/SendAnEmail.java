import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.GetSendQuotaResult;


public class SendAnEmail {
	
	public static void main(String[] args) {
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (~/.aws/credentials), and is in valid format.",
                    e);
        }

        // Instantiate an Amazon SES client, which will make the service call with the supplied AWS credentials.
        AmazonSimpleEmailServiceClient client = new AmazonSimpleEmailServiceClient(credentials);
        
        GetSendQuotaResult result = client.getSendQuota();
        
        System.out.println(result);
	}

}
