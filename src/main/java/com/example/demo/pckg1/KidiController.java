package com.example.demo.pckg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class KidiController {
	
	@Autowired
	Parent_repository repoParent; 
	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	KidRepository kidRepo;
	@Autowired
	CategoryRepository categoryRepo;
	@Autowired
	MeetingRepository meetingRepo;
	
	@PostMapping("/addNewParent")
	public Parent addNewParent (@RequestBody Parent parent){
		return repoParent.addNewParent(parent);
	}
	
	@GetMapping("/getAllUsers")
	public List <Parent> getAllparents (){
		return  repoParent.getAllParents();
	}
	
	@GetMapping ("/getAllActiveUsers")
	public List<Parent> getAllActiveParents(){
		return repoParent.getAllActiveparents();
	}
	@GetMapping("/getSpecificParent/{email}/{password}")
	public Parent getSpecificParent (@PathVariable String email,@PathVariable String password) {
		return repoParent.getSpecificParent(email, password);
	}
	
/*	@PutMapping("/addNewKid/{email}")
	public Parent addNewKid (@PathVariable String email,@RequestBody Kid kid) {
		return repoParent.addNewKid(email, kid);
		
	}*/
	@GetMapping ("/GetAllKidsOfParent/{id}")
	public List<Kid> GetAllKidsOfParent (@PathVariable String id) {
		return repoParent.GetAllKidsOfParent(id);
	}
	@PutMapping("/changeEmail/{id}/{newEmail}")
	public Parent changeEmail (@PathVariable String id,@PathVariable String newEmail) {
		return repoParent.changeEmail(id, newEmail);
	}
	@DeleteMapping ("/deleteParent/{id}")
	public List<Parent> deleteParent (@PathVariable String id){
		return repoParent.deleteParent(id);
	}
	@Autowired
	IkidRepository kRep;
	    //----------------------initiate kid
	
	    //addkids
		public void addKids() throws ParseException {
			
			String [] names = {"Michael","Robert","Tyler","Noah","Emma",
					"Susan","Emily","Lauren","Michael","Mia",};
			
			
			 Date toDate1=new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2018");
			 Date toDate2=new SimpleDateFormat("dd/MM/yyyy").parse("16/12/2016");
			 Date toDate3=new SimpleDateFormat("dd/MM/yyyy").parse("17/11/2020");
			 Date toDate4=new SimpleDateFormat("dd/MM/yyyy").parse("04/05/2017");
			 Date toDate5=new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2018");
			 Date toDate6=new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2018");
			 Date toDate7=new SimpleDateFormat("dd/MM/yyyy").parse("16/09/2019");
			 Date toDate8=new SimpleDateFormat("dd/MM/yyyy").parse("28/04/2017");
			 Date toDate9=new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2020");
			 Date toDate10=new SimpleDateFormat("dd/MM/yyyy").parse("18/08/2019");
			 
			 
			 Date[] dates={toDate1,toDate2,toDate3,toDate4,toDate5,toDate6,toDate7,toDate8,toDate9,toDate10};
			 
			 
			 Date aDate1=new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021");
			 Date aDate2=new SimpleDateFormat("dd/MM/yyyy").parse("16/12/2021");
			 Date aDate3=new SimpleDateFormat("dd/MM/yyyy").parse("17/11/2021");
			 Date aDate4=new SimpleDateFormat("dd/MM/yyyy").parse("04/05/2021");
			 Date aDate5=new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2021");
			 Date aDate6=new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021");
			 Date aDate7=new SimpleDateFormat("dd/MM/yyyy").parse("16/09/2021");
			 Date aDate8=new SimpleDateFormat("dd/MM/yyyy").parse("28/04/2021");
			 Date aDate9=new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2021");
			 Date aDate10=new SimpleDateFormat("dd/MM/yyyy").parse("18/08/2021");
			 
			 Date[] activeDates={aDate1,aDate2,aDate3,aDate4,aDate5,aDate6,aDate7,aDate8,aDate9,aDate10};

			 Gender[] genders = {Gender.Boy,Gender.Girl,Gender.NotRelevant, Gender.Girl, Gender.NotRelevant,
					 Gender.Girl, Gender.Boy, Gender.Boy, Gender.Girl,Gender.NotRelevant}; 
			 
			
		    for (int i=0;i<100;i++){
	            int j = (int)(Math.random() * 10);
	            Kid kid = new Kid(names[j],dates[j],genders[j]);
	            kid.setActiveDate(activeDates[j]);
	            kidRepo.addNewKid(kid);
	        }	
			
		}
	
	
	    //----------------------initiate parent
		
		//addparents
		public void addParents() throws ParseException {
			
			String[] firsts ={ "Maya", "Robber", "Mady", "John","Lanter",
	                "Stephan","Katie","Reena", "Sandra", "Danny"};
	       
			String[] lasts ={ "Roster","Mane","Braithwait", "Poler", "Stanly","Reef","Smith","Brown",
					"Miller", "Garcia"};
	        
			String[] emails ={ "master12@gmail.com", "Loly.12@outlook.com", "monn-the-light@hotmail.com",  "SandraPol.99@yahoo.com",
	                "mane-1498@hotmail.co.il","the.best99@gmail.com", "whatever@outlook.com", "intime.00@hotmail.com",
	                "asd0980@outlook.com", "alter.20@hotmail.com"};
	        
			String[] passwords ={ "notbad33", "@lonelyone", "@a102030",  "##sdsd", "S1234!","moonLight.as"
					, "zxczxczxc","lol9090", "ifnot11" ,"techone99"};
	        
	        
	        Date toDate1=new SimpleDateFormat("dd/MM/yyyy").parse("01/08/2021");
	        Date toDate2=new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2021");
	        Date toDate3=new SimpleDateFormat("dd/MM/yyyy").parse("26/08/2021");
	        Date toDate4=new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2021");
	        Date toDate5=new SimpleDateFormat("dd/MM/yyyy").parse("14/05/2021");
	        Date toDate6=new SimpleDateFormat("dd/MM/yyyy").parse("05/03/2021");
	        Date toDate7=new SimpleDateFormat("dd/MM/yyyy").parse("21/07/2021");
	        Date toDate8=new SimpleDateFormat("dd/MM/yyyy").parse("17/08/2021");
	        Date toDate9=new SimpleDateFormat("dd/MM/yyyy").parse("25/08/2021");
	        Date toDate10=new SimpleDateFormat("dd/MM/yyyy").parse("11/04/2021");
	        
	        Date[] dates={toDate1,toDate2,toDate3,toDate4,toDate5,toDate6,toDate7,toDate8,toDate9,toDate10};
	       
	        
	        for (int i=0;i<40;i++){
	            int j = (int)(Math.random() * 10);
	            Parent parent = new Parent(firsts[j],lasts[j],emails[j],passwords[j]);
	            parent.setActiveDate(dates[j]);
	            repoParent.addNewParent(parent);
	        }	
		}
		
		//--------------------initiate category 
		
		//addcategories
		public void addCategories() {
					
					
					Category category1 = new Category("Arts", "arts_image.png");
					Category category2 = new Category("Animal", "animals_image.png");
					Category category3 = new Category("Science", "science_image.png");
					Category category4 = new Category("Space", "space_image.png");
					
					categoryRepo.addCategory(category1);
					categoryRepo.addCategory(category2);
					categoryRepo.addCategory(category3);
					categoryRepo.addCategory(category4);
					
				}
		
		//----------------------initiate course
		
		//addcourses
		public void addCourses() throws ParseException {
			
			//(String name, Date startDateTime,Date finishDateTime, Day day, String categoryId) 
			
			
			String [] names = {"Big Bang","SkillUp","Practice to Perfect","Strive Training","Road-to-Success","Alpha",
					"Limitless Horizons","Get it","Train Away","The Know"};
			
			
			Date sDate1=new SimpleDateFormat("dd/MM/yyyy").parse("22/08/2021");
	        Date sDate2=new SimpleDateFormat("dd/MM/yyyy").parse("23/08/2021");
	        Date sDate3=new SimpleDateFormat("dd/MM/yyyy").parse("16/05/2021");
	        Date sDate4=new SimpleDateFormat("dd/MM/yyyy").parse("21/08/2021");
	        Date sDate5=new SimpleDateFormat("dd/MM/yyyy").parse("17/04/2021");
	        Date sDate6=new SimpleDateFormat("dd/MM/yyyy").parse("19/07/2021");
	        Date sDate7=new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2021");
	        Date sDate8=new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2021");
	        Date sDate9=new SimpleDateFormat("dd/MM/yyyy").parse("30/06/2021");
	        Date sDate10=new SimpleDateFormat("dd/MM/yyyy").parse("26/07/2021");
	        
			Date[] start = {sDate1,sDate2,sDate3,sDate4,sDate5,sDate6,sDate7,sDate8,sDate9,sDate10};
			
			
			Date fDate1=new SimpleDateFormat("dd/MM/yyyy").parse("14/09/2021");
	        Date fDate2=new SimpleDateFormat("dd/MM/yyyy").parse("25/10/2021");
	        Date fDate3=new SimpleDateFormat("dd/MM/yyyy").parse("14/10/2021");
	        Date fDate4=new SimpleDateFormat("dd/MM/yyyy").parse("09/12/2021");
	        Date fDate5=new SimpleDateFormat("dd/MM/yyyy").parse("03/12/2021");
	        Date fDate6=new SimpleDateFormat("dd/MM/yyyy").parse("10/11/2021");
	        Date fDate7=new SimpleDateFormat("dd/MM/yyyy").parse("16/09/2021");
	        Date fDate8=new SimpleDateFormat("dd/MM/yyyy").parse("02/10/2021");
	        Date fDate9=new SimpleDateFormat("dd/MM/yyyy").parse("22/011/2021");
	        Date fDate10=new SimpleDateFormat("dd/MM/yyyy").parse("03/09/2021");
			
	        Date[] finish = {fDate1,fDate2,fDate3,fDate4,fDate5,fDate6,fDate7,fDate8,fDate9,fDate10};
	 		
			Day[] days = {Day.Friday, Day.Monday, Day.Saturday, Day.Sunday, Day.Thursday, Day.Tuesday, Day.Wednesday,
					Day.Monday, Day.Wednesday, Day.Thursday};
			
			
			List<Category> categories = categoryRepo.getAllCategories();
			String[] categotyId = {categories.get(0).getId(),
					categories.get(1).getId(),
					categories.get(2).getId(),
					categories.get(3).getId(),
					categories.get(0).getId(),
					categories.get(1).getId(),
					categories.get(2).getId(),
					categories.get(3).getId(),
					categories.get(0).getId(),
					categories.get(1).getId(),
					categories.get(2).getId(),
					};
			
			 for (int i=0;i<60;i++){
		            int j = (int)(Math.random() * 10);
		            Course course = new Course(names[j],start[j],finish[j], days[j], categotyId[j]);
		            courseRepo.addANewCourse(course);
		        }	
			 
		}
		
		
		//attachkidtocourses
		public void attachKidToCourse() {
			ArrayList<Kid> kids = kidRepo.getAllKids();
			for(Kid k: kids) {
				if(k.getActiveCourses().isEmpty()) {
					for (int i=0;i<2;i++){
						int j = (int)(Math.random() * 10);
						kidRepo.addCourseToKid(k.getId(), courseRepo.getAllCourses().get(j).getID());
						courseRepo.getAllCourses().get(j).getKidsIDs().add(k.getId());
						//System.out.print(categoryRepo.getCategoryById(courseRepo.getAllCourses().get(j).getCategoryId()).getName() + "==  " +courseRepo.getAllCourses().get(j).getKidsIDs().size());
					}
				}	
			}
		}
		
	
		//----------------------initiate meetings
	   //addmeetings
	   public void addMeetings() throws ParseException {
			
			String[] courseName = {"StarCode","MonkeyClimb","ForrestMaze","BicassoLands","ElectricPath","ModernValues","Landscape",
					"CoodingColors","Spaceships","AlarmClock","ShiningSpaces","CatsFollows",
					"StarCode","MonkeyClimb","ForrestMaze","BicassoLands","ElectricPath","ModernValues","Landscape","CatsFollows"};
 			
			 Date Date1=new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2021");
			 Date Date2=new SimpleDateFormat("dd/MM/yyyy").parse("16/08/2021");
			 Date Date3=new SimpleDateFormat("dd/MM/yyyy").parse("17/08/2021");
			 Date Date4=new SimpleDateFormat("dd/MM/yyyy").parse("04/08/2021");
			 Date Date5=new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2021");
			 Date Date6=new SimpleDateFormat("dd/MM/yyyy").parse("21/08/2021");
			 Date Date7=new SimpleDateFormat("dd/MM/yyyy").parse("22/08/2021");
			 Date Date8=new SimpleDateFormat("dd/MM/yyyy").parse("23/84/2021");
			 Date Date9=new SimpleDateFormat("dd/MM/yyyy").parse("19/08/2021");
			 Date Date10=new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2021");
			 Date Date11=new SimpleDateFormat("dd/MM/yyyy").parse("17/06/2021");
			 Date Date12=new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2021");
			 Date Date13=new SimpleDateFormat("dd/MM/yyyy").parse("16/06/2021");
			 Date Date14=new SimpleDateFormat("dd/MM/yyyy").parse("17/04/2021");
			 Date Date15=new SimpleDateFormat("dd/MM/yyyy").parse("04/03/2021");
			 Date Date16=new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2021");
			 Date Date17=new SimpleDateFormat("dd/MM/yyyy").parse("04/08/2021");
			 Date Date18=new SimpleDateFormat("dd/MM/yyyy").parse("17/08/2021");
			 Date Date19=new SimpleDateFormat("dd/MM/yyyy").parse("25/08/2021");
			 Date Date20=new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2021");
			 Date Date21=new SimpleDateFormat("dd/MM/yyyy").parse("18/01/2021");
			 
			 
			 Date[] activeDates={Date1,Date2,Date3,Date4,Date5,Date6,Date7,Date8,Date9,Date10,
					 Date11,Date12,Date13,Date14,Date15,Date16,Date17,Date18,Date19,Date20,Date21};
			 
			 boolean[] trueOrFlase = {false,true,true,false,true,false,true,false,true,false,false,true,false,true,false,true,false,
					 false,true,false,true};
			 
			 double[] times = {1.75, 2.45, 2.00, 1.25, 1.45, 1.00, 1.35, 0.55, 2.15, 1.10, 3.00, 1.00, 2.45
					 , 1.15, 2.00, 2.30, 1.30, 1.25, 0.45, 1.45};
			 
			 for(int i=0; i<50; i++) {
				 
				 
				 int j = (int)(Math.random() * 20);
		            Meeting meeting = new Meeting(courseName[j],activeDates[j]);
		            meeting.setCancelled(trueOrFlase[j]);
		            meeting.setActualMeetingDuration(times[j]);
		            meetingRepo.addNewMeeting(meeting);
				 
			 }
		}
		
	@PostMapping("/initiateRepository")
	public ResponseEntity<String> intiate() throws ParseException {

		if(kidRepo.getAllKids().isEmpty())
			addKids();
		
		if(repoParent.getAllParents().isEmpty())
			addParents();
		
		if(categoryRepo.getAllCategories().isEmpty())
			addCategories();
		
		if(courseRepo.getAllCourses().isEmpty())
			addCourses();
		
		if(meetingRepo.getAllMeetings().isEmpty()) {
			addMeetings();
		}
		
		attachKidToCourse();
		
		
		
		return new ResponseEntity<>("initiateRepository", HttpStatus.OK);
	}
	
	@PostMapping("/AddNewKid")
	public Kid addNewKid(@RequestBody Kid kid) {
		return kidRepo.addNewKid(kid);
	}
	
	@GetMapping("/getAllKids")
	public ArrayList<Kid> getAllKids(){
		return kidRepo.getAllKids();
	}
	
	@DeleteMapping("/clearContent")
	public void clearContent() {
		kidRepo.clearAllDocuments();
	}
	
	@GetMapping("/getAllMeetings")
	public ArrayList<Meeting> getAllMeetings(){
		return meetingRepo.getAllMeetings();
	}
	
	//------------------------------- COURSE ----------------------------------------
	@PostMapping("addNewCourse")
	public List<Course> addCourse(Course course) {
		return courseRepo.addANewCourse(course);
	}
	
	
	//------------------------------- CATEGORY ----------------------------------------

	@PostMapping("addNewCategory")
	public List<Category> addNewCategory(Category category) {
		return categoryRepo.addCategory(category);
	}
	
	//-------------------------- FOR STATISTICS ----------------------------------------
	@GetMapping("/getNewKids/{period}")
	public HashMap<String,Integer> getNewKids(@PathVariable int period){
		return kidRepo.getNewKids(period);
	}
	@GetMapping("/getNewParents/{period}")
	public HashMap<String,Integer> getNewParents(@PathVariable int period){
		return repoParent.getNewParents(period);
	}
	
	@GetMapping("/getKidsCountByCategory/{period}")
	public HashMap<String,Integer> getKidsCountByCategory(@PathVariable int period){
		return categoryRepo.getKidsCountByCategory(period);
	}
	
	@GetMapping("/getActivityTime/{period}")
	public HashMap<String,Double> getActivityTime(@PathVariable int period){
		return meetingRepo.getActivityTime(period);
	}
	

	
	
	
	
}