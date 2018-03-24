package com.connectm.fms.messageservice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import java.io.File;
import java.io.IOException;
import org.springframework.core.io.Resource;
import javax.mail.internet.MimeMessage;

public class EmailDispatcher {
	@Autowired
    private JavaMailSender mailSender;
	
	@Autowired
	private SimpleMailMessage templateMessage;
	
	@Autowired
	private MessageSource messageSource;

	/**
	 * @return
	 */
	public JavaMailSender getMailSender() {
		return mailSender;
	}

	/**
	 * @param mailSender
	 */
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * @return
	 */
	public SimpleMailMessage getTemplateMessage() {
		return templateMessage;
	}

	/**
	 * @param templateMessage
	 */
	public void setTemplateMessage(SimpleMailMessage templateMessage) {
		this.templateMessage = templateMessage;
	}

	public void dispatchEmail(final String toEmailAddr, final String subject, final String msg, final String attachmentFilename, final String attachmentTitle){
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {
            	 MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
            	 messageHelper.setTo(toEmailAddr);
                 messageHelper.setSubject(subject);
                 messageHelper.setText(msg);
                                               
                FileSystemResource file = new FileSystemResource(new File(attachmentFilename));
                messageHelper.addAttachment(attachmentTitle, file);
             }
        };

        try {
            this.mailSender.send(preparator);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
            throw ex;
        }
		
	}
	
	public void sendMail(String from, String to, String subject, String msg) {

		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		
		 try {
	            this.mailSender.send(message);
	        }
	        catch (MailException ex) {
	            // simply log it and go on...
	            System.err.println(ex.getMessage());
	            throw ex;
	        }	
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		final DefaultResourceLoader loader = new DefaultResourceLoader();
		
		Resource r= loader.getResource("D:\\aparna\\and_mrp\\target\\ANDMRP-0.1\\WEB-INF\\spring-ws-servlet.xml");  
		BeanFactory b=new XmlBeanFactory(r);  
		EmailDispatcher emailDispatcher = (EmailDispatcher)b.getBean("emailDispatcher");  
		
		String msg = "Dear Customer, \n Pls find attached the DC for your order. \n Regards, \n Aparna Deepak";
		
		
		
		
		Resource resource = loader.getResource("classpath:.");
		System.out.println("resource = " + resource);
		try {
			System.out.println("(resource.getFile()).getPath() = " + (resource.getFile()).getPath());
			File outputDir = new File((resource.getFile()).getPath() + "//pdf");
			System.out.println("outputDir = " +outputDir);
			
			String dcPdfFile = (new File(outputDir.getPath() + "//dc.pdf")).getPath();
			
			System.out.println("dcPdfFile = " + dcPdfFile);
			emailDispatcher.dispatchEmail("aparnadeep@yahoo.com", "Your DC", msg, dcPdfFile, "DC.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
