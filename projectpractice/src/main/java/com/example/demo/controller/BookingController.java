package com.example.demo.controller;


import java.util.Date;
import java.util.List;

import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.BadRequestException;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Exception.UnauthorizedException;
import com.example.demo.Exception.UsedException;
import com.example.demo.model.Booking_data;
import com.example.demo.model.Conference_Room;
import com.example.demo.model.Employees;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.ConferenceRepository;
import com.example.demo.repository.EmployeesRepository;

@RestController
public class BookingController {
	@Autowired
	private JavaMailSender mailSenderObj;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	EmployeesRepository employeesRepository;
	@Autowired
	ConferenceRepository conferenceRepository;
	Date date = new Date();

	@PostMapping("/booking")
	public Booking_data saveall(@RequestBody Booking_data data) {
		Booking_data book = data;
		if(book.getTitle().isEmpty()) {
			throw new BadRequestException("Title can't be empty");
		}
		
		Conference_Room roomid = book.getConference();
		List<Booking_data> id = bookingRepository.findByconference(roomid);
		Date starttime = book.getStartingtime();
		Date endtime = book.getEndtime();
		if (roomid != null) {
			System.out.println(1);
			if (starttime.after(date) && endtime.after(date) && endtime.after(starttime)) {
		for (int i = 0; i < id.size(); i++) {
			Date start=	id.get(i).getStartingtime();
			Date end=	id.get(i).getEndtime();
			if ((starttime.after(start) || starttime.before(start))
		&& (starttime.after(end) || starttime.before(start) || starttime.equals(end)) && endtime.after(starttime)
		&& (endtime.after(end) || endtime.equals(start) || endtime.before(start))) {		
		book.setCreatedby("SUPER_ADMIN");
		book.setCreatedtime(date);
		book.setUpdtaedby(null);
		book.setUpdatedtime(null);	
			}
		else {
			throw new UsedException("Time slot is not Available");
		}
	}
		} else {
			throw new ResourceNotFoundException("Time is in past");

		}
	}

	else {
		throw new ResourceNotFoundException("Room not Found");
	} 
		Booking_data bookingd = bookingRepository.save(data);
		sendmail1(bookingd);
		return bookingd;
		}
		
	private void sendmail1(Booking_data employee) {
		Employees emp = employee.getEmployee();
		long eid = emp.getEid();
		Employees employee1 = employeesRepository.findById(eid).get();
		Conference_Room book = employee.getConference();
		long rid = book.getRoomid();
		Conference_Room room = conferenceRepository.findById(rid).get();
		final String emailToRecipient = employee1.getEmail();
		final String emailSubject = "Invitation Mail";
		final String emailMessage1 = "<html> <body> <p>Hi All,</p><p>You have been Invited to this Meeting" + "<br><br>"
				+ "<table border='1' width='300px' style='text-align:center;font-size:20px;'>"
				+ "<tr><td>Title</td><td>" + employee.getTitle() + "</td></tr><tr><td>Room</td><td>" + room.getRoomid()
				+ "</td></tr><tr><td>Start time</td><td>" + employee.getStartingtime()
				+ "</td></tr><tr><td>End time</td><td>" + employee.getEndtime() + "</table>" + " <h2>Invited By</h2>"
				+ "<p>Employee Id : " + employee1.getEid() + "</p>" + "<p>Name : " + employee1.getFirstname() + ""
				+ employee1.getLastname() + "</p>" + "<br>" + "<p>Hope you will attend in this meeting</p>" + "<br>"
				+ "<p>Thanks and regards</p>" + "<p> " + employee1.getFirstname() + "" + employee1.getLastname()
				+ "</p>" + "<p>StratApps</p></body></html>";
		mailSenderObj.send(new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMsgHelperObj.setTo(emailToRecipient);
				mimeMsgHelperObj.setText(emailMessage1, true);
				mimeMsgHelperObj.setSubject(emailSubject);
			}
		});
	}

	@GetMapping("/booking")
	public List<Booking_data> getall(Booking_data data) {
		return bookingRepository.findAll();
	}

	@GetMapping("/booking/{bookingid}")
	public ResponseEntity<Booking_data> getBookingById(@PathVariable Long bookingid) {
		Booking_data data = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("booking not exist wit id:" + bookingid));
		return ResponseEntity.ok(data);
	}

	@PutMapping("/booking/{bookingid}")
	public ResponseEntity<Booking_data> updateBooking(@PathVariable Long bookingid,
			@RequestBody Booking_data bookingdetails) {
		Booking_data data = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("booking not exist with id:" + bookingid));
		Employees eid = bookingdetails.getEmployee();
		long eid1 = eid.getEid();
		Booking_data empid = bookingRepository.findByemployee(eid);
		Employees empid1 = empid.getEmployee();
		long eid2 = empid1.getEid();
		if (eid1 == eid2) {
			data.setTitle(bookingdetails.getTitle());
			Booking_data updatedbooking = bookingRepository.save(data);
			return ResponseEntity.ok(updatedbooking);
		} else {
			throw new UnauthorizedException("employee id's are not matched");
		}
	}

	@PutMapping("/bookingtime/{bookingid}")
	public ResponseEntity<Booking_data> updateBookingtime(@PathVariable Long bookingid,
			@RequestBody Booking_data time) {
		Booking_data data = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("booking not exist with id:" + bookingid));
		Conference_Room roomid = time.getConference();
		List<Booking_data> id = bookingRepository.findByconference(roomid);

		Employees eid = time.getEmployee();
		long eid1 = eid.getEid();
		Booking_data empid = bookingRepository.findByemployee(eid);
		Employees empid1 = empid.getEmployee();
		long eid2 = empid1.getEid();
		Date starttime = time.getStartingtime();
		Date endtime = time.getEndtime();

		if (eid1 == eid2) {
			for (int i = 0; i < id.size(); i++) {
				Date start = id.get(i).getStartingtime();
				Date end = id.get(i).getEndtime();
				if ((starttime.after(start) || starttime.before(start))
						&& (starttime.after(end) || starttime.before(start) || starttime.equals(end)) && endtime.after(starttime)
						&& (endtime.after(end) || endtime.equals(start) || endtime.before(start))) {		
					data.setStartingtime(time.getStartingtime());
					data.setEndtime(time.getEndtime());
					data.setUpdatedtime(date);
					data.setUpdtaedby(null);
					Booking_data updatetime = bookingRepository.save(data);
					return ResponseEntity.ok(updatetime);

				} else {
					throw new UsedException("time slot not available:");
				}
			}

		}

		else {
			throw new UnauthorizedException(" employee id's are not matched :");
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}



	@DeleteMapping("/booking/{bookingid}")
	public String deleteBook(@PathVariable Long bookingid) {
		bookingRepository.deleteById(bookingid);
		return "yes";
	}

	@GetMapping("/emp/{eid}")
	public Booking_data getEmployeeById(@PathVariable Employees eid) {
		Booking_data data = bookingRepository.findByemployee(eid);
		return data;
	}

}