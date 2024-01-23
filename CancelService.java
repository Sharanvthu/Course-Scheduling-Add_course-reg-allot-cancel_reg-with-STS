package com.sharan.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CancelService {
	@Autowired 
	AllotRepo allotRepo;
	@Autowired 
	CancelRepo cancelRepo;
Cancel cancel1;
	public String cancelReg(Cancel cancel) {
		cancel.setCourseRegitrationId( cancel.getCourseRegitrationId()  );
		String sta=allotRepo.findByStatus(cancel.getCourseRegitrationId());
		System.out.println("==================================="+sta);
		if (sta.equals("CONFIRM")) {
			cancel.setStatus("CANCEL_REJECTED");
		} else {
			cancel.setStatus("CANCEL_ACCEPTED");
		}
		cancel1= new Cancel(cancel.getId(), cancel.getCourseRegitrationId(), cancel.getStatus());
cancelRepo.save(cancel1);
		return cancel.getCourseRegitrationId()+"  "+cancel.getStatus();
	}
	

}
