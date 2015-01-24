# DevOps HW1 : 

For this homework, I sent an email via the [AWS SES](http://aws.amazon.com/ses/).  
I set up a maven project to automate the build and running process, using [this guide](http://java.awsblog.com/post/TxBQSY5CJQNVSN/AWS-SDK-for-Java-Maven-Archetype).
I used the sample code included with the aws sdk to test authentication and then to send an email.
Prior to sending the email, however, I had to first validate my email.  Amazon requires this 
step to prevent abuse of the email service.

Here is proof the email was sent:
![image](https://cloud.githubusercontent.com/assets/6819944/5887669/a14a1370-a3ac-11e4-8c4b-d714c18af008.png)
