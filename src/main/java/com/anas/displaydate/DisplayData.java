package com.anas.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayData {
	@RequestMapping("/")
    
	public String Dashbord(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "Date.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String date = String.format("%s, the %s of %s, %s",
				new SimpleDateFormat("EEEE").format(new Date()),
                new SimpleDateFormat("d").format(new Date()),
                new SimpleDateFormat("MMMM").format(new Date()),
                new SimpleDateFormat("yyyy").format(new Date())
                );
         model.addAttribute("date",date);
		return "showdate.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat time = new SimpleDateFormat("h:m a");
        String showtime = time.format(new Date());
		model.addAttribute("time", showtime);
		return "showtime.jsp";
	}
	
	
}