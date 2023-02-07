package com.example.demo.controller;

import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookingDao;
import com.example.demo.dao.ConferenceDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Booking_data;
import com.example.demo.entity.Conference_Room;
import com.example.demo.entity.User;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.UnauthorizedException;
import com.example.demo.exception.UsedException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class BookingController {
	@Autowired
	BookingDao bookingRepository;
	@Autowired
	UserDao employeesRepository;
	@Autowired
	ConferenceDao conferenceRepository;
	@Autowired
	private JavaMailSender mailSenderObj;
	Date date = new Date();

	@PostMapping("/booking")
	public Booking_data saveall(@RequestBody Booking_data data) {
		Booking_data book = data;
		if (book.getTitle().isEmpty()) {
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
					Date start = id.get(i).getStartingtime();
					Date end = id.get(i).getEndtime();
					if ((starttime.after(start) || starttime.before(start))
							&& (starttime.after(end) || starttime.before(start) || starttime.equals(end))
							&& endtime.after(starttime)
							&& (endtime.after(end) || endtime.equals(start) || endtime.before(start))) {
						book.setCreatedby("SUPER_ADMIN");
						book.setCreatedtime(date);
						book.setUpdtaedby(null);
						book.setUpdatedtime(null);
					} else {
						throw new UsedException("Time slot is not Available");
					}
				}
			} else {
				throw new UsedException("Time is in past");

			}
		}

		else {
			throw new UnauthorizedException("Room not Found");
		}
		Booking_data bookingd = bookingRepository.save(data);
		sendmail1(bookingd);
		return bookingd;
	}

	private void sendmail1(Booking_data employee) {
		User emp = employee.getEmployee();
		long eid = emp.getEid();
		User employee1 = employeesRepository.findById(eid).get();
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
				.orElseThrow(() -> new ResourceNotFoundException("employee not exist wit id:" + bookingid));
		return ResponseEntity.ok(data);
	}

	@PutMapping("/bookingtitle/{bookingid}")
	public ResponseEntity<Booking_data> updateBooking(@PathVariable Long bookingid,
			@RequestBody Booking_data bookingdetails) {
		Booking_data data = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("booking not exist with id:" + bookingid));
		User eid = bookingdetails.getEmployee();
		long eid1 = eid.getEid();
		Booking_data empid = bookingRepository.findByemployee(eid);
		User empid1 = empid.getEmployee();
		long eid2 = empid1.getEid();
		if (eid1 == eid2) {
			data.setTitle(bookingdetails.getTitle());
			Booking_data updatedbooking = bookingRepository.save(data);
			return ResponseEntity.ok(updatedbooking);
		} else {
			throw new UnauthorizedException("employee id's are not matched ");
		}
	}

	@PutMapping("/booking/{bookingid}")
	public ResponseEntity<Booking_data> updateBookingtime(@PathVariable Long bookingid,
			@RequestBody Booking_data time) {
		Booking_data data = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("booking not exist with id:" + bookingid));
		Conference_Room roomid = time.getConference();
		List<Booking_data> id = bookingRepository.findByconference(roomid);

		User eid = time.getEmployee();
		long eid1 = eid.getEid();
		Booking_data empid = bookingRepository.findByemployee(eid);
		User empid1 = empid.getEmployee();
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
					data.setTitle(time.getTitle());
					data.setStartingtime(time.getStartingtime());
					data.setEndtime(time.getEndtime());
					data.setUpdatedtime(date);
					data.setUpdtaedby(null);
					Booking_data updatetime = bookingRepository.save(data);
					return ResponseEntity.ok(updatetime);

				} else {
					throw new UnauthorizedException(" employee id's are not matched :");
				}
			}

		}

		else {
			throw new UsedException("time slot not available:");
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}


	@DeleteMapping("/booking/{bookingid}")
	public ResponseEntity<Map<String, Boolean>> deleteBooking(@PathVariable Long bookingid) {
		Booking_data data = bookingRepository.findById(bookingid)
				.orElseThrow(() -> new ResourceNotFoundException("employee not exist wit id:" + bookingid));
		bookingRepository.delete(data);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}