package com.auribises.session19;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auribises.model.News;

@RestController // -> text/json :)
@RequestMapping(path = "/news")
public class NewsWebService {

	@GetMapping("/v1")
	public HashMap<String, ArrayList<News>> getNews(){
		
		HashMap<String, ArrayList<News>> newsMap = new HashMap<String, ArrayList<News>>();
		
		News n1 = new News("Reuters", 
				"Wall Street set for second day of losses; US 10-year yield near 2% By Reuters",
				"Wall Street set for second day of losses; U.S. 10-year yield near 2%");
		
		News n2 = new News("bloomberg",
				"Fed Doesn't Yet Favor a Half-Point Hike or an Emergency Move - Bloomberg",
				"To continue, please click the box below to let us know you're not a robot.");
		
		News n3 = new News("Tom Warren",
				"SSD prices could spike after Western Digital loses 6.5 billion",
				"Western Digital says it has lost at least 6.5 billion gigabytes of NAND flash storage.");
		
		News n4 = new News("CNN",
				"France announces plans to build up to 14 nuclear reactors - CNN",
				"France has announced plans to build up to 14 new nuclear reactors in a move that could help reduce greenhouse");
		
		News n5 = new News("Ryan Browne",
				"Delivery Hero CEO apologizes to investors after 30% stock plunge, vows to stay the course - CNBC",
				"Delivery Hero CEO Niklas Östberg said he's truly sorry for all shareholders");
		
		ArrayList<News> news = new ArrayList<News>();
		news.add(n1);
		news.add(n2);
		news.add(n3);
		news.add(n4);
		news.add(n5);
		
		newsMap.put("usa", news);
		
		return newsMap;
	}
	
}

// Assignment: In the same project create a web service which returns the list of Users without passwords :)
//			   i.e. return users as JSON
