package com.location_web_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.location_web_app.entity.location.Location;
import com.location_web_app.repositories.LocationRepository;

@Controller
public class locationcontroller {
	@Autowired
	 private LocationRepository locationRepo;
	@Autowired
	private Location location;
	@RequestMapping("/showLocation")
	public String showLocation() {
		return "showLocation";
	}
	@RequestMapping("/saveLoc")
	public String saveLoc(@RequestParam("id") Long id,@RequestParam("code") Long code,@RequestParam("name") String name,@RequestParam("type") String type,ModelMap modelMap) {
		System.out.println(id);
		System.out.println(code);
		System.out.println(name);
		System.out.println(type);
//		System.out.println(location.getId());
//		System.out.println(location.getCode());
//		System.out.println(location.getName());
//		System.out.println(location.getType();
	modelMap.addAttribute("msg", "location saved!!");
	return "showLocation";
}
	@RequestMapping("/getLocation")
	public String getLocation() {
		Iterable<com.location_web_app.entity.location> findAll = locationRepo.findAll();
		return "getLocation";
	}
}
