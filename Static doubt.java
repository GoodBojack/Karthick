class Participant {
    //Implement your code here
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;
    private static int counter;
    
    static{
        counter = 10000;
    }

    
    Participant(String name,long contactNumber,String city){
        this.counter = counter;
        this.registrationId = registrationId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
        counter++;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int counter){
        this.counter = counter;
    }
    public String getRegistrationId(){
        return registrationId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    
}

class Tester {

	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is D"+participant.getCounter());
		}

	}
} 
