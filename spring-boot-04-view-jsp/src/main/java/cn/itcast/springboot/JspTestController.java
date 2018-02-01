package cn.itcast.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/jsp")
@Controller
public class JspTestController {

	@RequestMapping("/test")
	public ModelAndView toPage() {
		ModelAndView mv = new ModelAndView("test");
		
		mv.addObject("msg", "数据来自后台。。。");
		
		return mv;
	}
}
