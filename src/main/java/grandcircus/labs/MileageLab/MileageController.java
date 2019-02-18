package grandcircus.labs.MileageLab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showHome() {	
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}


	@RequestMapping("/mileage-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showAddResult(@RequestParam("mpg") int num1, @RequestParam("glns") int num2) {
		double result = num1 * num2;
		
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
	
}
