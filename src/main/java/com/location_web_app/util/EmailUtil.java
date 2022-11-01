package com.location_web_app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	@Autowired
	JavaMailSender MailSender;
public void sendEmail(String toAddress,String emailSubject,String emailBody) {
	MimeMessage message = MailSender.createMimeMessage();
	MimeMessageHelper messageHelper=new MimeMessageHelper(message);
	try {
		messageHelper.setTo(toAddress);
		messageHelper.setText(emailSubject);
		messageHelper.setSubject(emailBody);
		MailSender.send(message);

	}catch(Exception e) {
		System.out.println(e);
	}
	
}

}
