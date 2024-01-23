package com.sharan.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AllotService 
{
	@Autowired
	AllotRepo allotRepo;
	@Autowired
	CourseRepo courseRepo;
	@Autowired
	StudentRepo studentRepo;
	Allot allot2;
	public List<String> allotCourse(Allot allot) 
	{
		System.out.println("+++++++++++++++++++"+allot.getCourseOfferingId());
		int i=allot.getCourseOfferingId().indexOf('-');
		String course1=allot.getCourseOfferingId().substring(0,i);
		System.out.println("==================="+course1);
		String gmail=allot.getCourseOfferingId().substring(i,allot.getCourseOfferingId().length())+"@gmail.com";
		Course course=courseRepo.findById(course1).get();
		List<Student> list=studentRepo.findAll();
//		int z=1;
		List<String> s=new ArrayList<>();
		//		
		
		for (Student student : list) 
		{
//			allot.setId(z);
			if(student.getStatus().equals("ACCEPTED"))
			{
				allot.setStatus("CONFIRM");
				
				allot2=new Allot(allot.getId(),allot.getStatus() , student.getCourseRegId());
				System.out.println(allot2.getId()+" ========"+allot2.getStatus()+"=========="+allot2.getCourseOfferingId());
				allotRepo.save(allot2);
				s.add(student.getCourseRegId()+"  "+student.getGmail()+"  "+course.getCourseOfferingId()+"  "
						+course.getCourseName()+"  "+course.getInstructorName()+"  "+course.getDate()+"  "+allot.getStatus()+" ");
			}
			else {
				allot.setStatus("CANCELD");
				
				allot2=new Allot(allot.getId(),allot.getStatus() , student.getCourseRegId());
				allotRepo.save(allot2);
			}
//			++z;
		}
		return s;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	//		List<Student> list=studentRepo.findAllBystatus("ACCEPTED");
	//		List<String> s=new ArrayList<>();
	//		
	//		for (Student student : list) {
	//			s.add(student.getCourseRegId()+"  "+student.getGmail()+"  "+course.getCourseOfferingId()+"  "
	//			+course.getCourseName()+"  "+course.getInstructorName()+"  "+course.getDate()+"  "+"  Confirm"+" ");
	//		}
	//			return s;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//		Allot allot=new Allot(student.getId());
	//		allotRepo.save(allot);
	//		for (Student student : student1) {
	//			return student.getCourseRegId()+student.getGmail()+course.getCourseOfferingId()+course.getCourseName()
	//			+course.getInstructorName()+course.getDate()+student.getStatus();
	//		}

}


