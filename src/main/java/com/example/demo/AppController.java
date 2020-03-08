package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Place;
import com.example.demo.model.Subscribe;
import com.example.demo.model.User;
import com.example.demo.service.PlaceService;
import com.example.demo.service.SubscribeService;


@Controller
public class AppController {
	
	@Autowired
	private PlaceService placeService;
	
	@Autowired
	private com.example.demo.service.UserService userService;
	
	@Autowired
	private SubscribeService subsService;

	@RequestMapping("/")
	public String indexpage()
	{
		return "demo";
	}
	
	@RequestMapping("/subscribe")
	public String subscribe()
	{
		return "demo";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam String place, HttpServletRequest req)
	{
		req.setAttribute("place", placeService.findByPlace(place));
		return "demo";
	}
	
	@RequestMapping("login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/loginuser")
	public String loginuser(@ModelAttribute User user, HttpServletRequest req)
	{
		if(userService.findByEmailAndPassword(user.getEmail(), user.getPassword()) != null)
		{
			
			return "admin";
		}
		else {
		return "login";
		}
	}
	
	@RequestMapping("/add")
	public String viewform()
	{
		return "addcity";
	}
	
	@PostMapping("/savemydata")
	public String savemydata(@ModelAttribute Place place, BindingResult bindingresult, HttpServletRequest request)
	{

		
		placeService.saveMyCity(place);
		return "admin";
	}
	
	@RequestMapping("savemyemail")
	public String savemyemail(@ModelAttribute Subscribe subs, BindingResult bindingresult, HttpServletRequest request)
	{
		subsService.saveMyEmail(subs);
		return "demo";
	}
	
	@RequestMapping("all")
	public String allplaces(HttpServletRequest req)
	{
		req.setAttribute("places", placeService.showAllPlaces());
		return "allplaces";
	}
	
	@RequestMapping("/editplace")
	public String editUser(@RequestParam String city, HttpServletRequest req) {
		req.setAttribute("place", placeService.editPlace(city));
		return "updateplace";
	}
	
	@RequestMapping("searchplace")
	public String searchPlace(@RequestParam String city, HttpServletRequest req) {
		req.setAttribute("place", placeService.findByPlace(city));
		return "search";
	}
	
	@RequestMapping("othercities")
	public String othercities(HttpServletRequest req) {
		req.setAttribute("places", placeService.showAllPlaces());
		return "othercities";
	}
	
	@RequestMapping("/formupload")
	public String formupload(HttpServletRequest req) {
		return "formupload";
	}
	
	@PostMapping("/uploadimage")
	public String uploadimage(@RequestParam("demoimage") MultipartFile demoimage ) {
		String returnvalue = "start";
		try {
			placeService.saveImage(demoimage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			returnvalue = "error";
		}
		return returnvalue;
	}
	
}
