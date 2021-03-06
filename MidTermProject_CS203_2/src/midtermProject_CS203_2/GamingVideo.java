package midtermProject_CS203_2;

public class GamingVideo extends Video implements GamingVideos {
	
	private String name;

	public GamingVideo() {
		super();
		this.name = " The Legend";
	}
	

	public GamingVideo(String name,String title, double durationInMinutes, int views, int likes, double watchTime) {
		super(title, durationInMinutes,views, likes,watchTime );
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String getGameName() {
		
		return "Game Name: "+ name ;  //super.toString();
	}


	@Override
	public String toString() {
		return"\nGameName: " +name + " "+ super.toString() ;
	}
	
	
}
