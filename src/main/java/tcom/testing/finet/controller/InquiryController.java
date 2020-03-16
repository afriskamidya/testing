package tcom.testing.finet.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testing.finet.model.InquiryPnm;

@RestController
@RequestMapping(value ="pnm")
public class InquiryController {
	
	@RequestMapping(value = "/inquiry", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String  InquiryPnm(@RequestBody InquiryPnm req) {
		String test = req.getKode() + " " + req.getBillNumber() + " " + req.getTimeStamp();
		return test;
	}

}
